package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Classe implémentant l'interface commande permettant d'enregistrer une opérande.
 * @author jean
 *
 */
public class CommandeEnregistrerOp implements Commande {
	public void execute() {
		System.out.println("Enregistrement de l'opérande");
	}
}
