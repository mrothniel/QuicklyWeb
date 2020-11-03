package com.example.demo.dao;

import com.example.demo.entities.Coc_ens_app_exer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_ens_app_exerRepositories extends JpaRepository<Coc_ens_app_exer, Long> {
}
