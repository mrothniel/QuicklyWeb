package com.example.demo.service;

import com.example.demo.entities.*;

import java.util.HashMap;
import java.util.List;

public interface QuicklyService {
    public List<Coc_apprenant> findApprenants();

    public Coc_apprenant selectApprenant(Long id);

    public void attribuerExo(List<Coc_apprenant> apprs, Coc_exercice exo);

    public void createModule(Long idCreator, Coc_module module);

    public void modifModule(Long id);

    public List<Coc_module> findModules();

    public void createExercice(Long idModule, Coc_exercice exo);

    public void modifExercice(Long id);

    public List<Coc_exercice> findExercices();

    public void createQuestion(Long idExo, Coc_question question);

    public void modifQuestion(Long id);

    public List<Coc_question> findQuestions();

    public void uploadImage(Long idQuestion, String urlImage);

    public void uploadVoice(Long idQuestion, String urlVoice);

    public void createReponse(Long idQuestion, Coc_reponse reponse);

    public void modifReponse(Long id);

    public List<Coc_reponse> findReponses();

    public String getAvancementApprenant(Long idApprenant);

    public Coc_niveau selectNiveau();

    public Coc_module selectModule();

    public Coc_exercice selectExercice();

    public Coc_reponse selectReponse();

    public String voirSonAvancement();

    public HashMap<Coc_question, Coc_reponse> reviserExercice();

    }