package com.zixuapp.entity;

public class User {
	private int id;
	private String username;
	private String password;
	private String secret;
	private String type;
	private Boolean lock;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", secret=" + secret + ", type="
				+ type + ", lock=" + lock + "]";
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
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void setLock(Boolean lock) {
		this.lock = lock;
	}
	
	public Boolean getLock() {
		return lock;
	}
	
	public String getLockTinyint() {
		return (lock) ? "1" : "0";
	}

}
