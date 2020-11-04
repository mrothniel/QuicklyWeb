package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_user_prospect {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_PROSPECT_pseudo;
    private String COC_PROSPOECT_tel;
    private String COC_PROSPECT_email;
    private String COC_PROSPECT_motDepasse;
    @OneToOne
    private Coc_niveau coc_niveau;

}
