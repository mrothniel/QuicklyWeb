package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_reponse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_LIBELLE;
    private String COC_EXACTITUDE;
    @ManyToOne
    private Coc_question coc_question;
}
