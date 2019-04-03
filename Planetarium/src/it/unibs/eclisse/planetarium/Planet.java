package it.unibs.eclisse.planetarium;
import java.util.LinkedList;

public class Planet extends CelestialBody{

	private LinkedList<Moon> lune;
	
	public Planet(String nome, double massa, int id, int x, int y) {
		
		super(nome, massa, id, x, y);
	}
	
	
}
