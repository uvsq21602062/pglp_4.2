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
	public void testExecuterVrai() {
		MoteurRPN m = new MoteurRPN();
		m.ajouter("enregistrer");
		assertTrue(m.executer("enregistrer") == 1);
	}
	
	@Test
	public void testExecuterFaux() {
		MoteurRPN m = new MoteurRPN();
		m.ajouter("enregistrer");
		assertTrue(m.executer("obtenir") == 0);
	}

}
