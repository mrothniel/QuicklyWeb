package com.example.demo.controller;


import com.example.demo.config.JwtTokenUtil;
import com.example.demo.dao.Coc_enseignantRepositories;
import com.example.demo.dto.Coc_enseignant_dto;
import com.example.demo.dto.JwtRequest;
import com.example.demo.dto.JwtResponse;
import com.example.demo.entities.Coc_enseignant;
import com.example.demo.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin(origins="http://localhost:5000")  
public class JwtAuthenticationController {

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	@Autowired
	private Coc_enseignantRepositories userDao;

	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody Coc_enseignant_dto inscription) throws Exception {

		Objects.requireNonNull(inscription);

		return ResponseEntity.ok(userDetailsService.save(inscription));
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());

		final String token = jwtTokenUtil.generateToken(userDetails);
		Coc_enseignant user = userDao.findByUsername(authenticationRequest.getUsername());
		System.out.println(token);

		return ResponseEntity.ok(new JwtResponse(token,user));
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
	
	@RequestMapping(value = "/userss", method = RequestMethod.GET, produces = {"application/json"})
	 ResponseEntity< List<Coc_enseignant>> allUsers() {
	    return ResponseEntity.ok(userDao.findAll());
	  }


}
