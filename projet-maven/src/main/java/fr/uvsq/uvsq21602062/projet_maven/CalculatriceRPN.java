package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Classe principale du programme appelant un objet SaisieRPN.
 * @author jean
 *
 */
public class CalculatriceRPN {
	public static void main(String[] args) {
		SaisieRPN saisie = new SaisieRPN();
		
		while(true) {
			saisie.prochaineLigne();
		}
	}
}