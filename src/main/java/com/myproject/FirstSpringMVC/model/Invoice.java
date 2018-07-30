package com.myproject.FirstSpringMVC.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Invoice{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int invoiceId;
private String invoiceNo;
private int invoiceCompanyId;
private float invoiceAmt;
private float invoiceBalance;
private float invoicePaid;
private float invoiceDisc;
private Date invoiceDate;
private Date invoiceGenDate;
private Date invoiceUpdateDate;
@OneToMany
private Set<SaleOrder> saleOrder;

public int getInvoiceId() {
	return invoiceId;
}
public void setInvoiceId(int invoiceId) {
	this.invoiceId = invoiceId;
}
public String getInvoiceNo() {
	return invoiceNo;
}
public void setInvoiceNo(String invoiceNo) {
	this.invoiceNo = invoiceNo;
}
public int getInvoiceCompanyId() {
	return invoiceCompanyId;
}
public void setInvoiceCompanyId(int invoiceCompanyId) {
	this.invoiceCompanyId = invoiceCompanyId;
}
public float getInvoiceAmt() {
	return invoiceAmt;
}
public void setInvoiceAmt(float invoiceAmt) {
	this.invoiceAmt = invoiceAmt;
}
public float getInvoiceBalance() {
	return invoiceBalance;
}
public void setInvoiceBalance(float invoiceBalance) {
	this.invoiceBalance = invoiceBalance;
}
public float getInvoicePaid() {
	return invoicePaid;
}
public void setInvoicePaid(float invoicePaid) {
	this.invoicePaid = invoicePaid;
}
public float getInvoiceDisc() {
	return invoiceDisc;
}
public void setInvoiceDisc(float invoiceDisc) {
	this.invoiceDisc = invoiceDisc;
}
public Date getInvoiceDate() {
	return invoiceDate;
}
public void setInvoiceDate(Date invoiceDate) {
	this.invoiceDate = invoiceDate;
}
public Date getInvoiceGenDate() {
	return invoiceGenDate;
}
public void setInvoiceGenDate(Date invoiceGenDate) {
	this.invoiceGenDate = invoiceGenDate;
}
public Date getInvoiceUpdateDate() {
	return invoiceUpdateDate;
}
public void setInvoiceUpdateDate(Date invoiceUpdateDate) {
	this.invoiceUpdateDate = invoiceUpdateDate;
}
public Set<SaleOrder> getSaleOrder() {
	return saleOrder;
}
public void setSaleOrder(Set<SaleOrder> saleOrder) {
	this.saleOrder = saleOrder;
}



}