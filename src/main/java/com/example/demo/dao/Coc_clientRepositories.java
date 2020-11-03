package com.example.demo.dao;

import com.example.demo.entities.Coc_client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_clientRepositories extends JpaRepository<Coc_client, Long> {
}
