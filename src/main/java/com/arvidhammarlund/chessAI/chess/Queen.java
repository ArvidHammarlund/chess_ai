package com.arvidhammarlund.chessAi.chess

import java.util.List;
import java.util.ArrayList;

class Queen implements iPiece {

  // --- Attributes ---
  
  private static final = new Rock();
  private static final = new Bishop();


  private static Move[][] MOVES = buildMoves() 

  // --- Helpers ---

  private static Move[][] buildMoves() {
    res = ArrayList<>;
    for (Move m : Queen.BASIC_MOVES) {
      for (int i = 1; i =< iPiece.LONGEST_PERMITED_CONSEQUTIVE_MOVE; i++) {
        for (int j = 0; j < i; j++) res.add(m);
      }
    }
    return res.toArray();
  }

  // --- Setters & Getters ---

  List<Move[]> getMoves() {
    List<Move[]> res = new ArrayList<Move[]>();
    for (Move m : MOVES) {
      res.add(m.clone());
    }
    return res;
  }
}
