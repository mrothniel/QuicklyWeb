package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_reponse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_LIBELLE;
    private String COC_EXACTITUDE;
    @ManyToOne //(fetch = FetchType.LAZY)
   // @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
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

    public String isCOC_EXACTITUDE() {
        return COC_EXACTITUDE;
    }

    public void setCOC_EXACTITUDE(String COC_EXACTITUDE) {
        this.COC_EXACTITUDE = COC_EXACTITUDE;
    }

    public Coc_question getCoc_question() {
        return coc_question;
    }

    public void setCoc_question(Coc_question coc_question) {
        this.coc_question = coc_question;
    }
}
