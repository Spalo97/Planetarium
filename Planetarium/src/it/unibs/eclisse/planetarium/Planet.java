package it.unibs.eclisse.planetarium;
import java.util.*;

public class Planet extends CelestialBody{

	private LinkedList<Moon> moons;

	public Planet(String nome, double massa, int id, double x, double y) {
		super(nome, massa, id, x, y);
	}
	
	public void addMoon(Moon p) {
		moons.add(p);
	}


	/*public static Moon setMoon() {
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
	}*/
	
	/*public Moon searchMoon(String moonName) {
		//METODO VISUALIZZA LISTA PIANETI
		System.out.println("Vuoi cercare la luna di quale pianeta?");
		for(Planet p:pianeti) {
			if(p.getName().equals(planetName)) {
				for (int i =0; i<p.lune.size(); i++) {
					System.out.println(p.lune(i));
				}
			}
		}
		return null;	
	}*/
	
	public int searchMoon(String moonName) {
		for(Moon m:moons) {
			if(m.getName().equals(moonName)) {
				return m.getId();
			}
		}
		return 0; //è sbagliato ma vuole comunque un return devo rivederlo
	}
	
	public void delMoon(String moonName){
		int m = searchMoon(moonName);
		moons.remove(m);

	}
	
}
