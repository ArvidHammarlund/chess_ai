package com.arvidhammarlund.chessAi.chess

import java.util.List;
import java.util.ArrayList;

class Bishop implements iPiece {

  int SIZE_OF_BOARD;

  Point[] actions(iPiece[][] board) {
    List<Point> res = new ArrayList<>();
    int[][] directions = {
      new int[] {-1,1},
      new int[] {1,1},
      new int[] {-1,-1},
      new int[] {1,1},
    }

    for (int x = 1; x < Bishop.SIZE_OF_BOARD; x++) {
      for (int y = 1; y < Bishop.SIZE_OF_BOARD; y++) {
        for (int[] direction : directions) {
          try {
            newPoint = new Point(this.position)
            newPoint.translate(
              direction[0] * x,
              direction[1] * y
            )
            res.add(this.result(newPoint, board));
          } catch InvalidStateException {

          }

        }
      }
    }
  }

  static result(Point p) throws InvalidStateException {

  }

}
