package com.arvidhammarlund.chessAi.chess

import java.util.List;
import java.util.ArrayList;

class King implements iPiece {

  // --- Attributes ---
  
  private static final Move[][] MOVES = {
    {Board.FORWARDS},
    {Board.DIAGONAL_FORWARDS_RIGHT},
    {Board.RIGHT},
    {Board.DIAGONAL_BACKWARDS_RIGHT},
    {Board.BACKWARDS}, 
    {Board.DIAGONAL_BACKWARDS_RIGHT},
    {Board.LEFT},
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
