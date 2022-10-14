package wowGames.model;

public class GrumMonstre extends Monstre {

	private String nomArme;
	private int impactEpee;
	private int poidsEpee;
	private int longueuEpee;
	
	public GrumMonstre(Position p) {
		super("Grum", 100,40,20);
		this.impactEpee = 20 ;
		this.longueuEpee = 30;
		this.poidsEpee = 30;
		mPosition = p;
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
	}



public static void main() {
	
	System.out.println("test");
}

}
