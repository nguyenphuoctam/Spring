package com.phuoctam.entity;

public class User {
	private int id;
	private String email;
	private String password;
	private String firtName;
	private String lastName;
	private int roleId;

	public User() {
		super();
	}

	public User(int id, String email, String password, String firtName, String lastName, int roleId) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.firtName = firtName;
		this.lastName = lastName;
		this.roleId = roleId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

}
