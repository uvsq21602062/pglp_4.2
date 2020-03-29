package fr.uvsq.uvsq21602062.projet_maven;

import java.util.Scanner;

/**
 * Classe s'occupant de gerer la saisie de l'utilisateur et qui appelle les différentes
 * execution MoteurRPN en fonction de l'entrée donné.
 * @author jean
 *
 */

public class SaisieRPN {
	private Scanner scan;
	private MoteurRPN moteur;
	
	/**
	 * Constructeur initialisant le Scanner et le MoteurRPN.
	 */
	SaisieRPN() {
		this.scan = new Scanner(System.in);
		this.moteur = new MoteurRPN();
		this.moteur.ajouter("enregistrer");
		this.moteur.ajouter("appliquer");
		this.moteur.ajouter("obtenir");
		this.moteur.ajouter("quit");
		this.moteur.ajouter("undo");
		System.out.println("Bonjour, veuillez saisir votre expression "
				+ "sous la forme RPN en validant par à chaque fois par la touche <entrée>");
	}
	
	/**
	 * Méthode analysant la saisie de l'utilisateur et appelant les différentes executions
	 * de MoteurRPN.
	 */
	public void prochaineLigne()
	{
		String s = this.scan.nextLine();
		try {
			Integer.parseInt(s);
			this.moteur.nouvelleOperande(s);
			this.moteur.executer("enregistrer");
		}
		catch(NumberFormatException e) {
			if(s == "undo" || s == "quit") {
				this.moteur.executer(s);
			}
			else {
				this.moteur.nouvelOperateur(s);
			}
		}
		finally {
			this.moteur.executer("obtenir");
		}
	}
}
