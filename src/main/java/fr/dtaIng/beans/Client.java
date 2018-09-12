package fr.dtaIng.beans;

public class Client {
	private String nom;
	private String prenom;
	
	public String getNom() {
		return nom;
		
	}
	
	public String getPrenom() {
		return prenom;
		
	}
	
	public Client(){
		
	}
	
	public Client (String nom, String prenom) {
		this.nom=nom;
		this.prenom=prenom;
	}
}
