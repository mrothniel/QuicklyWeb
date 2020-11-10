package com.example.demo.service;


import com.example.demo.entities.*;

import java.util.*;

public interface QuicklyService {
    public Set<Coc_apprenant> findApprenants(Long idEnseignant);

    public Optional<Coc_apprenant> selectApprenant(Long id);

    public void setExercice(List<Coc_apprenant> apprs, Coc_exercice exo, Long idenseignant);

    public void createModule(Long idCreator, Coc_module module);

    public void updateModule(Long id, Coc_module modules);

    public List<Coc_module> getModules();

    public void createExercice(Long idModule, Coc_exercice exo);

    public void updateExercice(Long id, Coc_exercice exercice);

    public List<Coc_exercice> findExercices(Long idModule);

    public void createQuestion(Long idExo, Coc_question question);

    public void updateQuestion(Long id,Coc_question newQuestion);

    public List<Coc_question> findQuestions(long IdExercice);

    public void uploadImage(Long idQuestion, String urlImage);

    public void uploadVoice(Long idQuestion, String urlVoice);

    public void createReponse(Long idQuestion, Coc_reponse reponse);

    public void updateReponse(Long id,Coc_reponse newReponse);

    public List<Coc_reponse> findReponses(Long idExercice);

    public String getAvancementApprenant(Long idEnseignant);

    public Optional<Coc_niveau> selectNiveau(Long id);

    public Optional<Coc_module> selectModule(Long id);

    public Optional<Coc_exercice> selectExercice(Long id);

    public Optional<Coc_question> selectQuestion(Long id);

    public Optional<Coc_reponse> selectReponse(Long id);

    public String seeAvancement(Long idApprenant);

    public Coc_reponse reponseExacte(Long idQuestion);

    public HashMap<Coc_module, Coc_exercice> findExercicesByApprenant(Long idApprenant);

    public List<Coc_reponse> reviewExercice(Long idApprenant, Long idExercice);

    }