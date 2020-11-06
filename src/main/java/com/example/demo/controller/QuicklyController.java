package com.example.demo.controller;

import com.example.demo.dao.*;
import com.example.demo.entities.Coc_apprenant;
import com.example.demo.entities.Coc_enseignant;
import com.example.demo.service.QuicklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuicklyController {

    @Autowired
    Coc_clientRepositories coc_clientRepositories;
    @Autowired
    Coc_apprenantRepositories coc_apprenantRepositories;
    @Autowired
    Coc_enseignantRepositories coc_enseignantRepositories;
    @Autowired
    Coc_ens_app_exerRepositories coc_ens_app_exerRepositories;
    @Autowired
    Coc_exerciceRepositories coc_exerciceRepositories;
    @Autowired
    Coc_moduleRepositories coc_moduleRepositories;
    @Autowired
    Coc_niveauRepositories coc_niveauRepositories;
    @Autowired
    Coc_questionRepositories coc_questionRepositories;
    @Autowired
    Coc_reponseRepositories coc_reponseRepositories;
    @Autowired
    Coc_user_prospectRepositories coc_user_prospectRepositories;
    @Autowired
    QuicklyService quicklyService;

    @RequestMapping(value = "/list/apprenant/{idEnseignant}", method = RequestMethod.GET, produces = "apllication/json")
    public List<Coc_apprenant> getApprenantForOneEnseignant(@PathVariable Long idEnseignant){
       Coc_enseignant e = coc_enseignantRepositories.findById(idEnseignant).get();
        return quicklyService.findApprenants(e.getId());
    }

}
