package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_suggestion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String coc_name_sugg;
    private String coc_image;
    private String coc_media;
    @ManyToOne //(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Coc_exercice coc_exercice;

    public Long getId() {
        return id;
    }

    public String getCoc_name_sugg() {
        return coc_name_sugg;
    }

    public void setCoc_name_sugg(String coc_name_sugg) {
        this.coc_name_sugg = coc_name_sugg;
    }

    public String getCoc_image() {
        return coc_image;
    }

    public void setCoc_image(String coc_image) {
        this.coc_image = coc_image;
    }

    public String getCoc_media() {
        return coc_media;
    }

    public void setCoc_media(String coc_media) {
        this.coc_media = coc_media;
    }

    public Coc_exercice getCoc_exercice() {
        return coc_exercice;
    }

    public void setCoc_exercice(Coc_exercice coc_exercice) {
        this.coc_exercice = coc_exercice;
    }
}
