package com.example.demo.dao;

import com.example.demo.entities.Coc_question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_questionRepositories extends JpaRepository<Coc_question, Long> {
}
