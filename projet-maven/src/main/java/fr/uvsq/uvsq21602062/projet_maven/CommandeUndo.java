package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Classe implémentant l'interface Commande permettant de supprimer la derniere commande
 * @author jean
 *
 */
public class CommandeUndo implements Commande {
	
	public void execute() {
		// Si la liste est vide
		if(true) {
			System.out.println("Il n'y a aucune commande à annuler.");
		}
		// Sinon on supprime le dernier élément de la liste
		else {
			System.out.println("Suppression de la dernière commande.");
		}
	}
}
