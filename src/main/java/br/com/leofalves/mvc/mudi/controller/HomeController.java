package br.com.leofalves.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.leofalves.mvc.mudi.model.Pedido;
import br.com.leofalves.mvc.mudi.repository.PedidoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private PedidoRepository repository;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		List<Pedido> pedidos = repository.recuperaTodosPedidos();
		
		/*Pedido pedido1 = new Pedido();
		pedido1.setProductName("Echo Dot (4ª geração): Smart Speaker com Relógio e Alexa - Cor Branca");
		pedido1.setProductPriceDeal(BigDecimal.valueOf(474,05));
		pedido1.setDeliveryDate(LocalDate.now());
		pedido1.setImageUrl("https://m.media-amazon.com/images/I/61ETk5wZePL._AC_SL1000_.jpg");
		pedido1.setProductUrl("https://www.amazon.com.br/Novo-Echo-Dot-com-rel%C3%B3gio/dp/B084J4WP6J/?_encoding=UTF8&pd_rd_w=L7fmT&pf_rd_p=502af671-57ab-4f77-842d-676f1e4cc3c2&pf_rd_r=6QCHXTJ5YR8E6FCXKAAC&pd_rd_r=6cb2eebc-ef35-4629-a98a-085690c4808d&pd_rd_wg=s4VIQ&ref_=pd_gw_unk");
		
		Pedido pedido2 = new Pedido();
		pedido2.setProductName("Echo Show 8 (1ª Geração): Smart Speaker com tela de 8\" e Alexa - Cor Preta");
		pedido2.setProductPriceDeal(BigDecimal.valueOf(854,55));
		pedido2.setDeliveryDate(LocalDate.now());
		pedido2.setImageUrl("https://m.media-amazon.com/images/I/51uUR1j-kfL._AC_SL1000_.jpg");
		pedido2.setProductUrl("https://www.amazon.com.br/Echo-Show-8-Smart-Speaker-Alexa/dp/B07SG8F1QF/ref=p13n_ds_purchase_sim_1p_dp_desktop_2/140-4584040-2716217?pd_rd_w=6sGiy&pf_rd_p=bcb2ee29-2818-4fa9-a787-3b071b070ab8&pf_rd_r=EPW9JX9Q4X4NCX99XF1Q&pd_rd_r=05a778f5-91de-4ed9-9e01-44da0aea6fec&pd_rd_wg=9HiJS&pd_rd_i=B07SG8F1QF&psc=1");
		*/
		
		//List<Pedido> pedidos = new ArrayList<Pedido>();
		//pedidos.add(pedido1);		
		//pedidos.add(pedido2);
		
		// Envia a informação para a View
		model.addAttribute("pedidos", pedidos);
				
		// Envia para a view home.html
		return "home";
	}

}
