package com.arvidhammarlund.chessAI.chess;
import java.awt.Point;

class CommonValidator implements MoveValidator {

  boolean isValid(Tile t, Piece[][] friends) {
    int inferedSize = friends.length;
    int x = t.getX();
    int y = t.getY();
    return ! (
      (x < 0 || x >= inferedSize) || 
      (y < 0 || x >= inferedSize) || 
      (friends[x][y] != null)
    );
  }

}

