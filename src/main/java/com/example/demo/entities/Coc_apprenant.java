package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_apprenant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_APPRENANT_nom;
    private String COC_APPRENANT_prenom;
    private String COC_APPRENANT_email;
    private String COC_APPRENANT_motdepasse;
    private String COC_APPRENANT_TEL;
    @ManyToOne
    private Coc_client client;
    @Enumerated(EnumType.STRING)
    private Coc_niveau coc_niveau;
    @OneToMany(mappedBy = "coc_apprenant")
    private Collection<Coc_ens_app_exer> coc_ens_app_exers;
}
