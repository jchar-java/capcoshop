package com.jchar.capcoshop.calculpanier;

import java.util.List;

import com.jchar.capcoshop.produits.Produit;

public interface StrategieCalculPanier {
	
	public int calculerPanier(List<Produit> panierProduits);

}
