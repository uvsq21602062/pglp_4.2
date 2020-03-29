package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;

/**
 * Classe implémentant l'interface Commande permettant de supprimer la derniere commande.
 * @author jean
 *
 */
public class CommandeUndo<T> implements Commande {
	private ArrayList<T> attr;
	
	public CommandeUndo(ArrayList<T> arg) {
		this.attr = arg;
	}
	
	public void execute() {
		try {
			if(this.attr.size() == 0) {
			System.out.println("Il n'y a aucun élément à supprimer");
			}
			else {
				this.attr.remove(this.attr.size()-1);
				System.out.println("Suppression de la derniere commande");
			}
		}
		catch (NullPointerException e) {
			System.out.println("Erreur : La liste d'operande est null");
		}
	}
}
