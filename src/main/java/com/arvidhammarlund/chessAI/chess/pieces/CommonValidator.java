package com.arvidhammarlund.chessAI.chess.pieces;

class CommonValidator {

  boolean validateMove(
      Tile t,
      Piece[][] friends,
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

  boolean validateAttack(Tile t, piece[][] foes) {
    return foes[t.getX()][t.getY()] != null;
  }

}

