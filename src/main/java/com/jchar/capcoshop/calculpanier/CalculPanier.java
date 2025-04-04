package com.jchar.capcoshop.calculpanier;

import java.util.List;

import com.jchar.capcoshop.produits.Produit;

public interface CalculPanier {
	
	public int calculerPanier(List<Produit> panierProduits);

}
