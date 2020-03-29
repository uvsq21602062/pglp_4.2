package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Classe implémentant l'interface commande permettant de quitter le programme.
 * @author jean
 *
 */
public class CommandeQuit implements Commande {
	public void execute() {
		System.out.println("Au revoir");
		System.exit(0);
	}
}
