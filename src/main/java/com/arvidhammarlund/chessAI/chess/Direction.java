package com.arvidhammarlund.chessAI.chess;

enum Direction {

  // --- Constants ---

  UP (0,1),
  DOWN (0,-1),
  RIGHT (1,0),
  LEFT (-1,0),
  DIAGONAL_UP_LEFT (-1,1),
  DIAGONAL_UP_RIGHT (1,1),
  DIAGONAL_DOWN_LEFT (-1,-1),
  DIAGONAL_DOWN_RIGHT (1,-1);
  
  // --- Attributes ---

  private final dx;
  private final dy;

  // --- Constructors ---

  Direction(int dx, int dy) {
    this.dx = dx;
    this.dy = dy;
  }

  // --- Setters & Getters ---

  int getDx(boolean isWhite) {
    return (isWhite) ? dx : dx * -1;
  }

  int getDy(boolean isWhite) {
    return (isWhite) ? dy : dy * -1;
  }

}
