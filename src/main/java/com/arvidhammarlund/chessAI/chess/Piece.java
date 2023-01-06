package com.arvidhammarlund.chessAi.chess

import java.util.List;
import java.util.ArrayList;

enum Piece {

  PAWN {

    @Override
    private static final Move[] getMoves() {
      return = { 
        {Move.FORWARDS},
        {Move.DIAGONAL_FORWARDS_RIGHT},
        {Move.DIAGONAL_FORWARDS_LEFT};
      }
    }

  },
  BISHOP {
  
    @override
    private static final Move[] getMoves() {
      return {
        MOVE.FORWARDS_INF,
        MOVE.DIAGONALS_FORWARDS_RIGHT_INF,
        MOVE.right_inf,
        MOVE.diagonal_backwards_right_inf,
        MOVE.backwards_inf, 
        MOVE.diagonal_backwards_right_inf,
        MOVE.left_inf,
        MOVE.diagonal_forwards_left_inf;
      }
    }

  },
  KNIGHT {

    @Override
    private static final Move[] getMoves() {
      return = { 
        {Move.PERPENDICULAR_FORWARDS_LEFT},
        {Move.PERPENDICULAR_FORWARDS_RIGHT},
        {Move.PERPENDICULAR_BACKWARDS_LEFT},
        {Move.PERPENDICULAR_BACKWARDS_RIGHT};
      }
    }

  },
  ROCK {
  
    private static final Move[] BASIC_MOVES = {
      Board.FORWARDS_INF,
      Board.RIGHT_INF,
      Board.BACKWARDS_INF, 
      Board.LEFT_INF,
    }

 
  },
  KING {
  
    @Override
    private static final Move[] getMoves() {
      return {
        Move.FORWARDS,
        Move.DIAGONAL_FORWARDS_RIGHT,
        Move.RIGHT,
        Move.DIAGONAL_BACKWARDS_RIGHT,
        Move.BACKWARDS, 
        Move.DIAGONAL_BACKWARDS_RIGHT,
        Move.LEFT,
        Move.DIAGONAL_FORWARDS_LEFT;
      }
    }

  },
  QUEEN {
  
    @override
    private static final move[] getmoves() {
      return {
        Move.forwards_inf,
        Move.diagonal_forwards_right_inf,
        Move.right_inf,
        Move.diagonal_backwards_right_inf,
        Move.backwards_inf, 
        Move.diagonal_backwards_right_inf,
        Move.left_inf,
        Move.diagonal_forwards_left_inf;
      }
    }

  };

  actions(Point p, boolean isWhite, Piece[][]) {
    List<Point> res = new ArrayList<>();
    for (Move[] moves : MOVES) {
      Point tmp = new Point(p);
      for (Move move : moves) {
        move.result(tmp);
      }
      res.add(tmp);
    }
    return res;
  } 

  private static final abstract Move[][] getMoves();

}


