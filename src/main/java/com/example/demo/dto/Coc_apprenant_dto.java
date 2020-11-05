package com.example.demo.dto;

import com.example.demo.entities.Coc_client;
import com.example.demo.entities.Coc_niveau;

public class Coc_apprenant_dto {
    private Long id;
    private String COC_APPRENANT_nom;
    private String COC_APPRENANT_prenom;
    private String COC_APPRENANT_email;
    private String COC_APPRENANT_motdepasse;
    private String COC_APPRENANT_TEL;
    private Coc_client client;
    private Coc_niveau coc_niveau;

    public Long getId() {
        return id;
    }

    public String getCOC_APPRENANT_nom() {
        return COC_APPRENANT_nom;
    }

    public void setCOC_APPRENANT_nom(String COC_APPRENANT_nom) {
        this.COC_APPRENANT_nom = COC_APPRENANT_nom;
    }

    public String getCOC_APPRENANT_prenom() {
        return COC_APPRENANT_prenom;
    }

    public void setCOC_APPRENANT_prenom(String COC_APPRENANT_prenom) {
        this.COC_APPRENANT_prenom = COC_APPRENANT_prenom;
    }

    public String getCOC_APPRENANT_email() {
        return COC_APPRENANT_email;
    }

    public void setCOC_APPRENANT_email(String COC_APPRENANT_email) {
        this.COC_APPRENANT_email = COC_APPRENANT_email;
    }

    public String getCOC_APPRENANT_motdepasse() {
        return COC_APPRENANT_motdepasse;
    }

    public void setCOC_APPRENANT_motdepasse(String COC_APPRENANT_motdepasse) {
        this.COC_APPRENANT_motdepasse = COC_APPRENANT_motdepasse;
    }

    public String getCOC_APPRENANT_TEL() {
        return COC_APPRENANT_TEL;
    }

    public void setCOC_APPRENANT_TEL(String COC_APPRENANT_TEL) {
        this.COC_APPRENANT_TEL = COC_APPRENANT_TEL;
    }

    public Coc_client getClient() {
        return client;
    }

    public void setClient(Coc_client client) {
        this.client = client;
    }

    public Coc_niveau getCoc_niveau() {
        return coc_niveau;
    }

    public void setCoc_niveau(Coc_niveau coc_niveau) {
        this.coc_niveau = coc_niveau;
    }
}
