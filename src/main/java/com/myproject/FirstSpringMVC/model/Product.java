package com.myproject.FirstSpringMVC.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prodId;
	@NotEmpty
	private String prodName;
	private int typeId;
	@OneToMany
	private Set<PurchaseOrder> purchaseOrder;
	@OneToMany
	private Set<SaleOrder> saleOrder;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public Set<PurchaseOrder> getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(Set<PurchaseOrder> purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public Set<SaleOrder> getSaleOrder() {
		return saleOrder;
	}

	public void setSaleOrder(Set<SaleOrder> saleOrder) {
		this.saleOrder = saleOrder;
	}
	
}
