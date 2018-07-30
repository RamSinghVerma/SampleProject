package com.myproject.FirstSpringMVC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PurchaseOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int purchaseId;
	private int purchaseProdId;
	private String purchaseInvoiceNo;
	private float purchaseRate;
	private int purchaseQty;
	private float purchaseDisc;
	private float purchaseTax;
	private float purchaseMrp;
	@ManyToOne
	@JoinColumn(name="prodId",nullable=false)
	private Product product;

	
	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public int getPurchaseProdId() {
		return purchaseProdId;
	}

	public void setPurchaseProdId(int purchaseProdId) {
		this.purchaseProdId = purchaseProdId;
	}

	public String getPurchaseInvoiceNo() {
		return purchaseInvoiceNo;
	}

	public void setPurchaseInvoiceNo(String purchaseInvoiceNo) {
		this.purchaseInvoiceNo = purchaseInvoiceNo;
	}

	public float getPurchaseRate() {
		return purchaseRate;
	}

	public void setPurchaseRate(float purchaseRate) {
		this.purchaseRate = purchaseRate;
	}

	public int getPurchaseQty() {
		return purchaseQty;
	}

	public void setPurchaseQty(int purchaseQty) {
		this.purchaseQty = purchaseQty;
	}

	public float getPurchaseDisc() {
		return purchaseDisc;
	}

	public void setPurchaseDisc(float purchaseDisc) {
		this.purchaseDisc = purchaseDisc;
	}

	public float getPurchaseTax() {
		return purchaseTax;
	}

	public void setPurchaseTax(float purchaseTax) {
		this.purchaseTax = purchaseTax;
	}

	public float getPurchaseMrp() {
		return purchaseMrp;
	}

	public void setPurchaseMrp(float purchaseMrp) {
		this.purchaseMrp = purchaseMrp;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
