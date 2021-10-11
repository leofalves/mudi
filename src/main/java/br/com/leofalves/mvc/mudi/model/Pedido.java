package br.com.leofalves.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

	private String productName;
	private BigDecimal productPriceDeal;
	private LocalDate deliveryDate;
	private String productUrl;
	private String imageUrl;
	private String description;
	
	
	public Pedido() {
	}

	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public BigDecimal getProductPriceDeal() {
		return productPriceDeal;
	}
	
	public void setProductPriceDeal(BigDecimal productPriceDeal) {
		this.productPriceDeal = productPriceDeal;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
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
	
}
