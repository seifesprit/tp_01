package tableau;

import tn.edu.esprit.tp.app.adresse.Chercheur;

public class TestTableau {

	public static void main(String[] args) {

		int[] tab;
		tab = new int[5];

		tab[0] = 5;
		System.out.println(tab[1]);
		Chercheur chercheur=new Chercheur();
		
		Chercheur[] tab2;
		tab2= new Chercheur[2];
		tab2[0] = chercheur;
		System.out.println(tab2[1]);

		
	}

}
