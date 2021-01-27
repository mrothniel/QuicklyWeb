package com.example.demo.dao;

import com.example.demo.entities.Coc_enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_enseignantRepositories extends JpaRepository<Coc_enseignant, Long> {
    @Query("select u from Coc_enseignant u  where u.COC_ENSEIGNANT_nom = ?1 ")
    Coc_enseignant findByUsername(String username);
}
