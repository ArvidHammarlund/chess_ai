package com.arvidhammarlund.chessAI.chess.pieces;

import java.util.List;

public enum Piece {

  // --- Constants ---

  PAWN (new Pawn()),
  KING (new King()),
  QUEEN (new Queen()),
  ROCK (new Rock()),
  BISHOP (new Bishop()),
  KNIGHT (new Knight());

  // --- Attributes ---
  
  private iPiece piece;

  // --- Constructor ---

  Piece(iPiece piece) {
    this.piece = piece; 
  }

  // --- Methods ---

  List<Tile> getAvailableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite
  ) {
    return piece.getAvailableMoves(t, friends, foes, isWhite);
  }

}


