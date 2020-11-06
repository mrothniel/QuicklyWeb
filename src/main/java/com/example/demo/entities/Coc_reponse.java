package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_reponse implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_LIBELLE;
    private boolean COC_EXACTITUDE;
    @ManyToOne
    private Coc_question coc_question;

    public Long getId() {
        return id;
    }

    public String getCOC_LIBELLE() {
        return COC_LIBELLE;
    }

    public void setCOC_LIBELLE(String COC_LIBELLE) {
        this.COC_LIBELLE = COC_LIBELLE;
    }

    public boolean isCOC_EXACTITUDE() {
        return COC_EXACTITUDE;
    }

    public void setCOC_EXACTITUDE(boolean COC_EXACTITUDE) {
        this.COC_EXACTITUDE = COC_EXACTITUDE;
    }

    public Coc_question getCoc_question() {
        return coc_question;
    }

    public void setCoc_question(Coc_question coc_question) {
        this.coc_question = coc_question;
    }
}
