package com.example.demo.dto;

import com.example.demo.entities.Coc_exercice;

public class Coc_question_dto {
    private Long id;
    private String COC_INSTRUCTION;
    private String COC_TYPE;
    private String COC_LIBELLE;
    private String COC_VOICE;
    private Coc_exercice coc_exercice;

    public Long getId() {
        return id;
    }

    public String getCOC_INSTRUCTION() {
        return COC_INSTRUCTION;
    }

    public void setCOC_INSTRUCTION(String COC_INSTRUCTION) {
        this.COC_INSTRUCTION = COC_INSTRUCTION;
    }

    public String getCOC_TYPE() {
        return COC_TYPE;
    }

    public void setCOC_TYPE(String COC_TYPE) {
        this.COC_TYPE = COC_TYPE;
    }

    public String getCOC_LIBELLE() {
        return COC_LIBELLE;
    }

    public void setCOC_LIBELLE(String COC_LIBELLE) {
        this.COC_LIBELLE = COC_LIBELLE;
    }

    public String getCOC_VOICE() {
        return COC_VOICE;
    }

    public void setCOC_VOICE(String COC_VOICE) {
        this.COC_VOICE = COC_VOICE;
    }

    public Coc_exercice getCoc_exercice() {
        return coc_exercice;
    }

    public void setCoc_exercice(Coc_exercice coc_exercice) {
        this.coc_exercice = coc_exercice;
    }
}
