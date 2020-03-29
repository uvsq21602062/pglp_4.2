package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;

/**
 * Classe implémentant l'interface Commande permettant de retourner toutes les
 * opérandes stockées.
 * @author jean
 *
 */
public class CommandeObtenirOp implements Commande {
	private ArrayList<String> listeOperandes;
	
	public CommandeObtenirOp(ArrayList<String> listeOperandes) {
		this.listeOperandes = listeOperandes;
	}
	
	public void execute() {
		for(int i=0; i<this.listeOperandes.size(); i++) {
			System.out.print(this.listeOperandes.get(i));
			System.out.print("\n");
		}
	}
}
