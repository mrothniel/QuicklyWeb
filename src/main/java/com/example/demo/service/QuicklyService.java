package com.example.demo.service;


import com.example.demo.entities.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public interface QuicklyService {
    List<Coc_apprenant> findApprenants(Long idEnseignant);

    Coc_apprenant selectApprenant(Long id);

    void setExercice(List<Coc_apprenant> apprs, Coc_exercice exo, Long idenseignant);

    void createModule(Long idCreator, Coc_module module);

    void updateModule(Long id, Coc_module modules);

    List<Coc_module> getModules();

    void createExercice(Long idModule, Coc_exercice exo);

    void updateExercice(Long id, Coc_exercice exercice);

    List<Coc_exercice> findExercices();

    void createQuestion(Long idExo, Coc_question question);

    void updateQuestion(Long id, Coc_question newQuestion);

    List<Coc_question> findQuestions(long IdExercice);

    void uploadImage(Long idQuestion, String urlImage);

    void uploadVoice(Long idQuestion, String urlVoice);

    void createReponse(Long idQuestion, Coc_reponse reponse);

    void updateReponse(Long id, Coc_reponse newReponse);

    List<Coc_reponse> findReponses(Long idExercice);

    String getAvancementApprenant(List<Long> idApprenant);

    Coc_niveau selectNiveau(Long id);

    Coc_module selectModule(Long id);

    Coc_exercice selectExercice(Long id);

    Coc_reponse selectReponse(Long id);

    String seeAvancement(Long idApprenant);

    HashMap<Coc_question, Coc_reponse> reviewExercice(Long idExercice);

    }