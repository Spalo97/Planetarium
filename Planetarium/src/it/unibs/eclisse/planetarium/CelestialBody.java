package it.unibs.eclisse.planetarium;

public class CelestialBody {

	private String name;
	private double massa;
	private int id;
	private double x;
	private double y;
	
	public CelestialBody(String nome, double massa, int id, double x, double y) {
		
		this.name=nome;
		this.massa=massa;
		this.id=id;
		this.x=x;
		this.y=y;
	}

	public String getName() {
		return name;
	}

	public double getMassa() {
		return massa;
	}

	public int getId() {
		return id;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

}
