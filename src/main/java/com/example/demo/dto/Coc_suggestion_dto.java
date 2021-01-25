package com.example.demo.dto;

import com.example.demo.entities.Coc_exercice;

public class Coc_suggestion_dto {
    private Long id;
    private String coc_name_sugg;
    private String coc_image;
    private String coc_media;
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

    public void setCoc_exercice(Coc_exercice coc_exercice) {
        this.coc_exercice = coc_exercice;
    }

    public Coc_exercice getCoc_exercice() {
        return coc_exercice;
    }

    public void setCoc_question(Coc_exercice coc_exercice) {
        this.coc_exercice = coc_exercice;
    }
}
