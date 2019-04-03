package it.unibs.eclisse.planetarium;
import java.util.*;

public class Planet extends CelestialBody{

	private LinkedList<Moon> lune;
	
	
	
	public Planet(String nome, double massa, int id, double x, double y, LinkedList lune) {
		super(nome, massa, id, x, y);
	}
	
	public boolean addMoon(Moon p) {
		return lune.add(p);
	}


	public static Moon setMoon() {
		Scanner lettore = new Scanner(System.in);
		PlanetariumMain idM = new PlanetariumMain();
		
		//input da tastiera per il nome del pianeta
		String name=null;
		do {
			System.out.println("inserisci nome luna: ");
			name=lettore.nextLine();
		}while(name==null || name.isEmpty());
		
		// input massa
		double mass;
		do {
			System.out.println("inserisci massa: ");
			mass=lettore.nextDouble();
		}while(mass==0);
		
		//incremento id
		int id=idM.getIdPlanet();
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
		
		Moon m = new Moon(name, mass, id, x, y);
		
		return m;
	}
	
	public Moon searchMoon(String moonName) {
		//METODO VISUALIZZA LISTA PIANETI
		System.out.println("Vuoi cercare la luna di quale pianeta? [inserisci ID pianeta]");
		for(Planet p:pianeti) {
			if(p.getName().equals(planetName)) {
				for (int i =0; i<p.lune.size(); i++) {
					System.out.println(p.lune(i));
				}
			}
		}
		return null;	
	}
	
	public void delPlanet(String planetName){
		Planet m = searchPlanet(moonName);
		
		if(m==null){
			System.out.println("Pianeta Inesistente!");
		}else {
			lune.remove(m);
		}
	}
	
}
	
	
	
}
