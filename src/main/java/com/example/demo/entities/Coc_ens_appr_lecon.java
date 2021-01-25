package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString
public class Coc_ens_appr_lecon {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Coc_enseignant coc_enseignant;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Coc_apprenant coc_apprenant;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Coc_lecon coc_lecon;

    private long coc_score;

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

    public Coc_lecon getCoc_lecon() {
        return coc_lecon;
    }

    public void setCoc_lecon(Coc_lecon coc_lecon) {
        this.coc_lecon = coc_lecon;
    }

    public long getCoc_score() {
        return coc_score;
    }

    public void setCoc_score(long coc_score) {
        this.coc_score = coc_score;
    }
}
