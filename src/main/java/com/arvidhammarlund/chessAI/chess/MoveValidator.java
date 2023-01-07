package com.arvidhammarlund.chessAI.chess;

interface MoveValidator {

  boolean isValid(Tile t, Piece[][] friends);

}

