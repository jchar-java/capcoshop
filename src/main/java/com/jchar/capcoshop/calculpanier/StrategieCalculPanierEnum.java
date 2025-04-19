package com.jchar.capcoshop.calculpanier;

import java.util.List;
import java.util.Objects;

import com.jchar.capcoshop.produits.Produit;

public enum StrategieCalculPanierEnum {

	PARTICULIER {
		@Override
		public	int calculerPanier(List<Produit> produits) {
			return Objects.requireNonNull(produits)
					.stream()
					.filter(p -> Objects.nonNull(p))
					.mapToInt(produit -> produit.getPrixParticulier())
					.sum();
		}
	},
	PRO {
		@Override
		public	int calculerPanier(List<Produit> produits) {
			return Objects.requireNonNull(produits)
					.stream()
					.filter(p -> Objects.nonNull(p))
					.mapToInt(produit -> produit.getPrixProfessionnel())
					.sum();
		}
	},
	PRO_SUP {
		@Override
		public int calculerPanier(List<Produit> produits) {
			return Objects.requireNonNull(produits)
					.stream()
					.filter(p -> Objects.nonNull(p))
					.mapToInt(produit -> produit.getPrixProfessionnelSup())
					.sum();
		}
	};

	public abstract int calculerPanier(List<Produit> produits);
}
