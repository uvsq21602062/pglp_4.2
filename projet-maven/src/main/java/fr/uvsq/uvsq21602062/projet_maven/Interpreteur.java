package fr.uvsq.uvsq21602062.projet_maven;

import java.util.HashMap;

/**
 * Classe interpretant les commandes demandé
 * @author jean
 *
 */
public class Interpreteur {
	private HashMap<String, Commande> mapCommande;
	
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
	public int ajouter(String nomCommande) {
		if(nomCommande == "undo") {
			Commande c = new CommandeUndo();
			this.mapCommande.put("undo", c);
		}
		else if(nomCommande == "quit") {
			Commande c = new CommandeQuit();
			this.mapCommande.put("quit", c);
		}
		else {
			System.out.println("La commande demandé n'existe pas.");
			return 0;
		}
		return 1;
	}
	
	/**
	 * Méthode appelant l'execution de la commande correspondant à l'argument nomCommande.
	 * @param nomCommande
	 * La valeur de retour correspond au succes ou non de l'execution.
	 */
	public void executer(String nomCommande) {
		mapCommande.get(nomCommande).execute();
	}
	
}
