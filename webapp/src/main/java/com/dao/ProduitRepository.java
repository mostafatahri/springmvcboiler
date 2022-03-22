package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.entities.Produit;

@Repository
public class ProduitRepository {

	private static final ProduitRepository SINGLE_INSTANCE = new ProduitRepository();

    private List<Produit> Produits = new ArrayList<>();
	
	private ProduitRepository() {
		Produits.add(new Produit(1,"HP 15.6in Pentium Gold",5.5,1,"https://www.intel.fr/content/dam/www/central-libraries/us/en/images/alder-lake-laptop-windows.png.rendition.intel.web.480.270.png"));
		Produits.add(new Produit(2,"ASUS X415",5.5,1,"https://static.acer.com/up/Resource/Acer/Laptops/Nitro_5/Image/20211227/Nitro5-AN517-42-rgbkb-Backlit-modelmain.png"));
		Produits.add(new Produit(3,"Dell Latitude 15 3520 Laptop",5.5,1,"https://www.laptopspirit.fr/wp-content/uploads/new/2022/03/test-Acer-Swift-3-SF316-51-1024x649.jpeg"));
		Produits.add(new Produit(4,"GeForce RTX série 30 | NVIDIA",5.5,1,"https://virginmegastore.ma/storage/2020/11/vul.jpg"));
		Produits.add(new Produit(5,"Lenovo Ideapad 3 15.6 FHD",5.5,1,"https://media.4rgos.it/i/Argos/7354072_R_Z001A?w=750&h=440&qlt=70"));
		Produits.add(new Produit(6,"Microsoft Surface Laptop 3",5.5,1,"https://techcrunch.com/wp-content/uploads/2020/12/nokia-laptop.jpg"));

	}

	public static ProduitRepository getInstance() {
		return SINGLE_INSTANCE;
	}
	
	public List<Produit> ShowProduits(){
		return Produits;
	}
	
	public void AddProduit(Produit p) {
		Produits.add(p);
	}

}
