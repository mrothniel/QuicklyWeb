package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_exercice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_LIBELLE;
    private String COC_AVANCEMENT_EXERCICE;
    @ManyToOne
    private Coc_module coc_module;
    @Enumerated(EnumType.STRING)
    private Coc_niveau coc_niveau;
    @OneToMany(mappedBy = "coc_exercice")
    private Collection<Coc_ens_app_exer> coc_ens_app_exers;
    @OneToMany(mappedBy = "coc_exercice")
    private Collection<Coc_question>coc_questions;

}
