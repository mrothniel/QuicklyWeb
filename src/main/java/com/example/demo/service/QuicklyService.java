package com.example.demo.service;


import com.example.demo.entities.*;

import java.util.*;

public interface QuicklyService {
    public Set<Coc_apprenant> findApprenants(Long idEnseignant);

    public Optional<Coc_apprenant> selectApprenant(Long id);

    public void setExercice(List<Coc_apprenant> apprs, Coc_lecon lecon, Long idenseignant);

    public void createLecon(Long idCreator, Coc_lecon lecon);

    public void updateLecon(Long id, Coc_lecon lecon);

    public List<Coc_lecon> getLecons();

    public void createExercice(Long idLecon, Coc_exercice exo);

    public void updateExercice(Long id, Coc_exercice exercice);

    public void uploadImage(Long idSuggestion, String urlImage);

    public void uploadVoice(Long idSuggestion, String urlVoice);

    public void createSuggestion(Long idExo, Coc_suggestion suggestion);

    public void updateSuggestion(Long id, Coc_suggestion newSuggestion);

    public List<Coc_suggestion> findSuggestions(Long idExercice);

    public String getAvancementApprenant(Long idEnseignant);

    public Optional<Coc_niveau> selectNiveau(Long id);

    public Optional<Coc_lecon> selectLecon(Long id);

    public Optional<Coc_exercice> selectExercice(Long id);

    public Optional<Coc_suggestion> selectSuggestion(Long id);

    public long getScore(Long idApprenant, Long idLecon);

    public TreeSet<Coc_exercice> getExercicesOfApprenant(Long idApprenant, Long idLecon);

    public HashMap<Coc_lecon, Coc_exercice> findExercicesByApprenant(Long idApprenant);

    public List<Coc_suggestion> reviewExercice(Long idApprenant, Long idExercice);

    public TreeSet<Coc_lecon> getAllLecons(Long idApprenant);

    public Optional<Coc_apprenant> connection(Long idUserProspect);

    public boolean isClient(Long idApprenant);

    }