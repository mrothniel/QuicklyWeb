package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_module {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_LIBELLE;
    private String COC_AVANCEMENT_MODULE;
}
