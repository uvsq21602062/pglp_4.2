package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Classe implémentant l'interface Commande permettant de retourner toutes les
 * opérandes stockées.
 * @author jean
 *
 */
public class CommandeObtenirOp implements Commande {
	public void execute() {
		System.out.println("Operandes stocké");
	}
}
