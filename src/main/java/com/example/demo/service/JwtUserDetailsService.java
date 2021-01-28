package com.example.demo.service;



import java.time.Clock;
import java.util.ArrayList;

import com.example.demo.dao.Coc_enseignantRepositories;
import com.example.demo.dto.Coc_enseignant_dto;
import com.example.demo.entities.Coc_enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;




@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private Coc_enseignantRepositories userDao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Coc_enseignant user = userDao.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getCOC_ENSEIGNANT_nom(), user.getCOC_ENSEIGNANT_motdepasse(),
				new ArrayList<>());
	}

	public Coc_enseignant save(Coc_enseignant_dto coc_enseignant_dto) {
		Coc_enseignant newUser = new Coc_enseignant();
		newUser.setCOC_ENSEIGNANT_nom(coc_enseignant_dto.getCOC_ENSEIGNANT_nom());
		newUser.setCOC_ENSEIGNANT_prenom(coc_enseignant_dto.getCOC_ENSEIGNANT_prenom());
		newUser.setCOC_ENSEIGNANT_email(coc_enseignant_dto.getCOC_ENSEIGNANT_email());
		newUser.setCOC_ENSEIGNANT_motdepasse(passwordEncoder.encode(coc_enseignant_dto.getCOC_ENSEIGNANT_motdepasse()));
		System.out.println(newUser.getCOC_ENSEIGNANT_email()+"user du service");
		return userDao.save(newUser);
	}
}
