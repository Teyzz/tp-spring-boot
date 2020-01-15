package com.example.demo;
import java.util.*;

public class Entreprise {

	protected String email;
	protected String mdp; //SHA
	protected String raison_sociale;
	protected double nb_salaries;
	protected boolean newsletter;
	protected Date date_inscription;
	
	public Entreprise() {
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMdp() {
		return mdp;
	}
	
	public void setMdp(String email) {
		this.email = email;
	}
	
	public String getRaison_sociale() {
		return raison_sociale;
	}

	public void setRaison_sociale(String raison_sociale) {
		this.raison_sociale = raison_sociale;
	}

	public double getNb_salarie() {
		return nb_salaries;
	}

	public void setNb_salarie(double nb_salaries) {
		this.nb_salaries = nb_salaries;
	}

	public boolean getNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}
	
	public Date getInscription() {
	    return date_inscription;
	}
	
	public void setInscription(Date date_inscription) {
		this.date_inscription = date_inscription;
	}


	public Entreprise(String email, String mdp, String raison_sociale, double nb_salaries, boolean newsletter) {
		super();
		this.email = email;
		this.mdp = mdp;
		this.raison_sociale = raison_sociale;
		this.nb_salaries = nb_salaries;
		this.newsletter = newsletter;
		this.date_inscription = new Date();
	}


	@Override
	public String toString() {
		return "raison sociale" + raison_sociale + "inscrit depuis le" + date_inscription;
	}
	
}
