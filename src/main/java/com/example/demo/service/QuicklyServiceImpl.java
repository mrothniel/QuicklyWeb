package com.example.demo.service;

import com.example.demo.dao.*;
import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<Coc_reponse> findReponses() {
        return coc_reponseRepositories.findAll();
    }

    @Override
    public String getAvancementApprenant(List<Integer> listeIdApprenant) {
        String Avancements = "";
        for(int id : listeIdApprenant){
            Avancements += "\n Apprenant numero "+id+" = 1 / "+coc_ens_app_exerRepositories.getApprenantAvancement(id);
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
        return "1 / "+ coc_ens_app_exerRepositories.getApprenantAvancement(idApprenant);
    }

    @Override
    public HashMap<Coc_question, ArrayList<Coc_reponse>> reviewExercice() {
       HashMap<Coc_question, ArrayList<Coc_reponse>> review= new HashMap<>();
       coc_questionRepositories.findAll().forEach(coc_question ->
              review.put(coc_question,coc_reponseRepositories.getReponsesfromQuestion(coc_question.getId()))
        );
        return review;
        return null;
    }
}
