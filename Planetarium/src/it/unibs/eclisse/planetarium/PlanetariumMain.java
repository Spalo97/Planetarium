package it.unibs.eclisse.planetarium;
import java.util.*;

public class PlanetariumMain {	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idPlanet = 0;
		String name;
		double mass;
		int x;
		int y;
		boolean choise = true;
		LinkedList<Moon> tempMoon = new LinkedList<Moon>();
		LinkedList<Planet> planets = new LinkedList<Planet>();
		Planet p;
		//PlanetariumMain idPlanet = new PlanetariumMain();  e questa da dove esce?
		//int id=idPlanet.getIdPlanet();
		
		//Creazione stella nel sistema solare (s) - Ok ma va chiesto la stella perÃ²
		//Planet p = new Planet("sole", id, 100000, 0, 0);
		//s.addStar(p);		
		//stella creata
		
		//interazioni con l'utente
		System.out.println("Buongiorno, questo ï¿½ il software per la gestione del tuo sistema solare.\nInserisci i dati della stella del sistema.");
		System.out.println("Inserisci nome:");
		name = sc.nextLine();
		System.out.println("Inserisci massa:");
		mass = sc.nextDouble();
		Planet stella = new Planet(name,mass, idPlanet, 0, 0, null);
		idPlanet++;
		PlanetarySystem system = new PlanetarySystem(stella);
		system.getPlanets().add(stella);
		
		do {
			System.out.println("Cosa vuoi fare?");
			System.out.println(" [1] Gestisci pianeti      [2] Gestisci lune      [3] Visualizza sistema 	[4]Centro di Massa");
			
			switch(sc.nextInt()) {
				case 1:
					System.out.println("Bene, hai scelto di gestire i pianeti.\nCosa vuoi fare?");
					System.out.println(" [1] Aggiungi pianeta      [2] Distruggi pianeta      [3] Ricerca pianeta");
					if(sc.nextInt()==1) {
						System.out.println("Inserisci i dati del pianeta: ");
						System.out.print("NOME: ");
						name = sc.next(); 
						System.out.println("MASSA: ");
						mass = sc.nextDouble();
						System.out.println("COORDINATA X:");
						x=sc.nextInt();
						System.out.println("COORDINATA Y:");
						y=sc.nextInt();
						p = new Planet(name,mass,idPlanet,x, y, null);
						System.out.println("Il pianeta ha delle lune? S[1]/N[0]");
						idPlanet++;
						if (sc.nextInt()==1) {
							do {
								System.out.println("Inserisci i dati della luna: ");
								System.out.print("NOME: ");
								name = sc.next();
								System.out.println("MASSA: ");
								mass = sc.nextDouble();
								System.out.println("COORDINATA X:");
								x=sc.nextInt();
								System.out.println("COORDINATA Y:");
								y=sc.nextInt();
								Moon m = new Moon(name,mass,idPlanet,x, y);
								tempMoon.add(m);
								idPlanet++;
								System.out.println("il pianeta ha altre lune?  S[1]/N[0]");
							}while(sc.nextInt()==1);
							p.getMoons().addAll(tempMoon);
							tempMoon.clear();
						}
						system.getPlanets().add(p);
					}
					else if(sc.nextInt()==2) {
						System.out.println("Inserisci nome del pianeta da distruggere: ");
						system.delPlanet(sc.nextLine());
					}
					else {
						System.out.println("Inserisci nome del pianeta da cercare: ");
						p = system.searchPlanet(sc.nextLine());
						System.out.println("NOME:"  + p.getName());
						System.out.println("ID: " + p.getId());
						System.out.println("MASSA: " + p.getMassa());
						System.out.println("COORDINATE: (" + p.getX() + " , " + p.getY());			
					}
					break;
				case 2:
					System.out.println("Bene, hai scelto di gestire le lune.\nCosa vuoi fare?");
					System.out.println(" [1] Aggiungi luna      [2] Distruggi luna      [3] Ricerca luna");
					
					if(sc.nextInt()==1) {
						System.out.print("A quale pianeta vuoi aggiungere delle lune?");
						p = system.searchPlanet(sc.next());
						
						System.out.println("Inserisci i dati della luna: ");
						System.out.print("NOME: ");
						name = sc.next(); 
						System.out.println("MASSA: ");
						mass = sc.nextDouble();
						System.out.println("COORDINATA X:");
						x=sc.nextInt();
						System.out.println("COORDINATA Y:");
						y=sc.nextInt();
						Moon m = new Moon(name,mass,idPlanet,x, y);
						idPlanet++;
						p.getMoons().add(m);
					}
					else if(sc.nextInt()==2) {
						System.out.print("Intorno quale pianeta orbita la luna?: ");
						p=system.searchPlanet(sc.next());
						System.out.print("Inserisci nome della luna da distruggere?");
						p.delMoon(sc.next());
						
					}
					else if(sc.nextInt()==3){
						System.out.print("Intorno quale pianeta orbita la luna?: ");
						p=system.searchPlanet(sc.next());
						System.out.print("Inserisci nome della luna da cercare: ");
						p.searchMoon(sc.next());
						System.out.println("NOME:"  + p.getName());
						System.out.println("ID: " + p.getId());
						System.out.println("MASSA: " + p.getMassa());
						System.out.println("COORDINATE: (" + p.getX() + " , " + p.getY()+")");			
					}
					break;
				case 3:					
					System.out.println("\nElenco di tutti i pianeti:\n");
					system.showPlanets();
					break;
			
				case 4:
					System.out.println("Il centro di massa è; ");
					System.out.println("( " +system.calcMassCenterX() +" , " +system.calcMassCenterY() + " )");
					break;
				
				}
			System.out.println("Vuoi fare altro? [S=1/N=0]");
			if(sc.nextInt()==0) {
				choise=false;
			}
		}while(choise);
	}
}