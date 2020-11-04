package com.example.demo.dao;

import com.example.demo.dto.Coc_question_dto;
import com.example.demo.entities.Coc_question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_questionRepositories extends JpaRepository<Coc_question, Long> {
}
