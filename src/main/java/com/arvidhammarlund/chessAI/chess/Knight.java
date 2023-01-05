package com.arvidhammarlund.chessAi.chess

import java.util.List;
import java.util.ArrayList;

class Knight implements iPiece {

  // --- Attributes ---
  
  private final Move[][] MOVES = {
    {Board.FORWARDS, Board.FORWARDS, Board.RIGHT},
    {Board.FORWARDS, Board.FORWARDS, Board.LEFT},
    {Board.RIGHT, Board.RIGHT, Board.FORWARDS},
    {Board.RIGHT, Board.RIGHT, Board.BACKWARDS},
    {Board.BACKWARDS, Board.BACKWARDS, Board.RIGHT},
    {Board.BACKWARDS, Board.BACKWARDS, Board.LEFT},
    {Board.LEFT, Board.LEFT, Board.FORWARDS},
    {Board.LEFT, Board.LEFT, Board.BACKWARDS};
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
