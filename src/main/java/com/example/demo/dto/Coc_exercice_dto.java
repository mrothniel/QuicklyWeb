package com.example.demo.dto;

import com.example.demo.entities.Coc_module;
import com.example.demo.entities.Coc_niveau;

public class Coc_exercice_dto {
    private Long id;
    private String COC_LIBELLE;
    private String COC_AVANCEMENT_EXERCICE;
    private Coc_module coc_module;
    private Coc_niveau coc_niveau;

    public Long getId() {
        return id;
    }

    public String getCOC_LIBELLE() {
        return COC_LIBELLE;
    }

    public void setCOC_LIBELLE(String COC_LIBELLE) {
        this.COC_LIBELLE = COC_LIBELLE;
    }

    public String getCOC_AVANCEMENT_EXERCICE() {
        return COC_AVANCEMENT_EXERCICE;
    }

    public void setCOC_AVANCEMENT_EXERCICE(String COC_AVANCEMENT_EXERCICE) {
        this.COC_AVANCEMENT_EXERCICE = COC_AVANCEMENT_EXERCICE;
    }

    public Coc_module getCoc_module() {
        return coc_module;
    }

    public void setCoc_module(Coc_module coc_module) {
        this.coc_module = coc_module;
    }

    public Coc_niveau getCoc_niveau() {
        return coc_niveau;
    }

    public void setCoc_niveau(Coc_niveau coc_niveau) {
        this.coc_niveau = coc_niveau;
    }
}
