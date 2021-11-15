package br.com.leofalves.mvc.mudi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.leofalves.mvc.mudi.model.Pedido;

@Repository
public class PedidoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Pedido> recuperaTodosPedidos(){
		//entityManager.createQuery("select p from Pedido p", Pedido.class);
		//List<Pedido> pedidos = entityManager.createQuery("select p from Pedido p", Pedido.class).getResultList();
		
		Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
		List<Pedido> pedidos = query.getResultList();
		return pedidos;

	}


}
