package com.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Produit {
	 private int id;
	 private String Libelle;
	 private double prix;
	 private int quantites;
	 private String photopath;
}
