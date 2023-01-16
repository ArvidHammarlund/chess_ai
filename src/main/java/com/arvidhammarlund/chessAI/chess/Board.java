package com.arvidhammarlund.chessAI.chess;

import com.arvidhammarlund.chessAI.piece.Piece;
import java.util.List;
import java.util.ArrayList;

class Board {

  // --- Attributes ---
  
  private Piece[][] matrix;

  // --- Constructor

  // --- Methods ---

  Piece[][] parse() {
    List<Piece[]> res = new ArrayList();
    for (Piece[] row : matrix) {
      res.add(
        List.copyOf(Arrays.asList(row))
      );
    }
    return List.toArray(res);
  } 

  void remove(int x, int y) {
    matrix[x][y] = null;
  }

  void add(int x, int y, Piece piece) {
    matrix[x][y] = piece;
  }

  static Piece[][] buildWhites() {
    return {
      {,,,,,,,},
      {,,,,,,,},
      {,,,,,,,},
      {,,,,,,,},
      {,,,,,,,},
      {,,,,,,,},
      {Piece.PAWN,Piece.PAWN,Piece.PAWN,Piece.PAWN,Piece.PAWN,Piece.PAWN,Piece.PAWN,Piece.PAWN},
      {Piece.ROCK,Piece.KNIGHT,Piece.BISHOP,Piece.KING,Piece.QUEEN,Piece.BISHOP,Piece.KNIGHT,Piece.ROCK}
    };
  }

  static Piece[][] buildBlacks() {
    return {
      {Piece.ROCK,Piece.KNIGHT,Piece.BISHOP,Piece.QUEEN,Piece.KING,Piece.BISHOP,Piece.KNIGHT,Piece.ROCK},
      {Piece.PAWN,Piece.PAWN,Piece.PAWN,Piece.PAWN,Piece.PAWN,Piece.PAWN,Piece.PAWN,Piece.PAWN},
      {,,,,,,,},
      {,,,,,,,},
      {,,,,,,,},
      {,,,,,,,},
      {,,,,,,,},
      {,,,,,,,}
    }
  }

}
