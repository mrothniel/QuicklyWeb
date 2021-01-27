package com.example.demo.dto;

import com.example.demo.entities.Coc_enseignant;
import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private final Coc_enseignant coc_enseignant;

	public JwtResponse(String jwttoken, Coc_enseignant user) {
		this.jwttoken = jwttoken;
		this.coc_enseignant = user;
	}

	public String getToken() {
		return this.jwttoken;
	}

	public Coc_enseignant getUser() {
		return coc_enseignant;
	}
}