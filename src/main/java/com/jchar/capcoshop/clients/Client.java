package com.jchar.capcoshop.clients;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.jchar.capcoshop.produits.Produit;

public sealed class Client permits ClientParticulier, ClientProfessionnel {
	
	private int idClient;
	
	private List<Produit> panierProduits;
	
	public Client() {
		this.panierProduits = new ArrayList<Produit>();
	}

	public int getId() {
		return idClient;
	}

	public List<Produit> getPanierProduits() {
		return List.copyOf(Objects.requireNonNull(this.panierProduits));
	}

	public void addAllProduitsPanier(List<Produit> listeProduits) {
		this.panierProduits = List.copyOf(Objects.requireNonNull(listeProduits));
	}
}
