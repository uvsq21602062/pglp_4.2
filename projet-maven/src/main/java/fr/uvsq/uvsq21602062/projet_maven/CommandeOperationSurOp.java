package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;

/**
 * Classe implémentant l'interface Commande permettant d'appliquer une oprération sur les
 * opérandes stockées.
 * @author jean
 *
 */
public class CommandeOperationSurOp implements Commande {
	private ArrayList<String> listeOperandes;
	
	public CommandeOperationSurOp(ArrayList<String> liste) {
		this.listeOperandes = liste;
	}
	
	public void execute() {
		try {
			String operation = this.listeOperandes.get(this.listeOperandes.size()-1);
			int x = Integer.parseInt(this.listeOperandes.get(this.listeOperandes.size()-2));
			int y = Integer.parseInt(this.listeOperandes.get(this.listeOperandes.size()-3));
			this.listeOperandes.remove(this.listeOperandes.size()-1);
			this.listeOperandes.remove(this.listeOperandes.size()-1);
			this.listeOperandes.remove(this.listeOperandes.size()-1);
			if(operation == "+") this.listeOperandes.add(Integer.toString(x+y));
			else if(operation == "-") this.listeOperandes.add(Integer.toString(x-y));
			else if(operation == "*") this.listeOperandes.add(Integer.toString(x*y));
			else if(operation == "/") {
				if(y == 0) System.out.println("Division par 0 impossible.");
				else this.listeOperandes.add(Integer.toString(x/y));
			}
			else System.out.println("L'operation n'est pas reconnu.");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Erreur : il n'y a pas assez d'élement dans la liste.");
		}
		catch(NumberFormatException e) {
			System.out.println("Erreur : une opérande n'a pas le bon format.");
		}
	}
}
