package it.unibs.eclisse.planetarium;

import java.util.*;

public class PlanetarySystem {
	
	private Planet stella;
	private LinkedList<Planet> pianeti;
	private boolean endWell = false;
	
	
	public PlanetarySystem(Planet stella) {
		this.stella=stella;
	}
	
	public LinkedList<Planet> getPlanets() {
		return pianeti;
	}
	
	public void addPianeta(Planet p) {
		pianeti.add(p);
	}


	public static Planet setPlanet() {
		Scanner lettore = new Scanner(System.in);
		PlanetariumMain idP = new PlanetariumMain();
		
		//input da tastiera per il nome del pianeta
		String name=null;
		do {
			System.out.println("inserisci nome pianeta: ");
			name=lettore.nextLine();
		}while(name==null || name.isEmpty());
		
		// input massa
		double mass;
		do {
			System.out.println("inserisci massa: ");
			mass=lettore.nextDouble();
		}while(mass==0);
		
		//incremento id
		int id=idP.getIdPlanet();
		id++;
		
		//input x 
		double x=0;
		do {
			System.out.println("inserisci coordinata x: ");
			x=lettore.nextDouble();
		}while(x==0);
		
		//input y
		double y=0;
		do {
			System.out.println("inserisci coordinata y: ");
			y=lettore.nextDouble();
		}while(y==0);
		
		Planet p = new Planet(name, mass, id, x, y);
		
		return p;
	}
	
	public Planet searchPlanet(String planetName) {
		for(Planet p:pianeti) {
			if(p.getName().equals(planetName)) {
				return p;
			}
		}
		return null;	
	}
	
	public void delPlanet(String planetName){
		Planet p = searchPlanet(planetName);
		
		if(p==null){
			System.out.println("Pianeta Inesistente!");
		}else {
			pianeti.remove(p);
		}
	}
}
