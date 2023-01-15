package com.arvidhammarlund.chessAI.chess;

interface MoveValidator {

  boolean validateMove(
    Tile t,
    Piece[][] friends,
    Piece[][] foes,
    boolean isWhite
  );

  boolean validateAttack(
    Tile result,
    Piece[][] foes
  );

}

