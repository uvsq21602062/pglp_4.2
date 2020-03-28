package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Classe implémentant l'interface Commande permettant d'appliquer une oprération sur les
 * opérandes stockées.
 * @author jean
 *
 */
public class CommandeOperationSurOp implements Commande {
	public void execute() {
		System.out.println("Opération sur opérande.");
	}
}
