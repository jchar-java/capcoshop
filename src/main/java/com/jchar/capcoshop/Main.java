package com.jchar.capcoshop;

import com.jchar.capcoshop.calculpanier.StrategieCalculPanierEnum;
import com.jchar.capcoshop.clients.Client;
import com.jchar.capcoshop.clients.ClientParticulier;
import com.jchar.capcoshop.clients.ClientProfessionnel;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to CapcoShop");
	}

	public static StrategieCalculPanierEnum determinerStrategieCalculPanier(Client client) {

		return switch(client) {
			case ClientParticulier clientParticulier -> StrategieCalculPanierEnum.PARTICULIER;
			case ClientProfessionnel clientPro when clientPro.getChiffreAffairesAnnuel() <= 10000000 -> StrategieCalculPanierEnum.PRO;
			case ClientProfessionnel clientPro -> StrategieCalculPanierEnum.PRO_SUP;
		};

	}

}
