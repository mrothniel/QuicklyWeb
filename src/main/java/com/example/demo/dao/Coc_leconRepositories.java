package com.example.demo.dao;

import com.example.demo.entities.Coc_lecon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_leconRepositories extends JpaRepository<Coc_lecon, Long> {
}
