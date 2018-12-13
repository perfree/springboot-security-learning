package com.perfree.entiy;

import java.io.Serializable;
import java.util.List;

public class UserRole implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private Integer roleId;
	
	private List<Role> roles;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}
