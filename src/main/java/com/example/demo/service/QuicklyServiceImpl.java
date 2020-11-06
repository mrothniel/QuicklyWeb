package com.example.demo.service;

import com.example.demo.dao.*;
import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public List<Coc_apprenant> findApprenants(Long idEnseignant) {
        //Optional<Coc_enseignant> enseignant = coc_enseignantRepositories.findById(idEnseignant);
        List<Coc_apprenant> apprenantList = new ArrayList<>();
        for(Coc_ens_app_exer ens_app_exer: coc_ens_app_exerRepositories.findAll()){
            if (ens_app_exer.getCoc_enseignant().getId().equals(idEnseignant)){
                apprenantList.add(ens_app_exer.getCoc_apprenant());
            }
        }
        return apprenantList;
    }

    @Override
    public Coc_apprenant selectApprenant(Long id) {
        return coc_apprenantRepositories.getOne(id);
    }

    @Override
    public void setExercice(List<Coc_apprenant> apprenants, Coc_exercice exercice, Long idenseignant) {
        for(Coc_apprenant apprenantList : apprenants ){
            Coc_ens_app_exer exercicesEns = new Coc_ens_app_exer();
            exercicesEns.setCoc_apprenant(apprenantList);
            exercicesEns.setCoc_exercice(exercice);
            exercicesEns.setCoc_enseignant(coc_enseignantRepositories.getOne(idenseignant));
        }
    }

    @Override
    public void createModule(Long idCreator, Coc_module module) {

    }

    @Override
    public void updateModule(Long id, Coc_module modules) {
        coc_moduleRepositories.getOne(id).setCOC_LIBELLE(modules.getCOC_LIBELLE());
        coc_moduleRepositories.getOne(id).setCOC_AVANCEMENT_MODULE(modules.getCOC_LIBELLE());
    }

    @Override
    public List<Coc_module> getModules() {
        return null;
    }

    @Override
    public void createExercice(Long idModule, Coc_exercice exercice) {
        Coc_exercice cExercice = new Coc_exercice();
        cExercice.setCOC_LIBELLE(exercice.getCOC_LIBELLE());
        cExercice.setCoc_niveau(exercice.getCoc_niveau());
        cExercice.setCoc_questions(exercice.getCoc_questions());
        Coc_module module = coc_moduleRepositories.getOne(idModule);
        cExercice.setCoc_module(module);
        coc_exerciceRepositories.save(cExercice);
    }

    @Override
    public void updateExercice(Long id, Coc_exercice exercice) {
        coc_exerciceRepositories.getOne(id).setCOC_LIBELLE(exercice.getCOC_LIBELLE());
    }

    @Override
    public List<Coc_exercice> findExercices(Long idModule) {
        List<Coc_exercice> listExo = new ArrayList<>();
        for(Coc_exercice  exercice : coc_exerciceRepositories.findAll()){
           if( exercice.getCoc_module().getId().equals( idModule)){
               listExo.add(exercice);
           }
        }
        return listExo;
    }

    @Override
    public void createQuestion(Long idExercice, Coc_question question) {
        Coc_exercice exercice = coc_exerciceRepositories.getOne(idExercice);
        exercice.getCoc_questions().add(question);
        question.setCoc_exercice(exercice);
        coc_questionRepositories.save(question);
    }

    @Override
    public void updateQuestion(Long id, Coc_question newQuestion) {
        coc_questionRepositories.getOne(id).setCOC_INSTRUCTION(newQuestion.getCOC_INSTRUCTION());
        coc_questionRepositories.getOne(id).setCOC_LIBELLE(newQuestion.getCOC_LIBELLE());
        coc_questionRepositories.getOne(id).setCOC_TYPE(newQuestion.getCOC_TYPE());
        coc_questionRepositories.getOne(id).setCOC_VOICE(newQuestion.getCOC_VOICE());
    }

    @Override
    public List<Coc_question> findQuestions(long IdExercice) {
        List<Coc_question> listExo = new ArrayList<>();
        for(Coc_question  question: coc_questionRepositories.findAll()){
            if (question.getCoc_exercice().getId().equals(IdExercice)){
                listExo.add(question);
            }
        }
        return listExo;
    }

    @Override
    public void uploadImage(Long idQuestion, String urlImage) {
     coc_questionRepositories.getOne(idQuestion).setCOC_IMAGE( urlImage);
    }

    @Override
    public void uploadVoice(Long idQuestion, String urlVoice) {
        coc_questionRepositories.getOne(idQuestion).setCOC_VOICE(urlVoice);
    }

    @Override
    public void createReponse(Long idQuestion, Coc_reponse newReponse) {
        Coc_question  question  = coc_questionRepositories.getOne(idQuestion);
         question.getCoc_reponses().add(newReponse);
         newReponse.setCoc_question(question);
         coc_reponseRepositories.save(newReponse);
    }

    @Override
    public void updateReponse(Long id,Coc_reponse newReponse) {
        coc_reponseRepositories.getOne(id).setCOC_LIBELLE(newReponse.getCOC_LIBELLE());
        coc_reponseRepositories.getOne(id).setCOC_EXACTITUDE( newReponse.isCOC_EXACTITUDE());
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
        StringBuilder Avancements = new StringBuilder();
        for(Long id : listeIdApprenant) {
            Avancements.append("\n Apprenant numero ").append(id).append(" = 1 / ").append(coc_apprenantRepositories.getOne(id).getCoc_ens_app_exers().size());
        }
        return Avancements.toString();
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