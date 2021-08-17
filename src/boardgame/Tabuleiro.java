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
	
	public Peca piece(int row, int column) {
		return pieces[row][column];
	}

	public Peca piece(Posicao position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Peca piece, Posicao position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.posicao = position;
	}
}
