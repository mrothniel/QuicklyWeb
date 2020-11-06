package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_exercice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_LIBELLE;
    private String COC_AVANCEMENT_EXERCICE;
    @ManyToOne(fetch = FetchType.LAZY)
    private Coc_module coc_module;
    @OneToOne
    private Coc_niveau coc_niveau;
    @OneToMany(mappedBy = "coc_exercice")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Coc_ens_app_exer> coc_ens_app_exers;
    @OneToMany(mappedBy = "coc_exercice")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Coc_question>coc_questions;

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

    public Collection<Coc_ens_app_exer> getCoc_ens_app_exers() {
        return coc_ens_app_exers;
    }

    public void setCoc_ens_app_exers(Collection<Coc_ens_app_exer> coc_ens_app_exers) {
        this.coc_ens_app_exers = coc_ens_app_exers;
    }

    public Collection<Coc_question> getCoc_questions() {
        return coc_questions;
    }

    public void setCoc_questions(Collection<Coc_question> coc_questions) {
        this.coc_questions = coc_questions;
    }
}
