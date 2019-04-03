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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMassa(double massa) {
		this.massa = massa;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
