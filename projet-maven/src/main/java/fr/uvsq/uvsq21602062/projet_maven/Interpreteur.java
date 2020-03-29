package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Classe interpretant les commandes demandées.
 * @author jean
 *
 */
public class Interpreteur<T> {
	protected HashMap<String, Commande> mapCommande;
	
	/**
	 * Constructeur initialisant la variable mapCommande.
	 */
	public Interpreteur() {
		this.mapCommande = new HashMap<String, Commande>();
	}
	
	/**
	 * Méthode ajoutant une commande à la variable mapCommande à partir de l'argument nomCommande.
	 * @param nomCommande
	 * La valeur de retour correspond au succes ou non de l'ajout.
	 */
	public int ajouter(String nomCommande, ArrayList<T> arg) {
		if(nomCommande.equals("undo")) {
			Commande c = new CommandeUndo<T>(arg);
			this.mapCommande.put("undo", c);
		}
		else if(nomCommande.equals("quit")) {
			Commande c = new CommandeQuit();
			this.mapCommande.put("quit", c);
		}
		else {
			return 0;
		}
		return 1;
	}
	
	/**
	 * Méthode appelant l'execution de la commande correspondant à l'argument nomCommande.
	 * @param nomCommande
	 * La valeur de retour correspond au succes ou non de l'execution.
	 */
	public int executer(String nomCommande) {
		if(mapCommande.get(nomCommande) == null) {
			return 0;
		}
		else {
			mapCommande.get(nomCommande).execute();
			return 1;
		}
	}
	
}
