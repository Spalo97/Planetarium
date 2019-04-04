package it.unibs.eclisse.planetarium;

import java.util.*;

public class PlanetarySystem {
	
	private Planet stella;
	private LinkedList<Planet> planets = new LinkedList<Planet>();
	private boolean endWell = false;
	
	
	public PlanetarySystem(Planet stella) {
		this.stella=stella;
	}
	
	public LinkedList<Planet> getPlanets() {
		return planets;
	}

	public void setPlanets(LinkedList<Planet> planets) {
		this.planets = planets;
	}
	
	public void showPlanets() {
		Planet p;;
		for (int i=0; i<planets.size(); i++) {
			System.out.println(planets.get(i).getName());
			p= planets.get(i);
			if(!p.getMoons().isEmpty()) {
				System.out.println("Le sue lune sono: ");
				p.showMoon(p);
			}
		}
	}
	
	public double calcMassCenterX() {
		double massCenterX=0;
		double totMass=0;
		double totX=0;
		
		for (int i=0; i<planets.size(); i++) {
			totMass=totMass+planets.get(i).getMassa();
			totX=totX+planets.get(i).getX();
		}
		
		massCenterX=totX/totMass;
		return massCenterX;
	}
	
	public double calcMassCenterY() {
		double massCenterY=0;
		double totMass=0;
		double totY=0;
		
		for (int i=0; i<planets.size(); i++) {
			totMass=totMass+planets.get(i).getMassa();
			totY=totY+planets.get(i).getY();
		}
		
		massCenterY=totY/totMass;
		return massCenterY;
	}
	

	
	/*public static Planet setPlanet() {
		Scanner lettore = new Scanner(System.in);
		PlanetariumMain idP = new PlanetariumMain();
		Planet moons = new Planet();
		
		
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
		

		do {
			System.out.println("INSERISCI 1 SE VUOI AGGIUNGERE DELLE LUNE: ");
			if (lettore.nextInt() == 1) {
				moons.addMoon(Planet.setMoon());
			}
			}while(lettore.nextInt() != 1);
		
		
		Planet p = new Planet(name, mass, id, x, y, pianeti);
		
		return p;
	}*/
	
	
	
	public Planet searchPlanet(String planetName) {
		for(Planet p:planets) {
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
			planets.remove(p);
		}
	}
}
