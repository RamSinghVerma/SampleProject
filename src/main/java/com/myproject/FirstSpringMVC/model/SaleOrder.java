package com.myproject.FirstSpringMVC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
@Entity
public class SaleOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int saleId;
	private int saleProdId;
	@ManyToOne
	@JoinColumn(name="invoiceNo",nullable=false)
	private Invoice saleInvoiceNo;
	private float saleRate;
	private int saleQty;
	private float saleDisc;
	private float saleTax;
	private float saleMrp;
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int getSaleProdId() {
		return saleProdId;
	}
	public void setSaleProdId(int saleProdId) {
		this.saleProdId = saleProdId;
	}
	public Invoice getSaleInvoiceNo() {
		return saleInvoiceNo;
	}
	public void setSaleInvoiceNo(Invoice saleInvoiceNo) {
		this.saleInvoiceNo = saleInvoiceNo;
	}
	public float getSaleRate() {
		return saleRate;
	}
	public void setSaleRate(float saleRate) {
		this.saleRate = saleRate;
	}
	public int getSaleQty() {
		return saleQty;
	}
	public void setSaleQty(int saleQty) {
		this.saleQty = saleQty;
	}
	public float getSaleDisc() {
		return saleDisc;
	}
	public void setSaleDisc(float saleDisc) {
		this.saleDisc = saleDisc;
	}
	public float getSaleTax() {
		return saleTax;
	}
	public void setSaleTax(float saleTax) {
		this.saleTax = saleTax;
	}
	public float getSaleMrp() {
		return saleMrp;
	}
	public void setSaleMrp(float saleMrp) {
		this.saleMrp = saleMrp;
	}


	
}
