package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
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
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Coc_client coc_client;
    @OneToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Coc_niveau coc_niveau;
    @OneToMany(mappedBy = "coc_apprenant")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Coc_ens_appr_lecon> coc_ens_appr_lecon;
    @OneToOne(mappedBy = "coc_apprenant", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Coc_user_prospect user_prospect;

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

    public Coc_client getCoc_client() {
        return coc_client;
    }

    public void setCoc_client(Coc_client coc_client) {
        this.coc_client = coc_client;
    }

    public Coc_niveau getCoc_niveau() {
        return coc_niveau;
    }

    public void setCoc_niveau(Coc_niveau coc_niveau) {
        this.coc_niveau = coc_niveau;
    }

    public Collection<Coc_ens_appr_lecon> getCoc_ens_appr_lecon() {
        return coc_ens_appr_lecon;
    }

    public void setCoc_ens_appr_lecon(Collection<Coc_ens_appr_lecon> coc_ens_appr_lecon) {
        this.coc_ens_appr_lecon = coc_ens_appr_lecon;
    }

    public Coc_user_prospect getUser_prospect() {
        return user_prospect;
    }

    public void setUser_prospect(Coc_user_prospect user_prospect) {
        this.user_prospect = user_prospect;
    }
}
