package com.pjb.springbootjjwt.entity;

/**
 * @author jinbin
 * @date 2018-07-08 20:43
 */
public class User {
	private String Id;
	private String username;
	private String password;

	public String getId() {
		return this.Id;
	}

	public void setId(String id) {
		this.Id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String id, String username, String password) {
		super();
		this.Id = id;
		this.username = username;
		this.password = password;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", username=" + username + ", password=" + password + "]";
	}
	
}
