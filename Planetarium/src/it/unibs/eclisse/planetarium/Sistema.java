package it.unibs.eclisse.planetarium;

import java.util.LinkedList;

public class Sistema {
	
	private Pianeta stella;
	private LinkedList<Pianeta> pianeti;
	private boolean endWell = false;
	
	public Sistema(Pianeta stella) {
		
		this.stella = stella;
	}
	
	public boolean addPianeta(Pianeta p) {
		
		endWell=pianeti.add(p);
		return endWell;
	}
}
