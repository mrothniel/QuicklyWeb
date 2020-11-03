package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_enseignant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_ENSEIGNANT_nom;
    private String COC_ENSEIGNANT_prenom;
    private String COC_ENSEIGNANT_email;
    private String COC_ENSEIGNANT_motdepasse;
    private String COC_ENSEIGNANT_tauxheures;
    private String COC_ENSEIGNANT_statut;
    private String COC_ENSEIGNANT_etat;
    @OneToMany(mappedBy = "coc_enseignant")
    private Collection<Coc_ens_app_exer> coc_ens_app_exers;

}
