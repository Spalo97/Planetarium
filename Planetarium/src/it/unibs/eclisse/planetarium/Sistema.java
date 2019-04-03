package it.unibs.eclisse.planetarium;

import java.util.*;

public class Sistema {
	
	private Pianeta stella;
	private LinkedList<Pianeta> pianeti;
	private boolean endWell = false;
	
	static Pianeta readPlanet() {
		Pianeta newPlanet = new Pianeta(null, 0, 0, 0, 0);
		
		readName(newPlanet);
		
		return newPlanet;
	}
	
	private static void readName(Pianeta newPlanet) {
		String name = null; 
		Scanner lettore = new Scanner(System.in);
		
		do {
			System.out.println("Inserisci Nome Pianeta:");
			name=lettore.nextLine();
			if (name==null || name.isEmpty()) {
				System.out.println("Inserisci nome del pianeta");
			}
			
		}while(name==null || name.isEmpty());
		newPlanet.setNome(name);
	}
	
	public Sistema(Pianeta stella) {
		
		this.stella = stella;
	}
	
	public boolean addPianeta(Pianeta p) {
		
		endWell=pianeti.add(p);
		return endWell;
	}
}
