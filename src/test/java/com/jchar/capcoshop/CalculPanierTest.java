package com.jchar.capcoshop;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.jchar.capcoshop.calculpanier.StrategieCalculPanierEnum;
import com.jchar.capcoshop.clients.ClientParticulier;
import com.jchar.capcoshop.clients.ClientProfessionnel;
import com.jchar.capcoshop.produits.OrdinateurPortable;
import com.jchar.capcoshop.produits.Produit;
import com.jchar.capcoshop.produits.TelephoneHautDeGamme;
import com.jchar.capcoshop.produits.TelephoneMoyenGamme;

class CalculPanierTest {
	
	@Test
	void testCalculerPanierClientParticulierVide() {
		ClientParticulier clientParticulier = new ClientParticulier("Sam", "Fisher");
		StrategieCalculPanierEnum calculPanier = Main.determinerStrategieCalculPanier(clientParticulier);
		assertEquals(0, calculPanier.calculerPanier(clientParticulier.getPanierProduits()));
	}

	@Test
	void testCalculerPanierClientParticulierDeTroisProduitsDifferents() {
		TelephoneHautDeGamme telephoneHautDeGamme = new TelephoneHautDeGamme(1500, 1000, 1150);
		TelephoneMoyenGamme telephoneMoyenGamme = new TelephoneMoyenGamme(800, 550, 600);
		OrdinateurPortable ordinateurPortable = new OrdinateurPortable(1200, 900, 1000);
		ClientParticulier clientParticulier = new ClientParticulier("Sam", "Fisher");
		
		ArrayList<Produit> panierParticulier = new ArrayList<Produit>();
		panierParticulier.add(telephoneHautDeGamme);
		panierParticulier.add(telephoneMoyenGamme);
		panierParticulier.add(ordinateurPortable);
		
		clientParticulier.addAllProduitsPanier(panierParticulier);

		StrategieCalculPanierEnum calculPanier = Main.determinerStrategieCalculPanier(clientParticulier);
		assertEquals(3500, calculPanier.calculerPanier(clientParticulier.getPanierProduits()));
	}

	@Test
	void testCalculerPanierClientParticulierDontProduitsIdentiques() {
		TelephoneHautDeGamme telephoneHautDeGamme = new TelephoneHautDeGamme(1500, 1000, 1150);
		OrdinateurPortable ordinateurPortable = new OrdinateurPortable(1200, 900, 1000);
		ClientParticulier particulier = new ClientParticulier("Sam", "Fisher");
		
		ArrayList<Produit> panierParticulier = new ArrayList<Produit>();
		panierParticulier.add(telephoneHautDeGamme);
		panierParticulier.add(ordinateurPortable);
		panierParticulier.add(telephoneHautDeGamme);
		
		particulier.addAllProduitsPanier(panierParticulier);

		StrategieCalculPanierEnum calculPanier = Main.determinerStrategieCalculPanier(particulier);
		assertEquals(4200, calculPanier.calculerPanier(particulier.getPanierProduits()));
	}
	
	@Test
	void testCalculerPanierClientProSupVide() {
		ClientProfessionnel clientProSup = new ClientProfessionnel("Rockstar Games", "", "123 456 789", 11000000);
		StrategieCalculPanierEnum calculPanier = Main.determinerStrategieCalculPanier(clientProSup);
		assertEquals(0, calculPanier.calculerPanier(clientProSup.getPanierProduits()));
	}

	@Test
	void testCalculerPanierClientProfessionnelSupDeTroisProduitsDifferents() {
		TelephoneHautDeGamme telephoneHautDeGamme = new TelephoneHautDeGamme(1500, 1000, 1150);
		TelephoneMoyenGamme telephoneMoyenGamme = new TelephoneMoyenGamme(800, 550, 600);
		OrdinateurPortable ordinateurPortable = new OrdinateurPortable(1200, 900, 1000);
		ClientProfessionnel proSup = new ClientProfessionnel("Rockstar Games", "", "123 456 789", 11000000);
		
		ArrayList<Produit> panierProSup = new ArrayList<Produit>();
		panierProSup.add(telephoneHautDeGamme);
		panierProSup.add(ordinateurPortable);
		panierProSup.add(telephoneMoyenGamme);
		
		proSup.addAllProduitsPanier(panierProSup);

		StrategieCalculPanierEnum calculPanier = Main.determinerStrategieCalculPanier(proSup);
		assertEquals(2450, calculPanier.calculerPanier(proSup.getPanierProduits()));
	}
	
	@Test
	void testCalculerPanierProfessionnelSupDontProduitsIdentiques() {
		TelephoneHautDeGamme telephoneHautDeGamme = new TelephoneHautDeGamme(1500, 1000, 1150);
		TelephoneMoyenGamme telephoneMoyenGamme = new TelephoneMoyenGamme(800, 550, 600);
		OrdinateurPortable ordinateurPortable = new OrdinateurPortable(1200, 900, 1000);
		ClientProfessionnel clientProSup = new ClientProfessionnel("Rockstar Games", "", "123 456 789", 11000000);
		
		ArrayList<Produit> panierProSup = new ArrayList<Produit>();
		panierProSup.add(telephoneHautDeGamme);
		panierProSup.add(ordinateurPortable);
		panierProSup.add(telephoneHautDeGamme);
		panierProSup.add(telephoneMoyenGamme);
		panierProSup.add(ordinateurPortable);
		
		clientProSup.addAllProduitsPanier(panierProSup);

		StrategieCalculPanierEnum calculPanier = Main.determinerStrategieCalculPanier(clientProSup);
		assertEquals(4350, calculPanier.calculerPanier(clientProSup.getPanierProduits()));
	}
	
	@Test
	void testCalculerPanierClientProfessionnelVide() {
		ClientProfessionnel clientProSup = new ClientProfessionnel("Ubisoft", "", "123 456 789", 5000000);
		StrategieCalculPanierEnum calculPanier = Main.determinerStrategieCalculPanier(clientProSup);
		assertEquals(0, calculPanier.calculerPanier(clientProSup.getPanierProduits()));
	}
	
	@Test
	void testCalculerPanierClientProfessionnelDeTroisProduitsDifferents() {
		TelephoneHautDeGamme telephoneHautDeGamme = new TelephoneHautDeGamme(1500, 1000, 1150);
		TelephoneMoyenGamme telephoneMoyenGamme = new TelephoneMoyenGamme(800, 550, 600);
		OrdinateurPortable ordinateurPortable = new OrdinateurPortable(1200, 900, 1000);
		ClientProfessionnel clientPro = new ClientProfessionnel("Ubisoft", "", "123 456 789", 5000000);
		
		ArrayList<Produit> panierPro = new ArrayList<Produit>();
		panierPro.add(ordinateurPortable);
		panierPro.add(telephoneHautDeGamme);
		panierPro.add(telephoneMoyenGamme);
		
		clientPro.addAllProduitsPanier(panierPro);

		StrategieCalculPanierEnum calculPanier = Main.determinerStrategieCalculPanier(clientPro);
		assertEquals(2750, calculPanier.calculerPanier(clientPro.getPanierProduits()));
	}
	
	@Test
	void testCalculerPanierClientProfessionnelDeProduitsDontIdentiques() {
		TelephoneHautDeGamme telephoneHautDeGamme = new TelephoneHautDeGamme(1500, 1000, 1150);
		TelephoneMoyenGamme telephoneMoyenGamme = new TelephoneMoyenGamme(800, 550, 600);
		OrdinateurPortable ordinateurPortable = new OrdinateurPortable(1200, 900, 1000);
		ClientProfessionnel clientPro = new ClientProfessionnel("Ubisoft", "", "123 456 789", 5000000);
		
		ArrayList<Produit> panierPro = new ArrayList<Produit>();
		panierPro.add(ordinateurPortable);
		panierPro.add(telephoneHautDeGamme);
		panierPro.add(ordinateurPortable);
		panierPro.add(telephoneMoyenGamme);
		
		clientPro.addAllProduitsPanier(panierPro);

		StrategieCalculPanierEnum calculPanier = Main.determinerStrategieCalculPanier(clientPro);
		assertEquals(3750, calculPanier.calculerPanier(clientPro.getPanierProduits()));
	}
}
