package com.example.demo.dao;

import com.example.demo.entities.Coc_reponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_reponseRepositories extends JpaRepository<Coc_reponse, Long> {
}
