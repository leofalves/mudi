package br.com.leofalves.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.leofalves.mvc.mudi.model.Pedido;
import br.com.leofalves.mvc.mudi.model.StatusPedido;
import br.com.leofalves.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping
	public String home(Model model) {
		
		List<Pedido> pedidos = pedidoRepository.findAll();		
		model.addAttribute("pedidos", pedidos);
		return "home";
	}

	
	@GetMapping("/{status}")
	public String statusFilter(@PathVariable String status, Model model) {		
		List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.valueOf(status.toUpperCase()));
		model.addAttribute("pedidos", pedidos);
		model.addAttribute("status", status.toLowerCase());
		return "home"; 
	}
	
	//Se informar um status que não existe, redireciona para /home
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}
	
	/*
	@GetMapping("/{status}")
	public ModelAndView statusFilter(@PathVariable String status) {
		
		List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.valueOf(status.toUpperCase()));
		ModelAndView mv = new ModelAndView("home"); //import org.springframework.web.servlet.ModelAndView;
		mv.addObject("pedidos", pedidos);
		return mv; 
	}
	*/

	
}
