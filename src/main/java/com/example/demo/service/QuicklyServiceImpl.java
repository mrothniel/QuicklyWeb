package com.example.demo.service;

import com.example.demo.dao.*;
import com.example.demo.dto.Coc_question_dto;
import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@Service
public class QuicklyServiceImpl  implements QuicklyService{

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

    @Override
    public List<Coc_apprenant> findApprenants() {
        return null;
    }

    @Override
    public Coc_apprenant selectApprenant(Long id) {
        return null;
    }

    @Override
    public void attribuerExo(List<Coc_apprenant> apprenants, Coc_exercice exercice) {

    }

    @Override
    public void createModule(Long idCreator, Coc_module module) {

    }

    @Override
    public void updateModule(Long id) {

    }

    @Override
    public List<Coc_module> findModules() {
        return null;
    }

    @Override
    public void createExercice(Long idModule, Coc_exercice exercice) {

    }

    @Override
    public void updateExercice(Long id) {

    }

    @Override
    public List<Coc_exercice> findExercices() {
        return null;
    }

    @Override
    public void createQuestion(Long idExercice, Coc_question question) {

    }

    @Override
    public void updateQuestion(Long id) {

    }

    @Override
    public List<Coc_question> findQuestions() {
        return null;
    }

    @Override
    public void uploadImage(Long idQuestion, String urlImage) {

    }

    @Override
    public void uploadVoice(Long idQuestion, String urlVoice) {

    }

    @Override
    public void createReponse(Long idQuestion, Coc_reponse reponse) {

    }

    @Override
    public void updateReponse(Long id) {

    }

    @Override
    public List<Coc_reponse> findReponses(Long idExercice) {
        List<Coc_reponse> list = new ArrayList<>();
         for(Coc_reponse reponse : coc_reponseRepositories.findAll()){
                 if(reponse.getCoc_question().getCoc_exercice().getId().equals(idExercice))
                    list.add(reponse);
         }
         return list;
    }

    @Override
    public String getAvancementApprenant(List<Long> listeIdApprenant) {
        String Avancements = "";
        for(Long id : listeIdApprenant) {
            Avancements += "\n Apprenant numero " + id + " = 1 / " + coc_apprenantRepositories.getOne(id).getCoc_ens_app_exers().size();;
        }
        return Avancements;
    }

    @Override
    public Coc_niveau selectNiveau(Long id) {
        return coc_niveauRepositories.getOne(id);
    }

    @Override
    public Coc_module selectModule(Long id) {
        return coc_moduleRepositories.getOne(id);
    }

    @Override
    public Coc_exercice selectExercice(Long id) {
        return coc_exerciceRepositories.getOne(id);
    }

    @Override
    public Coc_reponse selectReponse(Long id) {
        return coc_reponseRepositories.getOne(id);
    }

    @Override
    public String seeAvancement(Long idApprenant) {
        return "1 / "+coc_apprenantRepositories.getOne(idApprenant).getCoc_ens_app_exers().size();
    }

    @Override
    public HashMap<Coc_question, Coc_reponse> reviewExercice(Long idExercice) {
       HashMap<Coc_question, Coc_reponse> review= new HashMap<>();
       List<Coc_question> listQuestions = new ArrayList<>();
       for(Coc_question question : coc_exerciceRepositories.getOne(idExercice).getCoc_questions()) {
           for (Coc_reponse reponse : question.getCoc_reponses()) {
               if (reponse.isCOC_EXACTITUDE())
                   review.put(question, reponse);
           }
       }
        return review;
    }
}