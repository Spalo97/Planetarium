package it.unibs.eclisse.planetarium;

public class CelestialBody {

	private String nome;
	private double massa;
	private int id;
	private int x;
	private int y;
	
	public CelestialBody(String nome, double massa, int id, int x, int y) {
		
		this.nome=nome;
		this.massa=massa;
		this.id=id;
		this.x=x;
		this.y=y;
	}

	public String getNome() {
		return nome;
	}

	public double getMassa() {
		return massa;
	}

	public int getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
