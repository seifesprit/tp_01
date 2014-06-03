package tn.edu.esprit.tp.app.test;

import tn.edu.esprit.tp.app.adresse.Adresse;
import tn.edu.esprit.tp.app.adresse.Chercheur;

public class Test {

	public static void main(String[] args) {

		// Travail à faire : (voir support du cours)
		// 1- Installer l’environnement de développement Netbeans et importer
		// le projet.
		// 2- Créer une adresse dans la classe Test en utilisant le 1er
		// constructeur (voir les commentaires).
		Adresse adresse;
		adresse = new Adresse();
		// 3- Affecter des valeurs à l’objet adresse créée.

		adresse.codePostal = 2000;
		adresse.gouvernorat = "Tunis";
		adresse.ville = "Tunis";

		// 4- Afficher l’objet adresse crée.
		System.out.println(adresse);
		// 5- Modifier le code postal de cette adresse.
		adresse.codePostal = 1045;

		// 6- Afficher l’objet adresse modifié.
		System.out.println(adresse);
		// 7- Créer une adresse dans la classe Test en utilisant le 2ème
		// constructeur (voir les commentaires).
		Adresse adresse2 = new Adresse(1452, "Ariana", "Ariana");
		// 8- Modifier la ville de cette adresse.
		adresse2.ville = "Charguia";
		// 9- Afficher l’objet adresse modifié.
		System.out.println(adresse2);
		// 10- Ecrivez la classe Chercheur en ajoutant ses attributs.

		// 11- Créer un Chercheur dans la classe Test en utilisant le même
		// type de constructeur dans la classe Adresse C1.
		Chercheur chercheur = new Chercheur();
		// 12- Affecter des valeurs à ce chercheur.
		chercheur.nom = "Mhedhbi";
		chercheur.poste = "Directeur";
		chercheur.numero_ordinateur = 5;
		// 13- Afficher toutes les informations relatives à ce chercheur.
		System.out.println(chercheur);
		// 14- Déclarer dans la classe Chercheur un deuxième constructeur
		// paramétré.

		Chercheur chercheur2 = new Chercheur("aymen", "developpeur", 3);

		// 15- Afficher toutes les informations relatives à ce chercheur.
		// NB : Vous pouvez utiliser la méthode toString() .
		// 16- Afficher le nombre de chercheurs créés.
		System.out.println(Chercheur.compteur);

		// 17- Ajouter dans la classe Chercheur la méthode comparer() qui
		// permet de tester l’égalité entre deux chercheurs : public void
		// comparer (Chercheur ch){…}

		// 18-
		// 19- Modifier le numéro de l’ordinateur de l’objet chercheur1
		chercheur.numero_ordinateur = 6;
		// 20- Créer un objet chercheur3 sans paramètres
		Chercheur chercheur3 = new Chercheur();
		// 21- Ajouter un nom, un poste et un numéro de l’ordinateur à
		// l’objet chercheur3
		// 22- Créer deux Bureaux bureau1 et bureau2, chaque bureau contient 3
		// chercheurs
		// 23- Créer un Laboratoire laboratoire1 qui contient deux bureaux.
		// 24- Afficher les caractéristiques de l’objet laboratoire1.

	}

}
