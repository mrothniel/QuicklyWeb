package com.example.demo.dto;

import com.example.demo.entities.Coc_lecon;
import com.example.demo.entities.Coc_niveau;

public class Coc_exercice_dto {
    private Long id;
    private String coc_type_exo;
    private String coc_question;
    private String coc_answer;
    private Coc_lecon coc_lecon;
    private Coc_niveau coc_niveau;

    public Long getId() {
        return id;
    }

    public String getCoc_type_exo() {
        return coc_type_exo;
    }

    public void setCoc_type_exo(String coc_type_exo) {
        this.coc_type_exo = coc_type_exo;
    }

    public String getCoc_question() {
        return coc_question;
    }

    public void setCoc_question(String coc_question) {
        this.coc_question = coc_question;
    }

    public String getCoc_answer() {
        return coc_answer;
    }

    public void setCoc_answer(String coc_answer) {
        this.coc_answer = coc_answer;
    }

    public Coc_lecon getCoc_lecon() {
        return coc_lecon;
    }

    public void setCoc_lecon(Coc_lecon coc_lecon) {
        this.coc_lecon = coc_lecon;
    }

    public Coc_niveau getCoc_niveau() {
        return coc_niveau;
    }

    public void setCoc_niveau(Coc_niveau coc_niveau) {
        this.coc_niveau = coc_niveau;
    }
}
