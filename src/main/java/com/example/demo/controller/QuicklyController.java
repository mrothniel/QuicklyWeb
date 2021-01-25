package com.example.demo.controller;

import com.example.demo.dao.*;
import com.example.demo.entities.*;
import com.example.demo.service.QuicklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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
    Coc_ens_appr_leconRepositories coc_ens_apprexoRepositories;
    @Autowired
    Coc_exerciceRepositories coc_exerciceRepositories;
    @Autowired
    Coc_leconRepositories coc_leconRepositories;
    @Autowired
    Coc_niveauRepositories coc_niveauRepositories;
    @Autowired
    Coc_suggestionRepositories coc_suggestionRepositories;
    @Autowired
    Coc_user_prospectRepositories coc_user_prospectRepositories;
    @Autowired
    QuicklyService quicklyService;

    @RequestMapping(value = "/list/apprenant/{idEnseignant}", method = RequestMethod.GET)
    public Set<Coc_apprenant> getApprenantForOneEnseignant(@PathVariable Long idEnseignant){
      // Coc_enseignant e = coc_enseignantRepositories.getOne(idEnseignant);
        return quicklyService.findApprenants(idEnseignant);
    }

    @RequestMapping(value = "/apprenant/{idApprenant}", method = RequestMethod.GET)
    public Optional<Coc_apprenant> getApprenantFromId(@PathVariable Long idApprenant){
        return quicklyService.selectApprenant(idApprenant);
    }

    @RequestMapping(value = "/list/suggestion/{idExercice}", method = RequestMethod.GET)
    public List<Coc_suggestion> getSuggestionsByExercice(@PathVariable Long idExercice){
        return quicklyService.findSuggestions(idExercice);
    }

    @RequestMapping(value = "/list/avancements/{idEnseignant}", method = RequestMethod.GET)
    public String getAllApprenantsAvancementsByEnseignant(@PathVariable Long idEnseignant){
        return quicklyService.getAvancementApprenant(idEnseignant);
    }

    @RequestMapping(value = "/niveau/{idNiveau}", method = RequestMethod.GET)
    public Optional<Coc_niveau> getNiveauFromId(@PathVariable Long idNiveau){
        return quicklyService.selectNiveau(idNiveau);
    }

    @RequestMapping(value = "/lecon/{idLecon}", method = RequestMethod.GET)
    public Optional<Coc_lecon> getLeconFromId(@PathVariable Long idLecon){
        return quicklyService.selectLecon(idLecon);
    }

    @RequestMapping(value = "/exercice/{idExercice}", method = RequestMethod.GET)
    public Optional<Coc_exercice> getExerciceFromId(@PathVariable Long idExercice){
        return quicklyService.selectExercice(idExercice);
    }

    @RequestMapping(value = "/suggestion/{idSuggestion}", method = RequestMethod.GET)
    public Optional<Coc_suggestion> getReponseFromId(@PathVariable Long idSuggestion){
        return quicklyService.selectSuggestion(idSuggestion);
    }

    @RequestMapping(value = "/avancement/appr/{idApprenant}/lecon/{idLecon}", method = RequestMethod.GET)
    public long getScoreByApprenant(@PathVariable Long idApprenant, @PathVariable Long idLecon){
        return quicklyService.getScore(idApprenant, idLecon);
    }

    @RequestMapping(value = "/list/exo/{idApprenant}/lecon/{idLecon}", method = RequestMethod.GET)
    public TreeSet<Coc_exercice> findExosOfApprenant(@PathVariable Long idApprenant, @PathVariable Long idLecon){
        return quicklyService.getExercicesOfApprenant(idApprenant, idLecon);
    }

    @RequestMapping(value = "/review/appr/{idApprenant}/lecon/{idLecon}", method = RequestMethod.GET)
    public List<Coc_suggestion> reviewExercice(@PathVariable Long idApprenant, @PathVariable Long idLecon){
        return quicklyService.reviewExercice(idApprenant, idLecon);
    }

    @RequestMapping(value = "/list/lecons/{idApprenant}", method = RequestMethod.GET)
    public TreeSet<Coc_lecon> getAllLecons(@PathVariable Long idApprenant){
        return quicklyService.getAllLecons(idApprenant);
    }

    @RequestMapping(value = "/score/{idApprenant}/lecon/{idLecon}", method = RequestMethod.GET)
    public Long getScore(@PathVariable Long idApprenant, @PathVariable Long idLecon){
        return quicklyService.getScore(idApprenant, idLecon);
    }

    @RequestMapping(value = "/connection/{idUserProspect}", method = RequestMethod.GET)
    public Optional<Coc_apprenant> connection(@PathVariable Long idUserProspect){
        return quicklyService.connection(idUserProspect);
    }

    @RequestMapping(value = "/isclient/{idApprenant}", method = RequestMethod.GET)
    public boolean isClient(@PathVariable Long idApprenant){
        return quicklyService.isClient(idApprenant);
    }
}
