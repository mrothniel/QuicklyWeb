package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_question {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_INSTRUCTION;
    private String COC_TYPE;
    private String COC_LIBELLE;
    private String COC_VOICE;
    private String COC_IMAGE;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Coc_exercice coc_exercice;
    @OneToMany
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Coc_reponse> coc_reponses;

    public Long getId() {
        return id;
    }

    public String getCOC_INSTRUCTION() {
        return COC_INSTRUCTION;
    }

    public void setCOC_INSTRUCTION(String COC_INSTRUCTION) {
        this.COC_INSTRUCTION = COC_INSTRUCTION;
    }

    public String getCOC_TYPE() {
        return COC_TYPE;
    }

    public void setCOC_TYPE(String COC_TYPE) {
        this.COC_TYPE = COC_TYPE;
    }

    public String getCOC_LIBELLE() {
        return COC_LIBELLE;
    }

    public void setCOC_LIBELLE(String COC_LIBELLE) {
        this.COC_LIBELLE = COC_LIBELLE;
    }

    public String getCOC_VOICE() {
        return COC_VOICE;
    }

    public void setCOC_VOICE(String COC_VOICE) {
        this.COC_VOICE = COC_VOICE;
    }

    public Coc_exercice getCoc_exercice() {
        return coc_exercice;
    }

    public void setCoc_exercice(Coc_exercice coc_exercice) {
        this.coc_exercice = coc_exercice;
    }

    public String getCOC_IMAGE() {
        return COC_IMAGE;
    }

    public void setCOC_IMAGE(String COC_IMAGE) {
        this.COC_IMAGE = COC_IMAGE;
    }

    public Collection<Coc_reponse> getCoc_reponses() {
        return coc_reponses;
    }

    public void setCoc_reponses(Collection<Coc_reponse> coc_reponses) {
        this.coc_reponses = coc_reponses;
    }
}
