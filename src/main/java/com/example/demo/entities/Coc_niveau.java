package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString
public class Coc_niveau {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String libelle;

   public Long getId() {
      return id;
   }

   public String getLibelle() {
      return libelle;
   }

   public void setLibelle(String libelle) {
      this.libelle = libelle;
   }
}
