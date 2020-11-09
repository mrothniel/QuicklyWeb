package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString
public class Coc_niveau {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String libelle;
   @OneToOne(mappedBy = "coc_niveau")
   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   private Coc_apprenant apprenant;
   @OneToOne(mappedBy = "coc_niveau")
   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   private Coc_exercice exercice;
   @OneToOne(mappedBy = "coc_niveau")
   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   private Coc_user_prospect user_prospect;

   public Long getId() {
      return id;
   }

   public String getLibelle() {
      return libelle;
   }

   public void setLibelle(String libelle) {
      this.libelle = libelle;
   }

   public Coc_apprenant getApprenant() {
      return apprenant;
   }

   public void setApprenant(Coc_apprenant apprenant) {
      this.apprenant = apprenant;
   }

   public Coc_exercice getExercice() {
      return exercice;
   }

   public void setExercice(Coc_exercice exercice) {
      this.exercice = exercice;
   }

   public Coc_user_prospect getUser_prospect() {
      return user_prospect;
   }

   public void setUser_prospect(Coc_user_prospect user_prospect) {
      this.user_prospect = user_prospect;
   }
}
