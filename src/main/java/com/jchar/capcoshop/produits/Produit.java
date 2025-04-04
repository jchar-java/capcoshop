package com.jchar.capcoshop.produits;

public class Produit {
	
	private int idProduit;
	
	private int prixParticulier;
	
	private int prixProfessionnelSup;
	
	private int prixProfessionnel;

	public Produit(int prixParticulier, int prixProfessionnelSup, int prixProfessionnel) {
		super();
		this.prixParticulier = prixParticulier;
		this.prixProfessionnelSup = prixProfessionnelSup;
		this.prixProfessionnel = prixProfessionnel;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public int getPrixParticulier() {
		return prixParticulier;
	}

	public void setPrixParticulier(int prixParticulier) {
		this.prixParticulier = prixParticulier;
	}

	public int getPrixProfessionnelSup() {
		return prixProfessionnelSup;
	}

	public void setPrixProfessionnelSup(int prixProfessionnelSup) {
		this.prixProfessionnelSup = prixProfessionnelSup;
	}

	public int getPrixProfessionnel() {
		return prixProfessionnel;
	}

	public void setPrixProfessionnel(int prixProfessionnel) {
		this.prixProfessionnel = prixProfessionnel;
	}
}
