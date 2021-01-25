package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.Collection;
import java.util.Comparator;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_exercice implements Comparable<Coc_exercice> {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String coc_type_exo;
    private String coc_question;
    private String coc_answer;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Coc_lecon coc_lecon;
    @OneToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Coc_niveau coc_niveau;
    @OneToMany(mappedBy = "coc_exercice")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Coc_suggestion>coc_suggestions;

    public Long getId() {
        return id;
    }

    public String getCoc_type_exo() {
        return coc_type_exo;
    }

    public void setCoc_type_exo(String coc_type_exo) {
        this.coc_type_exo = coc_type_exo;
    }

    public String getCoc_question() {
        return coc_question;
    }

    public void setCoc_question(String coc_question) {
        this.coc_question = coc_question;
    }

    public String getCoc_answer() {
        return coc_answer;
    }

    public void setCoc_answer(String coc_answer) {
        this.coc_answer = coc_answer;
    }

    public Coc_lecon getCoc_lecon() {
        return coc_lecon;
    }

    public void setCoc_lecon(Coc_lecon coc_lecon) {
        this.coc_lecon = coc_lecon;
    }

    public Coc_niveau getCoc_niveau() {
        return coc_niveau;
    }

    public void setCoc_niveau(Coc_niveau coc_niveau) {
        this.coc_niveau = coc_niveau;
    }

    public Collection<Coc_suggestion> getCoc_suggestions() {
        return coc_suggestions;
    }

    public void setCoc_suggestions(Collection<Coc_suggestion> coc_suggestions) {
        this.coc_suggestions = coc_suggestions;
    }

    @Override
    public int compareTo(Coc_exercice o) {
        return this.getId().compareTo(o.getId());
    }
}
