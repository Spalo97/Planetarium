package it.unibs.eclisse.planetarium;

import java.util.*;

public class PlanetariumMain {

	public static void main(String[] args) {
		
		int id = 0;
		
		Pianeta p = new Pianeta("sole", id, 100000, 15, 20);
		
		Sistema s = new Sistema(p);		
				
		if(s.addPianeta(p)) {
			//print "pianeta aggiunto con successo"
			id++;
		}else {
			//print "errore nell'inserimento"
		}

	}

}
