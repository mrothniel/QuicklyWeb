package com.example.demo.dao;

import com.example.demo.entities.Coc_module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_moduleRepositories extends JpaRepository<Coc_module, Long> {
}
