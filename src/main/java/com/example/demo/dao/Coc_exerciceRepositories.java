package com.example.demo.dao;

import com.example.demo.entities.Coc_exercice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_exerciceRepositories extends JpaRepository<Coc_exercice, Long> {
}
