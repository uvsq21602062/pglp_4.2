package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Classe implémentant l'interface Commande permettant de supprimer la derniere commande
 * @author jean
 *
 */
public class CommandeUndo implements Commande {
	public void execute() {
		System.out.println("Suppression de la derniere commande");
	}
}
