package com.example.demo.dao;

import com.example.demo.entities.Coc_suggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Coc_suggestionRepositories extends JpaRepository<Coc_suggestion, Long> {
   // @Query("Select * from coc_reponse where coc_question_id = :idQuestion")
   // ArrayList<Coc_reponse> getReponsesfromQuestion(@Param("idQuestion") long idQuestion);
}
