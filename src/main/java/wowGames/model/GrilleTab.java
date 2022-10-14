package wowGames.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GrilleTab { 

	public static final int Ligne = 30;
	public static final int Col = 30;
	private static Random random = new Random(System.currentTimeMillis());
	private Object[][] grilleTab;
	private List<Monstre> mons = new ArrayList<Monstre>();

	// contructeur
	public GrilleTab() {
		grilleTab = new Object[Ligne][Col];
		for (int l = 0; l < Ligne; l++) {
			for (int c = 0; c < Col; c++) {
				grilleTab[l][c] = null;
			}
		}
	}

	// Methode
	public void positionnerPersonnage(int l, int c, Personnage p) {
		if (l > 0 && l < Ligne || c > 0 && c < Col) {
			if (this.getCase(l, c) == null) {
				this.setCase(l, c, p);
			}
		}
	}

	public Object getCase(int l, int c) {
		return grilleTab[l][c];
	}

	public void setCase(int l, int c, Object element) {
		this.grilleTab[l][c] = element;
	}

	public static Random getRandom() {
		return random;
	}

	public static void setRandom(Random random) {
		GrilleTab.random = random;
	}

	public Object[][] getGrilleTab() {
		return grilleTab;
	}

	public void setGrilleTab(Object[][] grilleTab) {
		this.grilleTab = grilleTab;
	}

	public List<Monstre> getMons() {
		return mons;
	}

	public void setMons(List<Monstre> mons) {
		this.mons = mons;
	}

	public static int getLigne() {
		return Ligne;
	}

	public static int getCol() {
		return Col;
	}

}
