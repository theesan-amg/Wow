package wowGames.model;

public class Heros extends Personnage {

	private String nomArme;
	private int impactEpee;
	private int poidsEpee;
	private int longueuEpee;

	public Heros() {
		super("Arthur",100 , 50 , 30);
		this.nomArme = "Excalibur";
		this.impactEpee = 20;
		this.longueuEpee = 40;
		this.poidsEpee = 20;
	}

	public String getNomArme() {
		return nomArme;
	}

	public void setNomArme(String nomArme) {
		this.nomArme = nomArme;
	}

	public int getImpactEpee() {
		return impactEpee;
	}

	public void setImpactEpee(int impactEpee) {
		this.impactEpee = impactEpee;
	}

	public int getPoidsEpee() {
		return poidsEpee;
	}

	public void setPoidsEpee(int poidsEpee) {
		this.poidsEpee = poidsEpee;
	}

	public int getLongueuEpee() {
		return longueuEpee;
	}

	public void setLongueuEpee(int longueuEpee) {
		this.longueuEpee = longueuEpee;
	};
	
	public static void main() {
		
		System.out.println("test");
	}

}
