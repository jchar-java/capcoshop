package com.jchar.capcoshop.clients;

import java.util.ArrayList;
import java.util.List;

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
		return new ArrayList<Produit>(this.panierProduits);
	}

	public void setPanierProduits(List<Produit> listeProduits) {
		this.panierProduits = new ArrayList<Produit>();
		if(listeProduits != null && !listeProduits.isEmpty()) {
			for(Produit produit : listeProduits) {
				this.panierProduits.add(produit);
			}
		}
	}
}
