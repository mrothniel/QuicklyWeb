package com.example.demo.dto;

public class Coc_module_dto {
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
