package com.example.demo.dao;

import com.example.demo.entities.Coc_ens_appr_lecon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface Coc_ens_appr_leconRepositories extends JpaRepository<Coc_ens_appr_lecon, Long> {
    //@Query("Select count(*) from Coc_ens_app_exer where coc_apprenant_id = :idApprenant")
    //int getApprenantAvancement(@Param("idApprenant") long idApprenant);
}
