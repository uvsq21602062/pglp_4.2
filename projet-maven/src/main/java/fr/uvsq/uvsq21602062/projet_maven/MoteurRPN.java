package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;

/**
 * Classe dérivé de la classe Interpreteur permettant de gerrer les actions sur les
 * opérateurs et les oprérandes
 * @author jean
 *
 */
public class MoteurRPN extends Interpreteur<String> {
	private ArrayList<String> listeOperandes;
	
	/**
	 * Constructeur initialisant l'attribut ListeOperandes.
	 */
	public MoteurRPN() {
		super();
		this.listeOperandes = new ArrayList<String>();
	}
	
	/**
	 * Méthode hérité de la classe Interpreteur. Elle rajoute à l'attribut hérité mapCommande
	 * la commande obtenu à partir de son nom donné en argument.
	 */
	public int ajouter(String nomCommande) {
		if(nomCommande == "undo" || nomCommande == "quit") {
			return super.ajouter(nomCommande, this.listeOperandes);
		}
		else if(nomCommande == "enregistrer") {
			Commande c = new CommandeEnregistrerOp(this.listeOperandes);
			this.mapCommande.put(nomCommande, c);
			return 1;
		}
		else if(nomCommande == "obtenir") {
			Commande c = new CommandeObtenirOp(this.listeOperandes);
			this.mapCommande.put(nomCommande, c);
			return 1;
		}
		else if(nomCommande == "appliquer") {
			Commande c = new CommandeOperationSurOp(this.listeOperandes);
			this.mapCommande.put(nomCommande, c);
			return 1;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * Méthode à appeler avant d'executer la commande enregistrer.
	 * @param operande
	 */
	public void nouvelleOperande(String operande) {
		this.listeOperandes.add(operande);
	}
	
	/**
	 * Méthode à appeler avant d'executer la commande appliquer.
	 * @param operateur
	 */
	public void nouvelOperateur(String operateur) {
		this.listeOperandes.add(operateur);
	}
	
	/**
	 * Méthode hérité de la classe Interpreteur qui executer la commande correspondant à nomCommande
	 */
	public int executer(String nomCommande) {
		if(nomCommande == "undo" || nomCommande == "quit") {
			return super.executer(nomCommande);
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
