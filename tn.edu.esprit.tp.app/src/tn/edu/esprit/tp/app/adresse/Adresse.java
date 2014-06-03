
package tn.edu.esprit.tp.app.adresse;


public class Adresse {


	public int codePostal;
	public String gouvernorat;
	public String ville;

	public Adresse() {

	}

	
	public Adresse(int codePostal, String gouvernorat, String ville) {
		this.codePostal = codePostal;
		this.gouvernorat = gouvernorat;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [codePostal=" + codePostal + ", gouvernorat="
				+ gouvernorat + ", ville=" + ville + "]";
	}

}
