package com.example.demo.service;

import com.example.demo.dao.*;
import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
    }

    @Override
    public String getAvancementApprenant(Long idApprenant) {
        return null;
    }

    @Override
    public Coc_niveau selectNiveau() {
        return null;
    }

    @Override
    public Coc_module selectModule() {
        return null;
    }

    @Override
    public Coc_exercice selectExercice() {
        return null;
    }

    @Override
    public Coc_reponse selectReponse() {
        return null;
    }

    @Override
    public String seeAvancement() {
        return null;
    }

    @Override
    public HashMap<Coc_question, Coc_reponse> reviewExercice() {
        return null;
    }
}
