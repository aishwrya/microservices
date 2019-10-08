package com.cts.MicroService.client.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private UserEntity user;

	

	public JwtResponse(String jwttoken) {
		super();
		this.jwttoken = jwttoken;
		
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public String getToken() {
		return this.jwttoken;
	}
}