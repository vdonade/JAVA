package com.bean;

import java.io.Serializable;

public class AdminLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	private String admin_name;
	private String password;

	public String getAdminname() {
		return admin_name;
	}

	public void setAdminname(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
