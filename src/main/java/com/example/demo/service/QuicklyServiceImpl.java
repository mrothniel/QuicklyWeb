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
    public Set<Coc_apprenant> findApprenants(Long idEnseignant) {
        //Optional<Coc_enseignant> enseignant = coc_enseignantRepositories.findById(idEnseignant);
        Set<Coc_apprenant> apprenantList = new HashSet<>();
        for (Coc_ens_app_exer ens_app_exer : coc_ens_app_exerRepositories.findAll()) {
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
    public void setExercice(List<Coc_apprenant> apprenants, Coc_exercice exercice, Long idenseignant) {
        for (Coc_apprenant apprenantList : apprenants) {
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
        for (Coc_exercice exercice : coc_exerciceRepositories.findAll()) {
            if (exercice.getCoc_module().getId().equals(idModule)) {
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
        List<Coc_question> listQuestions = new ArrayList<>();
        for (Coc_question question : coc_questionRepositories.findAll()) {
            if (question.getCoc_exercice().getId().equals(IdExercice)) {
                listQuestions.add(question);
            }
        }
        return listQuestions;
    }

    @Override
    public void uploadImage(Long idQuestion, String urlImage) {
        coc_questionRepositories.getOne(idQuestion).setCOC_IMAGE(urlImage);
    }

    @Override
    public void uploadVoice(Long idQuestion, String urlVoice) {
        coc_questionRepositories.getOne(idQuestion).setCOC_VOICE(urlVoice);
    }

    @Override
    public void createReponse(Long idQuestion, Coc_reponse newReponse) {
      /*  Coc_question question = coc_questionRepositories.getOne(idQuestion);
       // question.getCoc_reponses().add(newReponse);
        newReponse.setCoc_question(question);
        coc_reponseRepositories.save(newReponse);*/
    }

    @Override
    public void updateReponse(Long id, Coc_reponse newReponse) {
        coc_reponseRepositories.getOne(id).setCOC_LIBELLE(newReponse.getCOC_LIBELLE());
        coc_reponseRepositories.getOne(id).setCOC_EXACTITUDE(newReponse.isCOC_EXACTITUDE());
    }

    @Override
    public List<Coc_reponse> findReponses(Long idExercice) {
        List<Coc_reponse> list = new ArrayList<>();
        for (Coc_reponse reponse : coc_reponseRepositories.findAll()) {
            if (reponse.getCoc_question().getCoc_exercice().getId().equals(idExercice))
                list.add(reponse);
        }
        return list;
    }

    @Override
    public String getAvancementApprenant(Long idEnseignant) {
        //Je charge la liste de tous les apprenants de l'enseignant dont l'id est donné en paramètre
        Set<Long> listeIdApprenant = new HashSet<>(); //Set n'accepte pas de soublons donc Ok pour une classe d'association
        for (Coc_ens_app_exer exos : coc_ens_app_exerRepositories.findAll()) {
            if (exos.getCoc_enseignant().getId().equals(idEnseignant))
                listeIdApprenant.add(exos.getCoc_apprenant().getId());
        }
        StringBuilder Avancements = new StringBuilder();
        for (Long id : listeIdApprenant) {
            Avancements.append("\n Apprenant numero ").append(id).append(" = 1 / ").append(coc_apprenantRepositories.getOne(id).getCoc_ens_app_exers().size());
        }
        return Avancements.toString();
    }

    @Override
    public Optional<Coc_niveau> selectNiveau(Long id) {
        return coc_niveauRepositories.findById(id);
    }

    @Override
    public Optional<Coc_module> selectModule(Long id) {
        return coc_moduleRepositories.findById(id);
    }

    @Override
    public Optional<Coc_exercice> selectExercice(Long id) {
        return coc_exerciceRepositories.findById(id);
    }

    @Override
    public Optional<Coc_question> selectQuestion(Long id) {
        return coc_questionRepositories.findById(id);
    }

    @Override
    public Optional<Coc_reponse> selectReponse(Long id) {
        return coc_reponseRepositories.findById(id);
    }

    @Override
    public String seeAvancement(Long idApprenant) {
        return "1 / " + coc_apprenantRepositories.getOne(idApprenant).getCoc_ens_app_exers().size();
    }

    @Override
    public Coc_reponse reponseExacte(Long idQuestion) {
        for(Coc_reponse reponse: coc_reponseRepositories.findAll()){
            if(reponse.getCoc_question().getId().equals(idQuestion)&&reponse.isCOC_EXACTITUDE().equals("1"))
                return reponse;
        }
        return null;
    }

    @Override
    public HashMap<Coc_module, Coc_exercice> findExercicesByApprenant(Long idApprenant) {
        HashMap<Coc_module, Coc_exercice> listexos = new HashMap<>();
        HashMap<Coc_module, Coc_exercice> verif = new HashMap<>();
        for (Coc_ens_app_exer ens_app_exer : coc_ens_app_exerRepositories.findAll()) {
            if (ens_app_exer.getCoc_apprenant().getId().equals(idApprenant))
                listexos.put(ens_app_exer.getCoc_exercice().getCoc_module(), ens_app_exer.getCoc_exercice());
        }

        return listexos; /*
        HashMap<Coc_module, Coc_exercice> listExo = new HashMap<>();
        for (Coc_ens_app_exer coc_ens_app_exer : coc_ens_app_exerRepositories.findAll()) {
            if (coc_ens_app_exer.getCoc_apprenant().getId().equals(idApprenant)){
                listExo.put(coc_ens_app_exer.getCoc_exercice().getCoc_module(),coc_ens_app_exer.getCoc_exercice());
            }
        }
        return listExo; */

    }

    @Override
   // public HashMap<String, Coc_reponse> reviewExercice(Long idApprenant, Long idExercice) {
        public List<Coc_reponse> reviewExercice (Long idApprenant, Long idExercice){
            HashMap<String, Coc_reponse> review = new HashMap<>();
            String reviews = "";
            //Je charge la liste de tous les exercices de l'apprenant dont l'id est donné en paramètre
            List<Coc_question> listQuestions = new ArrayList<>();
           // listQuestions = this.findQuestions(idExercice);
            List<Coc_reponse> listReponses = new ArrayList<>();

           for (Coc_ens_app_exer exos : coc_ens_app_exerRepositories.findAll()) {
//si dans la table ens_app_exer il y'a une ligne qui correspond en même temps à l'exercice et à l'apprenant, on charge ses questions dans la liste
               if (exos.getCoc_apprenant().getId().equals(idApprenant) && exos.getCoc_exercice().getId().equals(idExercice))
                   listQuestions.addAll(exos.getCoc_exercice().getCoc_questions());
           }
         /*  Iterator<Coc_question> itquestion = listQuestions.iterator();
           while (itquestion.hasNext()){
               itquestion.next();
               reviews += "Question numero: "+itquestion.next().getId()+" Reponse: "+reponseExacte(itquestion.next().getId());
               //review.put("Question numero"+itquestion.next().getId(), reponseExacte(itquestion.next().getId()));
               listQuestions.add(itquestion.next());
               listReponses.add(reponseExacte(itquestion.next().getId()));
           }
*/
        for (Coc_question question : listQuestions) {
                    listReponses.add(reponseExacte(question.getId()));
        }
           // review.put(question, reponseExacte(question.getId()));
        //review.put(listQuestions.get(0), reponseExacte(listQuestions.get(0).getId()));
           // for (Coc_reponse reponse : listReponses) {
                    //if (reponse.getCoc_question().getId().equals(question.getId())&& reponse.isCOC_EXACTITUDE().equals("1")) {
                        //reviews.append(question).append(question.getId()).append("\n");

                  //  }
               // }
         //   }
            //reviews.append(listQuestions);
             //reviews.append(listQuestions.toString());
            return listReponses;
        }
    }