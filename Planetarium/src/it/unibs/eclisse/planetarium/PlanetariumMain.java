package it.unibs.eclisse.planetarium;

import java.util.*;

public class PlanetariumMain {

	public static void main(String[] args) {
		
		int id = 0;
		
		Planet p = new Planet("sole", id, 100000, 15, 20);
		
		PlanetarySystem s = new PlanetarySystem(p);		
				
		if(s.addPianeta(p)) {
			//print "pianeta aggiunto con successo"
			id++;
		}else {
			//print "errore nell'inserimento"
			//test nick
		}
		
	}

}
