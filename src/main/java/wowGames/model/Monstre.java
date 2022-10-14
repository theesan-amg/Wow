package wowGames.model;



public class Monstre {
	
	private String nom;
	private int pointDeVie;
	private int mAttaque;
	private int mDefense;
	private int degats;
	protected Position mPosition;
	
	
	public Monstre(String nom, int pointDeVie, int attaque, int defense) {
		super();
		this.nom = nom;
		this.pointDeVie = pointDeVie;
		this.mAttaque = attaque;
		this.mDefense = defense;
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

	public int getmAttaque() {
		return mAttaque;
	}

	public void setmAttaque(int mAttaque) {
		this.mAttaque = mAttaque;
	}

	public int getmDefense() {
		return mDefense;
	}

	public void setmDefense(int mDefense) {
		this.mDefense = mDefense;
	}

	public int getDegats() {
		return degats;
	}

	public void setDegats(int degats) {
		this.degats = degats;
	}

	public Position getmPosition() {
		return mPosition;
	}

	public void setmPosition(Position mPosition) {
		this.mPosition = mPosition;
	}
}
