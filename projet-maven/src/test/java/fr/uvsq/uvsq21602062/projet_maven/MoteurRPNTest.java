package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoteurRPNTest {

	@Test
	public void testAjouterUndo() {
		MoteurRPN m = new MoteurRPN();
		assertTrue(m.ajouter("undo") == 1);
	}
	
	@Test
	public void testAjouterEnregistrer() {
		MoteurRPN m = new MoteurRPN();
		assertTrue(m.ajouter("enregistrer") == 1);
	}
	
	@Test
	public void testAjouterAutre() {
		MoteurRPN m = new MoteurRPN();
		assertTrue(m.ajouter("autre") == 0);
	}
	
	@Test
	public void testExecuterEnregistrer() {
		MoteurRPN m = new MoteurRPN();
		m.ajouter("enregistrer");
		m.nouvelleOperande("34");
		assertTrue(m.executer("enregistrer") == 1);
	}
	
	@Test
	public void testExecuterAppliquer() {
		MoteurRPN m = new MoteurRPN();
		m.ajouter("appliquer");
		m.nouvelOperateur("+");
		assertTrue(m.executer("appliquer") == 1);
	}
	
	@Test
	public void testExecuterObtenir() {
		MoteurRPN m = new MoteurRPN();
		m.ajouter("obtenir");
		assertTrue(m.executer("obtenir") == 1);
	}
	
	@Test
	public void testExecuterFaux() {
		MoteurRPN m = new MoteurRPN();
		m.ajouter("enregistrer");
		assertTrue(m.executer("obtenir") == 0);
	}

}
