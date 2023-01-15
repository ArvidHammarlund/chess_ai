package com.arvidhammarlund.chessAI.chess;

class CommonValidator implements MoveValidator {

  static boolean validateMove(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite
  ) {
    int inferedSize = friends.length;
    int x = t.getX();
    int y = t.getY();
    return ! (
      (x < 0 || x >= inferedSize) || 
      (y < 0 || x >= inferedSize) || 
      (friends[x][y] != null)
    );
  }

  static boolean validateAttack(Tile t, piece[][] foes) {
    return foes[t.getX()][t.getY()] != null;
  }

}

