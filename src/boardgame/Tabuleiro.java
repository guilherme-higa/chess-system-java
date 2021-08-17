package boardgame;

public class Tabuleiro {

	private int rows;
	private int columns;
	private Peca[][] pieces;

	public Tabuleiro() {

	}

	public Tabuleiro(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Peca[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

}
