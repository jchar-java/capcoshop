package com.jchar.capcoshop.calculpanier.impl;

import java.util.List;

import com.jchar.capcoshop.calculpanier.CalculPanier;
import com.jchar.capcoshop.produits.Produit;

public class CalculPanierClientProfessionnelPlus implements CalculPanier {

	@Override
	public int calculerPanier(List<Produit> panierProduits) {
		if(panierProduits != null && !panierProduits.isEmpty()) {
			return panierProduits.stream().mapToInt(produit -> produit.getPrixProfessionnelSup()).sum();
		}
		return 0;
	}
}
