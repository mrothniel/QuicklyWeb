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
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_client {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String COC_CLIENT_nom;
  private String COC_CLIENT_prenom;
  private String COC_CLIENT_email;
  private String COC_CLIENT_motdepasse;
  private String COC_CLIENT_statut;
  private String COC_CLIENT_nomcom;
  private String COC_CLIENT_tel;
  private String COC_CLIENT_adresse;
  private String COC_CLIENT_cpprivate;
  private String COC_CLIENT_ville;

}
