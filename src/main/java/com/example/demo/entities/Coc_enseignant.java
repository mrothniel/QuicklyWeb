package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_enseignant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_ENSEIGNANT_nom;
    private String COC_ENSEIGNANT_prenom;
    private String COC_ENSEIGNANT_email;
    private String COC_ENSEIGNANT_motdepasse;
    private String COC_ENSEIGNANT_tauxheures;
    private String COC_ENSEIGNANT_statut;
    private String COC_ENSEIGNANT_etat;
    @OneToMany(mappedBy = "coc_enseignant")
    private Collection<Coc_ens_app_exer> coc_ens_app_exers;

    public Long getId() {
        return id;
    }

    public String getCOC_ENSEIGNANT_nom() {
        return COC_ENSEIGNANT_nom;
    }

    public void setCOC_ENSEIGNANT_nom(String COC_ENSEIGNANT_nom) {
        this.COC_ENSEIGNANT_nom = COC_ENSEIGNANT_nom;
    }

    public String getCOC_ENSEIGNANT_prenom() {
        return COC_ENSEIGNANT_prenom;
    }

    public void setCOC_ENSEIGNANT_prenom(String COC_ENSEIGNANT_prenom) {
        this.COC_ENSEIGNANT_prenom = COC_ENSEIGNANT_prenom;
    }

    public String getCOC_ENSEIGNANT_email() {
        return COC_ENSEIGNANT_email;
    }

    public void setCOC_ENSEIGNANT_email(String COC_ENSEIGNANT_email) {
        this.COC_ENSEIGNANT_email = COC_ENSEIGNANT_email;
    }

    public String getCOC_ENSEIGNANT_motdepasse() {
        return COC_ENSEIGNANT_motdepasse;
    }

    public void setCOC_ENSEIGNANT_motdepasse(String COC_ENSEIGNANT_motdepasse) {
        this.COC_ENSEIGNANT_motdepasse = COC_ENSEIGNANT_motdepasse;
    }

    public String getCOC_ENSEIGNANT_tauxheures() {
        return COC_ENSEIGNANT_tauxheures;
    }

    public void setCOC_ENSEIGNANT_tauxheures(String COC_ENSEIGNANT_tauxheures) {
        this.COC_ENSEIGNANT_tauxheures = COC_ENSEIGNANT_tauxheures;
    }

    public String getCOC_ENSEIGNANT_statut() {
        return COC_ENSEIGNANT_statut;
    }

    public void setCOC_ENSEIGNANT_statut(String COC_ENSEIGNANT_statut) {
        this.COC_ENSEIGNANT_statut = COC_ENSEIGNANT_statut;
    }

    public String getCOC_ENSEIGNANT_etat() {
        return COC_ENSEIGNANT_etat;
    }

    public void setCOC_ENSEIGNANT_etat(String COC_ENSEIGNANT_etat) {
        this.COC_ENSEIGNANT_etat = COC_ENSEIGNANT_etat;
    }

    public Collection<Coc_ens_app_exer> getCoc_ens_app_exers() {
        return coc_ens_app_exers;
    }

    public void setCoc_ens_app_exers(Collection<Coc_ens_app_exer> coc_ens_app_exers) {
        this.coc_ens_app_exers = coc_ens_app_exers;
    }
}
