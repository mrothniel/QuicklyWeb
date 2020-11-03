package com.example.demo.dao;

import com.example.demo.entities.Coc_user_prospect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_user_prospectRepositories extends JpaRepository<Coc_user_prospect, Long> {
}
