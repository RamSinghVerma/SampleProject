package com.myproject.FirstSpringMVC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserPermission {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int permissionId;
	private String permissionName;
	private int permissionUserId;

	public int getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public int getPermissionUserId() {
		return permissionUserId;
	}

	public void setPermissionUserId(int permissionUserId) {
		this.permissionUserId = permissionUserId;
	}

}
