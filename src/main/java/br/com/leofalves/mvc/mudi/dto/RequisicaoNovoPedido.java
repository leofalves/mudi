package br.com.leofalves.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

import br.com.leofalves.mvc.mudi.model.Pedido;

public class RequisicaoNovoPedido {
	
	@NotBlank
	private String productName;
	
	@NotBlank
	private String productUrl;
	
	@NotBlank
	private String imageUrl;
	
	private String description;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductUrl() {
		return productUrl;
	}
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setDescription(this.getDescription());
		pedido.setProductName(this.getProductName());
		pedido.setImageUrl(this.getImageUrl());
		pedido.setProductUrl(this.getProductUrl());
		return pedido;
	}

}
