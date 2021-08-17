package boardgame;

public class Tabuleiro {

	private int rows;
	private int columns;
	private Peca[][] pieces;

	public Tabuleiro() {

	}

	public Tabuleiro(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro ao criar tabuleiro : tem que existir ao menos 1 linha e 1 coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Peca[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Peca piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Posição não encontrada no tabuleiro");
		}
		return pieces[row][column];
	}

	public Peca piece(Posicao position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição não encontrada no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Peca piece, Posicao position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Posição: " + position + " já preenchida");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.posicao = position;
	}

	public boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExists(Posicao position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Posicao position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição: " + position + " já preenchida");
		}
		return piece(position) != null;
	}
}
