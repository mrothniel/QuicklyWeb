package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_module {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_LIBELLE;
    private String COC_AVANCEMENT_MODULE;
  /*  @OneToMany(mappedBy = "coc_module")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Collection<Coc_exercice> coc_exercices;*/

    public Long getId() {
        return id;
    }

    public String getCOC_LIBELLE() {
        return COC_LIBELLE;
    }

    public void setCOC_LIBELLE(String COC_LIBELLE) {
        this.COC_LIBELLE = COC_LIBELLE;
    }

    public String getCOC_AVANCEMENT_MODULE() {
        return COC_AVANCEMENT_MODULE;
    }

    public void setCOC_AVANCEMENT_MODULE(String COC_AVANCEMENT_MODULE) {
        this.COC_AVANCEMENT_MODULE = COC_AVANCEMENT_MODULE;
    }
/*
    public Collection<Coc_exercice> getCoc_exercices() {
        return coc_exercices;
    }

    public void setCoc_exercices(Collection<Coc_exercice> coc_exercices) {
        this.coc_exercices = coc_exercices;
    }*/
}
