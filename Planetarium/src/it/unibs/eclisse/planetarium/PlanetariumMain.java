package it.unibs.eclisse.planetarium;
import java.util.*;

public class PlanetariumMain {
	
	private static Scanner sc = new Scanner(System.in);
	
	//idPlanet serve per contare quanti pianeti aggiungo correttamente
	// in modo da gestire l'assegnazione dell'id
	private int idPlanet = 0;
	public int getIdPlanet() {
		return idPlanet;}
	public void setIdPlanet(int idPlanet) {
		this.idPlanet = idPlanet;}
	
	
	public static void main(String[] args) {
		PlanetariumMain idPlanet = new PlanetariumMain();
		int id=idPlanet.getIdPlanet();
		PlanetarySystem s = new PlanetarySystem();
		
		
		//Creazione stella nel sistema solare (s)
		Planet p = new Planet("sole", id, 100000, 0, 0);
		s.addStar(p);		
		//stella creata
		
		//interazioni con l'utente
		System.out.println("Buongiorno, questo è il software per la gestione del tuo sistema solare.\nCosa vuoi fare?");
		System.out.println(" [1] Gestisci pianeti      [2] Gestisci lune      [3] Gestisci sistema");
		
		switch(sc.nextInt()) {
		case 1:
			gestionePianeti();
			break;
		case 2:
			gestioneLune();
			break;
		case 3:
			gestioneSistema();
			break;
		}
			

	}
	
	//funzione di gestione pianeti
	public static void gestionePianeti() {
		Scanner lettore = new Scanner(System.in);
		System.out.println("Bene, hai scelto di gestire i pianeti.\nCosa vuoi fare?");
		System.out.println(" [1] Aggiungi pianeta      [2] Distruggi pianeta      [3] Ricerca pianeta");
		PlanetarySystem s = new PlanetarySystem();
		if(sc.nextInt()==1) {
			s.addPianeta(s.setPlanet());		
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
	}
}
