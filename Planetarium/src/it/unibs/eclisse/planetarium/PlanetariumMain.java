package it.unibs.eclisse.planetarium;
import java.util.*;

public class PlanetariumMain {
	
	//idPlanet serve per contare quanti pianeti aggiungo correttamente
	// in modo da gestire l'assegnazione dell'id
	private int idPlanet = 0;
	
	public int getIdPlanet() {
		return idPlanet;
	}
	public void setIdPlanet(int idPlanet) {
		this.idPlanet = idPlanet;
	}
	
	public static void main(String[] args) {
		PlanetariumMain idPlanet = new PlanetariumMain();
		int id=idPlanet.getIdPlanet();
		
		//Creazione stella nel sistema solare (s)
		Planet p = new Planet("sole", id, 100000, 15, 20);
		PlanetarySystem s = new PlanetarySystem(p);		
		
		p= s.setPlanet();
		if(s.addPianeta(p)) {
			//print "pianeta aggiunto con successo"
			id++;
			idPlanet.setIdPlanet(id);
			
		}else {
			//print "errore nell'inserimento"
			//test nick
		}
		
		
	}

}
