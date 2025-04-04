package com.jchar.capcoshop.clients;

public final class ClientProfessionnel extends Client {

	private String raisonSociale;
	
	private String numeroTvaIntracommunautaire;
	
	private String siren;
	
	private long chiffreAffairesAnnuel;
	
	public ClientProfessionnel(String raisonSociale, String numeroTvaIntracommunautaire, String siren,
			long chiffreAffairesAnnuel) {
		this.raisonSociale = raisonSociale;
		this.numeroTvaIntracommunautaire = numeroTvaIntracommunautaire;
		this.siren = siren;
		this.chiffreAffairesAnnuel = chiffreAffairesAnnuel;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getNumeroTvaIntracommunautaire() {
		return numeroTvaIntracommunautaire;
	}

	public void setNumeroTvaIntracommunautaire(String numeroTvaIntracommunautaire) {
		this.numeroTvaIntracommunautaire = numeroTvaIntracommunautaire;
	}

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	public long getChiffreAffairesAnnuel() {
		return chiffreAffairesAnnuel;
	}

	public void setChiffreAffairesAnnuel(long chiffreAffairesAnnuel) {
		this.chiffreAffairesAnnuel = chiffreAffairesAnnuel;
	}
}
