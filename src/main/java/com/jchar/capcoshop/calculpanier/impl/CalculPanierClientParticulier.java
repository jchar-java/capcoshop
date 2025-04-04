package com.jchar.capcoshop.calculpanier.impl;

import java.util.List;

import com.jchar.capcoshop.calculpanier.CalculPanier;
import com.jchar.capcoshop.produits.Produit;

public final class CalculPanierClientParticulier implements CalculPanier {

	@Override
	public int calculerPanier(List<Produit> panierProduits) {
		if(panierProduits != null && !panierProduits.isEmpty()) {
			return panierProduits.stream().mapToInt(produit -> produit.getPrixParticulier()).sum();
		}
		return 0;
	}

}
