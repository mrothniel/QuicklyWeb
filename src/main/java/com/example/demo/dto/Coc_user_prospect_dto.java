package com.example.demo.dto;

import com.example.demo.entities.Coc_apprenant;
import com.example.demo.entities.Coc_niveau;

public class Coc_user_prospect_dto {
    private Long id;
    private String COC_PROSPECT_pseudo;
    private String COC_PROSPOECT_tel;
    private String COC_PROSPECT_email;
    private String COC_PROSPECT_motDepasse;
    private Coc_niveau coc_niveau;
    private Coc_apprenant coc_apprenant;

    public Long getId() {
        return id;
    }

    public String getCOC_PROSPECT_pseudo() {
        return COC_PROSPECT_pseudo;
    }

    public void setCOC_PROSPECT_pseudo(String COC_PROSPECT_pseudo) {
        this.COC_PROSPECT_pseudo = COC_PROSPECT_pseudo;
    }

    public String getCOC_PROSPOECT_tel() {
        return COC_PROSPOECT_tel;
    }

    public void setCOC_PROSPOECT_tel(String COC_PROSPOECT_tel) {
        this.COC_PROSPOECT_tel = COC_PROSPOECT_tel;
    }

    public String getCOC_PROSPECT_email() {
        return COC_PROSPECT_email;
    }

    public void setCOC_PROSPECT_email(String COC_PROSPECT_email) {
        this.COC_PROSPECT_email = COC_PROSPECT_email;
    }

    public String getCOC_PROSPECT_motDepasse() {
        return COC_PROSPECT_motDepasse;
    }

    public void setCOC_PROSPECT_motDepasse(String COC_PROSPECT_motDepasse) {
        this.COC_PROSPECT_motDepasse = COC_PROSPECT_motDepasse;
    }

    public Coc_niveau getCoc_niveau() {
        return coc_niveau;
    }

    public void setCoc_niveau(Coc_niveau coc_niveau) {
        this.coc_niveau = coc_niveau;
    }

    public Coc_apprenant getCoc_apprenant() {
        return coc_apprenant;
    }

    public void setCoc_apprenant(Coc_apprenant coc_apprenant) {
        this.coc_apprenant = coc_apprenant;
    }
}
