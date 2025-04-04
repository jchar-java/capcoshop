package com.jchar.capcoshop;

import com.jchar.capcoshop.calculpanier.CalculPanier;
import com.jchar.capcoshop.calculpanier.impl.CalculPanierClientParticulier;
import com.jchar.capcoshop.calculpanier.impl.CalculPanierClientProfessionnel;
import com.jchar.capcoshop.calculpanier.impl.CalculPanierClientProfessionnelPlus;
import com.jchar.capcoshop.clients.Client;
import com.jchar.capcoshop.clients.ClientParticulier;
import com.jchar.capcoshop.clients.ClientProfessionnel;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to CapcoShop");
	}

	public static CalculPanier determinerStrategieCalculPanier(Client client) {

		return switch(client) {
			case ClientParticulier clientParticulier -> new CalculPanierClientParticulier();
			case ClientProfessionnel clientPro when clientPro.getChiffreAffairesAnnuel() <= 10000000 -> new CalculPanierClientProfessionnel();
			case ClientProfessionnel clientPro -> new CalculPanierClientProfessionnelPlus();
			default -> throw new IllegalArgumentException("Unexpected value: " + client);
		};

	}

}
