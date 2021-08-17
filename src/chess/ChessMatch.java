package chess;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Tabuleiro board;

	public ChessMatch() {
		board = new Tabuleiro(8, 8);
		inicialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void inicialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Posicao(2,1));
		board.placePiece(new King(board, Color.BLACK), new Posicao(0,4));
		board.placePiece(new King(board, Color.WHITE), new Posicao(7,4));
	}
}
