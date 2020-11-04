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
@AllArgsConstructor @NoArgsConstructor @ToString
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

  public Long getId() {
    return id;
  }

  public String getCOC_CLIENT_nom() {
    return COC_CLIENT_nom;
  }

  public void setCOC_CLIENT_nom(String COC_CLIENT_nom) {
    this.COC_CLIENT_nom = COC_CLIENT_nom;
  }

  public String getCOC_CLIENT_prenom() {
    return COC_CLIENT_prenom;
  }

  public void setCOC_CLIENT_prenom(String COC_CLIENT_prenom) {
    this.COC_CLIENT_prenom = COC_CLIENT_prenom;
  }

  public String getCOC_CLIENT_email() {
    return COC_CLIENT_email;
  }

  public void setCOC_CLIENT_email(String COC_CLIENT_email) {
    this.COC_CLIENT_email = COC_CLIENT_email;
  }

  public String getCOC_CLIENT_motdepasse() {
    return COC_CLIENT_motdepasse;
  }

  public void setCOC_CLIENT_motdepasse(String COC_CLIENT_motdepasse) {
    this.COC_CLIENT_motdepasse = COC_CLIENT_motdepasse;
  }

  public String getCOC_CLIENT_statut() {
    return COC_CLIENT_statut;
  }

  public void setCOC_CLIENT_statut(String COC_CLIENT_statut) {
    this.COC_CLIENT_statut = COC_CLIENT_statut;
  }

  public String getCOC_CLIENT_nomcom() {
    return COC_CLIENT_nomcom;
  }

  public void setCOC_CLIENT_nomcom(String COC_CLIENT_nomcom) {
    this.COC_CLIENT_nomcom = COC_CLIENT_nomcom;
  }

  public String getCOC_CLIENT_tel() {
    return COC_CLIENT_tel;
  }

  public void setCOC_CLIENT_tel(String COC_CLIENT_tel) {
    this.COC_CLIENT_tel = COC_CLIENT_tel;
  }

  public String getCOC_CLIENT_adresse() {
    return COC_CLIENT_adresse;
  }

  public void setCOC_CLIENT_adresse(String COC_CLIENT_adresse) {
    this.COC_CLIENT_adresse = COC_CLIENT_adresse;
  }

  public String getCOC_CLIENT_cpprivate() {
    return COC_CLIENT_cpprivate;
  }

  public void setCOC_CLIENT_cpprivate(String COC_CLIENT_cpprivate) {
    this.COC_CLIENT_cpprivate = COC_CLIENT_cpprivate;
  }

  public String getCOC_CLIENT_ville() {
    return COC_CLIENT_ville;
  }

  public void setCOC_CLIENT_ville(String COC_CLIENT_ville) {
    this.COC_CLIENT_ville = COC_CLIENT_ville;
  }
}
