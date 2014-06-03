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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + numero_ordinateur;
		result = prime * result + ((poste == null) ? 0 : poste.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chercheur other = (Chercheur) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numero_ordinateur != other.numero_ordinateur)
			return false;
		if (poste == null) {
			if (other.poste != null)
				return false;
		} else if (!poste.equals(other.poste))
			return false;
		return true;
	}

}
