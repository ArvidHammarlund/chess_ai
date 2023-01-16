package com.arvidhammarlund.chessAI.chess.pieces;

import java.util.List;
import java.util.ArrayList;

class Knight implements iPiece {
 
  // --- Attributes ---

  private static final CommonValidator validator = new CommonValidator();
  private static final int[][] moves = {
    {2,1}, {2,-1},
    {-2,1}, {-2,-1},
    {1,2}, {-1,2},
    {1,-2}, {-1,-2}
  };

  // --- Methods ---

  @Override
  public List<Tile> getAvailableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    List<Tile> res = new ArrayList<>();
    for (int[] move : moves) {
      int dx = move[0]; 
      int dy = move[1];
      res.add(new Tile(t).translate(dx,dy));
    }
    return res;
  }

}
