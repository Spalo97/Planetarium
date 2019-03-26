package it.unibs.eclisse.planetarium;

public class Corpo {

	private String nome;
	private double massa;
	private int id;
	private int x;
	private int y;
	
	public Corpo(String nome, double massa, int id, int x, int y) {
		
		this.nome=nome;
		this.massa=massa;
		this.id=id;
		this.x=x;
		this.y=y;
	}
}
