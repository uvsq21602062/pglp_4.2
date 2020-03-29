package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;

/**
 * Classe implémentant l'interface commande permettant d'enregistrer une opérande.
 * @author jean
 *
 */
public class CommandeEnregistrerOp implements Commande {
	private ArrayList<String> listeOperandes;
	
	public CommandeEnregistrerOp(ArrayList<String> listeOperandes) {
		this.listeOperandes = listeOperandes;
	}
	
	public void execute() {
		try {
			Integer.parseInt(this.listeOperandes.get(this.listeOperandes.size()-1));
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Erreur : Impossible d'enregistrer une operande.");
		}
		catch(NumberFormatException e) {
			System.out.println("Erreur : une opérande n'a pas le bon format.");
			this.listeOperandes.remove(this.listeOperandes.size()-1);
		}
	}
}
