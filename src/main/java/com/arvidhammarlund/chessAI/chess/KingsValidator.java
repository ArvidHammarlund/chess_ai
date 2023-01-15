package com.arvidhammarlund.chessAI.chess;

class KingsValidator implements MoveValidator {

  // --- Methods ---

  static boolean validateMove(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite
  ) {
    return (
      CommonValidator.validateMove(t, friends, foes, isWhite) 
      && !KingsValidator.kingIsNeighbour(t, foes);
    )
  }

  static boolean validateAttack(Tile t, piece[][] foes) {
    return (
      CommonValidator.validateMove(t, friends, foes, isWhite)
      && !KingsValidator.kingIsNeighbour(t, foes);
  }

  // --- Helpers ---

  private static boolean kingIsNeighbour(Tile t, Piece[][] foes) {
    boolean res = false;
    for (int x = t.getX()-1; x < t.getX()+2; x++) {
      for (int y = t.getY()-1; y < t.getY()+2; y++) {
        if (foes[x][y] == Piece.KING) {
          res = true;
          return res;
        }
      }
    }
    return res;
  }

}
