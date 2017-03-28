package com.infi.model;
// Generated Mar 27, 2017 11:44:45 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer id;
	private String username;
	private String password;
	private String lastName;
	private String firstName;
	private Date lastModified;

	public User() {
	}

	public User(String username, String password, String lastName, String firstName, Date lastModified) {
		this.username = username;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.lastModified = lastModified;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

}