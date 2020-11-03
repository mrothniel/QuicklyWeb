package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Coc_ens_app_exer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Coc_enseignant coc_enseignant;
    @ManyToOne
    private Coc_apprenant coc_apprenant;
    @ManyToOne
    private Coc_exercice coc_exercice;

}
