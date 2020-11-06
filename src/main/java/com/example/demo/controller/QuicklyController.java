package com.example.demo.controller;

import com.example.demo.dao.*;
import com.example.demo.entities.*;
import com.example.demo.service.QuicklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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

    @RequestMapping(value = "/list/apprenant/{idEnseignant}", method = RequestMethod.GET)
    public List<Coc_apprenant> getApprenantForOneEnseignant(@PathVariable Long idEnseignant){
      // Coc_enseignant e = coc_enseignantRepositories.getOne(idEnseignant);
        return quicklyService.findApprenants(idEnseignant);
    }

    @RequestMapping(value = "/apprenant/{idApprenant}", method = RequestMethod.GET)
    public Coc_apprenant getApprenantFromId(@PathVariable Long idApprenant){
        return quicklyService.selectApprenant(idApprenant);
    }

    @RequestMapping(value = "/list/exercice/{idModule}", method = RequestMethod.GET)
    public List<Coc_exercice> getExercicesByModule(@PathVariable Long idModule){
       // Coc_module e = coc_moduleRepositories.getOne(idModule);
        return quicklyService.findExercices(idModule);
    }

    @RequestMapping(value = "/list/question/{idExercice}", method = RequestMethod.GET)
    public List<Coc_question> getQuestionsByExercice(@PathVariable Long idExercice){
        Coc_exercice e = coc_exerciceRepositories.getOne(idExercice);
        return quicklyService.findQuestions(e.getId());
    }

    @RequestMapping(value = "/list/reponse/{idQuestion}", method = RequestMethod.GET)
    public List<Coc_reponse> getReponsesByQuestion(@PathVariable Long idQuestion){
        return quicklyService.findReponses(idQuestion);
    }

    @RequestMapping(value = "/list/avancements/{idModule}", method = RequestMethod.GET)
    public String getAllApprenantsAvancementsByEnseignant(@PathVariable Long idEnseignant){
        return quicklyService.getAvancementApprenant(idEnseignant);
    }

    @RequestMapping(value = "/niveau/{idNiveau}", method = RequestMethod.GET)
    public Coc_niveau getNiveauFromId(@PathVariable Long idNiveau){
        return quicklyService.selectNiveau(idNiveau);
    }

    @RequestMapping(value = "/module/{idModule}", method = RequestMethod.GET)
    public Coc_module getModuleFromId(@PathVariable Long idModule){
        return quicklyService.selectModule(idModule);
    }

    @RequestMapping(value = "/exercice/{idExercice}", method = RequestMethod.GET)
    public Coc_exercice getExerciceFromId(@PathVariable Long idExercice){
        return quicklyService.selectExercice(idExercice);
    }

    @RequestMapping(value = "/question/{idQuestion}", method = RequestMethod.GET)
    public Coc_question getQuestionFromId(@PathVariable Long idQuestion){
        return quicklyService.selectQuestion(idQuestion);
    }

    @RequestMapping(value = "/reponse/{idReponse}", method = RequestMethod.GET)
    public Coc_reponse getReponseFromId(@PathVariable Long idReponse){
        return quicklyService.selectReponse(idReponse);
    }

    @RequestMapping(value = "/avancement/{idModule}", method = RequestMethod.GET)
    public String getAvancementByApprenant(@PathVariable Long idApprenant){
        return quicklyService.seeAvancement(idApprenant);
    }

    @RequestMapping(value = "/review/{idApprenant}/{idExercice}", method = RequestMethod.GET)
    public HashMap<Coc_question, Coc_reponse> reviewExercice(@PathVariable Long idApprenant, Long idExercice){
        return quicklyService.reviewExercice(idApprenant, idExercice);
    }

}
