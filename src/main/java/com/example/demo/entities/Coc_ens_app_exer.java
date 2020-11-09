package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString
public class Coc_ens_app_exer {
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
