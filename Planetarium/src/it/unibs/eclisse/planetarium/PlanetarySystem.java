package it.unibs.eclisse.planetarium;

import java.util.*;

public class PlanetarySystem {
	
	private Planet stella;
	private LinkedList<Planet> pianeti;
	private boolean endWell = false;
	
	public PlanetarySystem(Planet stella) {
		
		this.stella = stella;
	}
	
	public boolean addPianeta(Planet p) {
		
		endWell=pianeti.add(p);
		return endWell;
	}
}
