package com.example.demo.dao;

import com.example.demo.entities.Coc_reponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;

@RepositoryRestResource
public interface Coc_reponseRepositories extends JpaRepository<Coc_reponse, Long> {
    @Query("Select * from coc_reponse where coc_question_id = :idQuestion")
    ArrayList<Coc_reponse> getReponsesfromQuestion(@Param("idQuestion") long idQuestion);
}
