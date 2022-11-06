package com.springboot.account;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

	@Id @GeneratedValue
	private Long id;

	private String username;
	private String password;
	private String email;
	private boolean active;

	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
