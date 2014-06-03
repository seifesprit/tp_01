package tn.edu.esprit.tp.app.adresse;

public class Chercheur {

	public String nom;
	public String poste;
	public int numero_ordinateur;
	public static int compteur = 0;

	public Chercheur() {

		compteur++;
	}

	public Chercheur(String nom, String poste, int numero_ordinateur) {

		this.nom = nom;
		this.poste = poste;
		this.numero_ordinateur = numero_ordinateur;

		compteur++;
		
	}

	@Override
	public String toString() {
		return "Chercheur [nom=" + nom + ", poste=" + poste
				+ ", numero_ordinateur=" + numero_ordinateur + "]";
	}

}
