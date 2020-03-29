package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterpreteurTest {

	@Test
	public void testAjouterUndo() {
		Interpreteur<Integer> i = new Interpreteur<Integer>();
		assertTrue(i.ajouter("undo", null) == 1);
	}
	
	@Test
	public void testAjouterQuit() {
		Interpreteur<Integer> i = new Interpreteur<Integer>();
		assertTrue(i.ajouter("quit", null) == 1);
	}
	
	@Test
	public void testAjouterAutre() {
		Interpreteur<Integer> i = new Interpreteur<Integer>();
		assertTrue(i.ajouter("autre", null) == 0);
	}
	
	@Test
	public void testExecuterVrai() {
		Interpreteur<Integer> i = new Interpreteur<Integer>();
		i.ajouter("undo", null);
		assertTrue(i.executer("undo") == 1);
	}
	
	@Test
	public void testExecuterFaux() {
		Interpreteur<Integer> i = new Interpreteur<Integer>();
		i.ajouter("undo", null);
		assertTrue(i.executer("quit") == 0);
	}

}
