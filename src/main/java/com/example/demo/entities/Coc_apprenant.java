package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_apprenant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_APPRENANT_nom;
    private String COC_APPRENANT_prenom;
    private String COC_APPRENANT_email;
    private String COC_APPRENANT_motdepasse;
    private String COC_APPRENANT_TEL;
    @ManyToOne
    private Coc_client client;
    @OneToOne
    private Coc_niveau coc_niveau;
    @OneToMany(mappedBy = "coc_apprenant")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Coc_ens_app_exer> coc_ens_app_exers;

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

    public Collection<Coc_ens_app_exer> getCoc_ens_app_exers() {
        return coc_ens_app_exers;
    }

    public void setCoc_ens_app_exers(Collection<Coc_ens_app_exer> coc_ens_app_exers) {
        this.coc_ens_app_exers = coc_ens_app_exers;
    }
}
