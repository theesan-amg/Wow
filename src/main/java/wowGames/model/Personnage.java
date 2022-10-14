package wowGames.model;

import java.util.Random;

public class Personnage {
	private String nom;
	private int pointDeVie;
	private int pAttaque;
	private int pDefense;
	private int degats;
	protected Position pPosition;

	public Personnage(String nom, int pointDeVie, int attaque, int defense) {
		this.nom = nom;
		this.pointDeVie = pointDeVie;
		this.pAttaque = attaque;
		this.pDefense = defense;
	}

	public int attquer() {
		Random rndm = new Random();
		int a = rndm.nextInt(pAttaque);
		return a;
	}
	
	public void defendre(int degats) {
	//Soustraire aux point de vie les degats 
	this.pointDeVie -= degats;
}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

	public int getpAttaque() {
		return pAttaque;
	}

	public void setpAttaque(int pAttaque) {
		this.pAttaque = pAttaque;
	}

	public int getpDefense() {
		return pDefense;
	}

	public void setpDefense(int pDefense) {
		this.pDefense = pDefense;
	}

	public int getDegats() {
		return degats;
	}

	public void setDegats(int degats) {
		this.degats = degats;
	}

	public Position getpPosition() {
		return pPosition;
	}

	public void setpPosition(Position pPosition) {
		this.pPosition = pPosition;
	}

	public static void main() {
		
		System.out.println("test");
	}
}