package fr.dtaIng.beans;

import java.util.Date;

public class Commande {
	private Client client;
	private Date date;
	private Produit[] listeProduit;
	
	public Commande(){
		
	}
	
	public Commande (Client client, Date date) {
		this.client=client;
		this.date=date;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Produit[] getListeProduit() {
		return listeProduit;
	}

	public void setListeProduit(Produit[] listeProduit) {
		this.listeProduit = listeProduit;
	}
	
	
}
