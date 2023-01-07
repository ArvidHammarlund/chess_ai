package com.arvidhammarlund.chessAI.chess;

enum Direction {
  UP (0,1),
  DOWN (0,-1),
  RIGHT (1,0),
  LEFT (-1,0),
  DIAGONAL_UP_LEFT (-1,1),
  DIAGONAL_UP_RIGHT (1,1),
  DIAGONAL_DOWN_LEFT (-1,-1),
  DIAGONAL_DOWN_RIGHT (1,-1);

  private final dx;
  private final dy;

  Direction(int dx, int dy) {
    this.dx = dx;
    this.dy = dy;
  }

  // --- Setters & Getters ---

  int getDx() {
    return dx;
  }

  int getDy() {
    return dy;
  }

}
