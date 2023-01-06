package com.arvidhammarlund.chessAi.chess

import java.awt.Point();

enum Move {

  FORWARDS (0,1),
  DIAGONAL_FORWARDS_RIGHT (1,1),
  RIGHT (1,0),
  DIAGONAL_BACKWARDS_RIGHT (1,-1),
  BACKWARDS (0,-1), 
  DIAGONAL_BACKWARDS_LEFR (-1,-1),
  LEFT (-1,0),
  DIAGONAL_FORWARDS_LEFT (-1,1),
  PERPENDICULAR_FORWARDS_LEFT (-1,2),
  PERPENDICULAR_FORWARDS_RIGHT (1,2),
  PERPENDICULAR_BACKWARDS_LEFT (-1,-2),
  PERPENDICULAR_BACKWARDS_RIGHT (1,-2);

  private final int dx;
  private final int dy; 

  private Move(int dx, int dy) {
    this.dx = dx;
    this.dy = dy;
  }

  Point result(Point p, Boolean isWhite) {
    if (isWhite) {
      p.translate(dx, dy);
    } else {
      p.translate(-1*dx, -1*dy);
    }
  } 

}
