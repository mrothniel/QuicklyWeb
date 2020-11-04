package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_module {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_LIBELLE;
    private String COC_AVANCEMENT_MODULE;

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
}
