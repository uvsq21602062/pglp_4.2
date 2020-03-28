package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;

/**
 * Classe dérivé de la classe Interpreteur permettant de gerrer les actions sur les
 * opérateurs et les oprérandes
 * @author jean
 *
 */
public class MoteurRPN extends Interpreteur {
	private ArrayList<Integer> listeOperandes;
	
	/**
	 * Constructeur initialisant l'attribut ListeOperandes.
	 */
	public MoteurRPN() {
		super();
		this.listeOperandes = new ArrayList<Integer>();
	}
	
	/**
	 * Méthode hérité de la classe Interpreteur. Elle rajoute à l'attribut hérité mapCommande
	 * la commande obtenu à partir de son nom donné en argument.
	 */
	public int ajouter(String nomCommande) {
		if(nomCommande == "undo" || nomCommande == "quit") {
			return super.ajouter(nomCommande);
		}
		else if(nomCommande == "enregistrer") {
			Commande c = new CommandeEnregistrerOp();
			this.mapCommande.put(nomCommande, c);
			return 1;
		}
		else if(nomCommande == "obtenir") {
			Commande c = new CommandeEnregistrerOp();
			this.mapCommande.put(nomCommande, c);
			return 1;
		}
		else if(nomCommande == "appliquer") {
			Commande c = new CommandeEnregistrerOp();
			this.mapCommande.put(nomCommande, c);
			return 1;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * Méthode hérité de la classe Interpreteur qui executer la commande correspondant à nomCommande
	 */
	public int executer(String nomCommande) {
		if(nomCommande == "undo" || nomCommande == "quit") {
			return super.ajouter(nomCommande);
		}
		else {
			if(this.mapCommande.get(nomCommande) == null) {
				return 0;
			}
			else {
				this.mapCommande.get(nomCommande).execute();
				return 1;
			}
		}
	}
	
}
