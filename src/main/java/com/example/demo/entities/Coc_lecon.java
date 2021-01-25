package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_lecon implements Comparable<Coc_lecon>{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String coc_name;
    private String coc_title;
    @OneToMany(mappedBy = "coc_lecon")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Coc_exercice> coc_exercices;
    @OneToMany(mappedBy = "coc_lecon")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Coc_ens_appr_lecon> coc_ens_appr_lecons;

    public Long getId() {
        return id;
    }

    public String getCoc_name() {
        return coc_name;
    }

    public void setCoc_name(String coc_name) {
        this.coc_name = coc_name;
    }

    public String getCoc_title() {
        return coc_title;
    }

    public void setCoc_title(String coc_title) {
        this.coc_title = coc_title;
    }

    public Collection<Coc_exercice> getCoc_exercices() {
        return coc_exercices;
    }

    public void setCoc_exercices(Collection<Coc_exercice> coc_exercices) {
        this.coc_exercices = coc_exercices;
    }

    public Collection<Coc_ens_appr_lecon> getCoc_ens_appr_lecons() {
        return coc_ens_appr_lecons;
    }

    public void setCoc_ens_appr_lecons(Collection<Coc_ens_appr_lecon> coc_ens_appr_lecons) {
        this.coc_ens_appr_lecons = coc_ens_appr_lecons;
    }

    @Override
    public int compareTo(Coc_lecon o) {
        return this.getCoc_name().compareToIgnoreCase(o.getCoc_name());
    }
}
