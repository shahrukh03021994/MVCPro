package com.niit.GroceryBackendApp;

import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

@Entity
@Table(name = "User") 
public class User implements Serializable{

	// we have define all properties for all the fields in table.

	// we have mention which one is primary key
	@Id
	private String id;

	/*
	 * if the field name in table and property name in class is diferent, then
	 * we required specify column name Otherwise no need specify.
	 */

	@Column(name = "name")
	private String name;

	
	private String password;
	private String contact;
	private String role;

	// getters + setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", contact=" + contact + ", role="
				+ role + "]";
	}

}
