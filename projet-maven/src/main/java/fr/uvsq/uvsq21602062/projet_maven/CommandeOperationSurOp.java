package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;

/**
 * Classe implémentant l'interface Commande permettant d'appliquer une oprération sur les
 * opérandes stockées.
 * @author jean
 *
 */
public class CommandeOperationSurOp implements Commande {
	private ArrayList<Integer> listeOperandes;
	private String operation;
	
	public CommandeOperationSurOp(ArrayList<Integer> liste) {
		this.listeOperandes = liste;
		this.operation = "";
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void execute() {
		int x = this.listeOperandes.get(this.listeOperandes.size()-1);
		int y = this.listeOperandes.get(this.listeOperandes.size()-2);
		this.listeOperandes.remove(this.listeOperandes.size()-1);
		this.listeOperandes.remove(this.listeOperandes.size()-1);
		
		if(this.operation == "+") this.listeOperandes.add(x+y);
		else if(this.operation == "-") this.listeOperandes.add(x-y);
		else if(this.operation == "*") this.listeOperandes.add(x*y);
		else if(this.operation == "/") {
			if(y == 0) System.out.println("Division par 0 impossible.");
			else this.listeOperandes.add(x/y);
		}
		else System.out.println("L'operation n'est pas reconnu.");
	}
}
