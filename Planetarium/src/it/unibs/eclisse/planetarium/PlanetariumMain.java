package it.unibs.eclisse.planetarium;
import java.util.*;

public class PlanetariumMain {	
	//idPlanet serve per contare quanti pianeti aggiungo correttamente
	// in modo da gestire l'assegnazione dell'id
	//private int idPlanet = 0;
	/*public int getIdPlanet() {
		return idPlanet;
	}
	public void setIdPlanet(int idPlanet) {
		this.idPlanet = idPlanet;
	}
	
	tutto lavoro inutile! si crea e si usa nel main
	*/
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idPlanet = 0;
		String name;
		double mass;
		int x;
		int y;
		boolean choise = true;
		//PlanetariumMain idPlanet = new PlanetariumMain();  e questa da dove esce?
		//int id=idPlanet.getIdPlanet();
		
		//Creazione stella nel sistema solare (s) - Ok ma va chiesto la stella però
		//Planet p = new Planet("sole", id, 100000, 0, 0);
		//s.addStar(p);		
		//stella creata
		
		//interazioni con l'utente
		System.out.println("Buongiorno, questo � il software per la gestione del tuo sistema solare.\nInserisci i dati della stella del sistema.");
		System.out.println("Inserisci nome:");
		name = sc.nextLine();
		System.out.println("Inserisci massa:");
		mass = sc.nextDouble();
		Planet stella = new Planet(name,mass, idPlanet, 0, 0);
		idPlanet++;
		PlanetarySystem system = new PlanetarySystem(stella);
		
		do {
			System.out.println("Cosa vuoi fare?");
			System.out.println(" [1] Gestisci pianeti      [2] Gestisci lune      [3] Visualizza sistema");
			
			switch(sc.nextInt()) {
				case 1:
					System.out.println("Bene, hai scelto di gestire i pianeti.\nCosa vuoi fare?");
					System.out.println(" [1] Aggiungi pianeta      [2] Distruggi pianeta      [3] Ricerca pianeta");
					if(sc.nextInt()==1) {
						System.out.println("Inserisci i dati del pianeta: ");
						System.out.println("NOME:");
						name=sc.nextLine(); //non aspetta per inserire il nome, capire perché
						System.out.println("MASSA: ");
						mass = sc.nextDouble();
						System.out.println("COORDINATA X:");
						x=sc.nextInt();
						System.out.println("COORDINATA Y:");
						y=sc.nextInt();
						Planet p = new Planet(name,mass,idPlanet,x, y);
						idPlanet++;
					}
					else if(sc.nextInt()==2) {
						System.out.println("Inserisci nome del pianeta da distruggere: ");
						system.delPlanet(sc.nextLine());
					}
					else {
						System.out.println("Inserisci nome del pianeta da cercare: ");
						Planet p = system.searchPlanet(sc.nextLine());
						System.out.println("NOME:"  + p.getName());
						System.out.println("ID: " + p.getId());
						System.out.println("MASSA: " + p.getMassa());
						System.out.println("COORDINATE: (" + p.getX() + " , " + p.getY());			
					}
					break;
				case 2:
					System.out.println("Bene, hai scelto di gestire le lune.\nCosa vuoi fare?");
					System.out.println(" [1] Aggiungi luna      [2] Distruggi luna      [3] Ricerca luna");
					break;
				case 3:					
					System.out.println("\nElenco di tutti i pianeti:\n");
					
					LinkedList<Planet> planets = system.getPlanets();
					
					for(int i=1;i<planets.size();i++) {
						System.out.println(planets.get(i).getName());
						System.out.println("Le sue lune:");
					}
					break;
			}
			
			System.out.println("Vuoi fare altro? [S=1/N=0]");
			if(sc.nextInt()==0) {
				choise=false;
			}
		}while(choise);

	}
	
	/* //funzione di gestione pianeti
	public static void gestionePianeti() {
		Scanner lettore = new Scanner(System.in);
		System.out.println("Bene, hai scelto di gestire i pianeti.\nCosa vuoi fare?");
		System.out.println(" [1] Aggiungi pianeta      [2] Distruggi pianeta      [3] Ricerca pianeta");
		//PlanetarySystem s = new PlanetarySystem(); il sistema è uno
		if(sc.nextInt()==1) {
			system.addPianeta(system.setPlanet());		
		}
		else if(sc.nextInt()==2) {
			System.out.println("Inserisci nome del pianeta da distruggere: ");
			s.delPlanet(lettore.nextLine());
		}
		else {
			System.out.println("Inserisci nome del pianeta da cercare: ");
			Planet p = s.searchPlanet(lettore.nextLine());
			System.out.println("NOME:"  + p.getName());
			System.out.println("ID: " + p.getId());
			System.out.println("MASSA: " + p.getMassa());
			System.out.println("COORDINATE: (" + p.getX() + " , " + p.getY());			
		}
	}
	
	//gestione lune
	public static void gestioneLune() {
		System.out.println("Bene, hai scelto di gestire le lune.\nCosa vuoi fare?");
		System.out.println(" [1] Aggiungi luna      [2] Distruggi luna      [3] Ricerca luna");
	}
	
	//gestione sistema
	public static void gestioneSistema() {
		System.out.println("Bene, hai scelto di gestire il sistema.\nCosa vuoi fare?");
		System.out.println("[1] Distruggi il sistema      [2] Visualizza sistema");
		if(sc.nextInt()==1) {
			
		}
		else if(sc.nextInt()==2) {
			System.out.println("\nElenco di tutti i pianeti:\n");
			
			System.out.println("\nElenco di tutte le lune:\n");
			
			System.out.println("\n-------------------------------------------------\n");
		}
	}*/
}
