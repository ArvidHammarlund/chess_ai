package com.arvidhammarlund.chessAi.chess

import java.util.List;
import java.util.ArrayList;

class Pawn implements iPiece {

  // --- Attributes ---
  
  private static final Move[][] MOVES = {
    {Board.FORWARDS},
    {Board.DIAGONAL_FORWARDS_RIGHT},
    {Board.DIAGONAL_FORWARDS_LEFT};
  }

  // --- Setters & Getters ---

  Move[][] getMoves() {
    List<Move[]> res = new ArrayList<Move[]>();
    for (Move m : MOVES) {
      res.add(m.clone());
    }
    return res;
  }

}
