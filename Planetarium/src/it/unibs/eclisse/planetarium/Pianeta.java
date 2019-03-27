package it.unibs.eclisse.planetarium;

import java.util.LinkedList;

public class Pianeta extends Corpo{

	private LinkedList<Luna> lune;
	
	public Pianeta(String nome, double massa, int id, int x, int y) {
		
		super(nome, massa, id, x, y);

	}
	
	
}
