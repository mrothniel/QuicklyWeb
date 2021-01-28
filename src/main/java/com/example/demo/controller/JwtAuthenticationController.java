package com.example.demo.controller;


import com.example.demo.dao.Coc_enseignantRepositories;
import com.example.demo.dto.Coc_enseignant_dto;
import com.example.demo.entities.Coc_enseignant;
import com.example.demo.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin(origins="http://localhost:5000")  
public class JwtAuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	@Autowired
	private Coc_enseignantRepositories userDao;

	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody Coc_enseignant_dto inscription) throws Exception {
		String ensi =  inscription.getCOC_ENSEIGNANT_nom();
		System.out.println(ensi+"user controller");
		Objects.requireNonNull(inscription);

		return ResponseEntity.ok(userDetailsService.save(inscription));
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
