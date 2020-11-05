package com.example.demo.dto;

import com.example.demo.entities.Coc_apprenant;
import com.example.demo.entities.Coc_enseignant;
import com.example.demo.entities.Coc_exercice;

public class Coc_ens_app_exer_dto {
    private Long id;
    private Coc_enseignant coc_enseignant;
    private Coc_apprenant coc_apprenant;
    private Coc_exercice coc_exercice;

    public Long getId() {
        return id;
    }

    public Coc_enseignant getCoc_enseignant() {
        return coc_enseignant;
    }

    public void setCoc_enseignant(Coc_enseignant coc_enseignant) {
        this.coc_enseignant = coc_enseignant;
    }

    public Coc_apprenant getCoc_apprenant() {
        return coc_apprenant;
    }

    public void setCoc_apprenant(Coc_apprenant coc_apprenant) {
        this.coc_apprenant = coc_apprenant;
    }

    public Coc_exercice getCoc_exercice() {
        return coc_exercice;
    }

    public void setCoc_exercice(Coc_exercice coc_exercice) {
        this.coc_exercice = coc_exercice;
    }
}
