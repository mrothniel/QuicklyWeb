package com.example.demo.dto;

import com.example.demo.entities.Coc_question;

public class Coc_reponse_dto {
    private Long id;
    private String COC_LIBELLE;
    private String COC_EXACTITUDE;
    private Coc_question coc_question;

    public Long getId() {
        return id;
    }

    public String getCOC_LIBELLE() {
        return COC_LIBELLE;
    }

    public void setCOC_LIBELLE(String COC_LIBELLE) {
        this.COC_LIBELLE = COC_LIBELLE;
    }

    public String getCOC_EXACTITUDE() {
        return COC_EXACTITUDE;
    }

    public void setCOC_EXACTITUDE(String COC_EXACTITUDE) {
        this.COC_EXACTITUDE = COC_EXACTITUDE;
    }

    public Coc_question getCoc_question() {
        return coc_question;
    }

    public void setCoc_question(Coc_question coc_question) {
        this.coc_question = coc_question;
    }
}
