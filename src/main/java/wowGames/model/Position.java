package wowGames.model;

public class Position {

	private int xLigne;
	private int yCol;

	public Position(int xLigne, int yCol) {
		this.xLigne = xLigne;
		this.yCol = yCol;
	}

	public int getxLigne() {
		return xLigne;
	}

	public void setxLigne(int xLigne) {
		this.xLigne = xLigne;
	}

	public int getyCol() {
		return yCol;
	}

	public void setyCol(int yCol) {
		this.yCol = yCol;
	}

	public static void main() {

		System.out.println("test");
	}

}
