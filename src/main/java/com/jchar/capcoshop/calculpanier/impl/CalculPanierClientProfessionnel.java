package com.jchar.capcoshop.calculpanier.impl;

import java.util.List;
import java.util.Objects;

import com.jchar.capcoshop.calculpanier.StrategieCalculPanier;
import com.jchar.capcoshop.produits.Produit;

public class CalculPanierClientProfessionnel implements StrategieCalculPanier {

	@Override
	public int calculerPanier(List<Produit> panierProduits) {
		return Objects.requireNonNull(panierProduits)
				.stream()
				.filter(p -> Objects.nonNull(p))
				.mapToInt(produit -> produit.getPrixProfessionnel())
				.sum();
	}
}
