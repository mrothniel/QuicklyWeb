package com.example.demo.dao;

import com.example.demo.entities.Coc_apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_apprenantRepositories extends JpaRepository<Coc_apprenant, Long> {


}
