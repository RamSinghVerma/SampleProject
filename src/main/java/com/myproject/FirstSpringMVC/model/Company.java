package com.myproject.FirstSpringMVC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int companyId;
private String companyName;
private String companyPhoneNo;
private String companyEmailId;
private String companyGstNo;
private int companyStateId;
private String companyAddress;

public int getCompanyId() {
	return companyId;
}
public void setCompanyId(int companyId) {
	this.companyId = companyId;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getCompanyPhoneNo() {
	return companyPhoneNo;
}
public void setCompanyPhoneNo(String companyPhoneNo) {
	this.companyPhoneNo = companyPhoneNo;
}
public String getCompanyEmailId() {
	return companyEmailId;
}
public void setCompanyEmailId(String companyEmailId) {
	this.companyEmailId = companyEmailId;
}
public String getCompanyGstNo() {
	return companyGstNo;
}
public void setCompanyGstNo(String companyGstNo) {
	this.companyGstNo = companyGstNo;
}
public int getCompanyStateId() {
	return companyStateId;
}
public void setCompanyStateId(int companyStateId) {
	this.companyStateId = companyStateId;
}
public String getCompanyAddress() {
	return companyAddress;
}
public void setCompanyAddress(String companyAddress) {
	this.companyAddress = companyAddress;
}



}
