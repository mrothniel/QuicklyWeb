package com.example.demo.service;

import com.example.demo.dao.*;
import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuicklyServiceImpl  implements QuicklyService {

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

    @Override
    public Set<Coc_apprenant> findApprenants(Long idEnseignant) {
        //Optional<Coc_enseignant> enseignant = coc_enseignantRepositories.findById(idEnseignant);
        Set<Coc_apprenant> apprenantList = new HashSet<>();
        for (Coc_ens_appr_lecon ens_app_exer : coc_ens_apprexoRepositories.findAll()) {
            if (ens_app_exer.getCoc_enseignant().getId().equals(idEnseignant)) {
                apprenantList.add(ens_app_exer.getCoc_apprenant());
            }
        }
        return apprenantList;
    }

    @Override
    public Optional<Coc_apprenant> selectApprenant(Long id) {
        return coc_apprenantRepositories.findById(id);
    }

    @Override
    public void setExercice(List<Coc_apprenant> apprenants, Coc_lecon lecon, Long idenseignant) {
        for (Coc_apprenant apprenantList : apprenants) {
            Coc_ens_appr_lecon exercicesEns = new Coc_ens_appr_lecon();
            exercicesEns.setCoc_apprenant(apprenantList);
            exercicesEns.setCoc_lecon(lecon);
            exercicesEns.setCoc_enseignant(coc_enseignantRepositories.getOne(idenseignant));
        }
    }

    @Override
    public void createLecon(Long idCreator, Coc_lecon lecon) {

    }

    @Override
    public void updateLecon(Long id, Coc_lecon lecon) {
        coc_leconRepositories.getOne(id).setCoc_name(lecon.getCoc_name());
        coc_leconRepositories.getOne(id).setCoc_title(lecon.getCoc_title());
    }

    @Override
    public List<Coc_lecon> getLecons() {
        return null;
    }

    @Override
    public void createExercice(Long idLecon, Coc_exercice exercice) {
        Coc_exercice Exercice = new Coc_exercice();
        Exercice.setCoc_type_exo(exercice.getCoc_type_exo());
        Exercice.setCoc_question(exercice.getCoc_question());
        Exercice.setCoc_answer(exercice.getCoc_answer());
        Exercice.setCoc_niveau(exercice.getCoc_niveau());
        Exercice.setCoc_suggestions(exercice.getCoc_suggestions());
        Coc_lecon lecon = coc_leconRepositories.getOne(idLecon);
        Exercice.setCoc_lecon(lecon);
        coc_exerciceRepositories.save(Exercice);
    }

    @Override
    public void updateExercice(Long id, Coc_exercice exercice) {
        coc_exerciceRepositories.getOne(id).setCoc_type_exo(exercice.getCoc_type_exo());
        coc_exerciceRepositories.getOne(id).setCoc_question(exercice.getCoc_question());
        coc_exerciceRepositories.getOne(id).setCoc_answer(exercice.getCoc_answer());
    }

    @Override
    public void uploadImage(Long idSuggestion, String urlImage) {
        coc_suggestionRepositories.getOne(idSuggestion).setCoc_image(urlImage);
    }

    @Override
    public void uploadVoice(Long idSuggestion, String urlVoice) {
        coc_suggestionRepositories.getOne(idSuggestion).setCoc_media(urlVoice);
    }

    @Override
    public void createSuggestion(Long idQuestion, Coc_suggestion newReponse) {
      /*  Coc_question question = coc_questionRepositories.getOne(idQuestion);
       // question.getCoc_reponses().add(newReponse);
        newReponse.setCoc_question(question);
        coc_reponseRepositories.save(newReponse);*/
    }

    @Override
    public void updateSuggestion(Long idSugg, Coc_suggestion newSuggestion) {
        coc_suggestionRepositories.getOne(idSugg).setCoc_name_sugg(newSuggestion.getCoc_name_sugg());
    }

    @Override
    public List<Coc_suggestion> findSuggestions(Long idExercice) {
        List<Coc_suggestion> list = new ArrayList<>();
        for (Coc_suggestion suggestion : coc_suggestionRepositories.findAll()) {
            if (suggestion.getCoc_exercice().getId().equals(idExercice))
                list.add(suggestion);
        }
        return list;
    }

    @Override
    public String getAvancementApprenant(Long idEnseignant) {
        //Je charge la liste de tous les apprenants de l'enseignant dont l'id est donné en paramètre
        Set<Long> listeIdApprenant = new HashSet<>(); //Set n'accepte pas de soublons donc Ok pour une classe d'association
        for (Coc_ens_appr_lecon exos : coc_ens_apprexoRepositories.findAll()) {
            if (exos.getCoc_enseignant().getId().equals(idEnseignant))
                listeIdApprenant.add(exos.getCoc_apprenant().getId());
        }
        StringBuilder Avancements = new StringBuilder();
        for (Long id : listeIdApprenant) {
            Avancements.append("\n Apprenant numero ").append(id).append(" = 1 / ").append(coc_apprenantRepositories.getOne(id).getCoc_ens_appr_lecon().size());
        }
        return Avancements.toString();
    }

    @Override
    public Optional<Coc_niveau> selectNiveau(Long id) {
        return coc_niveauRepositories.findById(id);
    }

    @Override
    public Optional<Coc_lecon> selectLecon(Long id) {
        return coc_leconRepositories.findById(id);
    }

    @Override
    public Optional<Coc_exercice> selectExercice(Long id) {
        return coc_exerciceRepositories.findById(id);
    }

    @Override
    public Optional<Coc_suggestion> selectSuggestion(Long id) {
        return coc_suggestionRepositories.findById(id);
    }

    @Override
    public long getScore(Long idApprenant, Long idLecon) {
        long score=0;
        for(Coc_ens_appr_lecon ens_appr: coc_ens_apprexoRepositories.findAll()){
            if(ens_appr.getCoc_apprenant().getId().equals(idApprenant) && ens_appr.getCoc_lecon().getId().equals(idLecon))
                score= ens_appr.getCoc_score();
        }
        return score;
    }

    @Override
    public TreeSet<Coc_exercice> getExercicesOfApprenant(Long idApprenant, Long idLecon){
        TreeSet<Coc_exercice> listExos = new TreeSet<>();
        for (Coc_ens_appr_lecon ens_app_exer : coc_ens_apprexoRepositories.findAll()) {
            if (ens_app_exer.getCoc_apprenant().getId().equals(idApprenant) && ens_app_exer.getCoc_lecon().getId().equals(idLecon))
                listExos.addAll(ens_app_exer.getCoc_lecon().getCoc_exercices());
        }
        return listExos;
    }

    @Override
    public HashMap<Coc_lecon, Coc_exercice> findExercicesByApprenant(Long idApprenant){
        return null;
    }

    @Override
        public List<Coc_suggestion> reviewExercice (Long idApprenant, Long idLecon){
            List<Coc_suggestion> listSuggestions = new ArrayList<>();
           for (Coc_ens_appr_lecon exos : coc_ens_apprexoRepositories.findAll()) {
            //si dans la table ens_app_exer il y'a une ligne qui correspond en même temps à l'exercice et à l'apprenant, on charge ses questions dans la liste
               if (exos.getCoc_apprenant().getId().equals(idApprenant) && exos.getCoc_lecon().getId().equals(idLecon))
                   for(Coc_exercice exer: exos.getCoc_lecon().getCoc_exercices()) {
                       listSuggestions.addAll(exer.getCoc_suggestions());
                   }
           }
            return listSuggestions;
        }

    @Override
    public TreeSet<Coc_lecon> getAllLecons(Long idApprenant) {
        TreeSet<Coc_lecon> listLecons = new TreeSet<>();
        for (Coc_ens_appr_lecon ens_app_exer : coc_ens_apprexoRepositories.findAll()) {
            if (ens_app_exer.getCoc_apprenant().getId().equals(idApprenant))
                listLecons.add(ens_app_exer.getCoc_lecon());
        }
        return listLecons;
    }

    public Optional<Coc_apprenant> connection(Long idUserProspect){
        return coc_apprenantRepositories.findById(
                coc_user_prospectRepositories.getOne(idUserProspect).getCoc_apprenant().getId());
    }

    public boolean isClient(Long idApprenant){
        return coc_clientRepositories.findById(
                coc_apprenantRepositories.getOne(idApprenant).getCoc_client().getId()).isPresent();
    }
}