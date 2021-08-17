package chess;

import boardgame.Peca;
import boardgame.Tabuleiro;

public class ChessPiece extends Peca {

	private Color color;

	public ChessPiece(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
