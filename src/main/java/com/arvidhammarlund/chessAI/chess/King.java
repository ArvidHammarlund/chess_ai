package com.arvidhammarlund.chessAi.chess

import java.util.List;
import java.util.ArrayList;

class King implements iPiece {

  private int x;
  private int y;

  // --- Constructors ---


  // --- Attributes ---
  
  private static final Move[][] MOVES = {
    {Move.FORWARDS},
    {Move.DIAGONAL_FORWARDS_RIGHT},
    {Move.RIGHT},
    {Move.DIAGONAL_BACKWARDS_RIGHT},
    {Move.BACKWARDS}, 
    {Move.DIAGONAL_BACKWARDS_RIGHT},
    {Move.LEFT},
    {Move.DIAGONAL_FORWARDS_LEFT};
  }

  // --- Methods ---
    
  static int[][] actions(Point p, boolean isWhite, int size) {
    List<int[]> res = new ArrayList<>();
    for (Move[] moves : Moves) {
      Point tmp = new Point(p);
      for (Move move : moves) {
        move.result(tmp, isWhite)
      }
      
    }
    
  }

}
