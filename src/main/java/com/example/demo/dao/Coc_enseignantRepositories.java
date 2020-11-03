package com.example.demo.dao;

import com.example.demo.entities.Coc_enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_enseignantRepositories extends JpaRepository<Coc_enseignant, Long> {
}
