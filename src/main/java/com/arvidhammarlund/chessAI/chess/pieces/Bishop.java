package com.arvidhammarlund.chessAI.chess.pieces;

import java.util.List;

class Bishop implements iPiece {
 
  // --- Attributes ---

  private static final Direction[] DIRECTIONS = {
    Direction.DIAGONAL_UP_LEFT, 
    Direction.DIAGONAL_UP_RIGHT,
    Direction.DIAGONAL_DOWN_LEFT,
    Direction.DIAGONAL_DOWN_RIGHT
  };
  private static final CommonValidator validator = new CommonValidator();
  private static final SequentialIterator iterator = new SequentialIterator(
    Bishop.validator, Bishop.DIRECTIONS
  );

  // --- Methods ---

  @Override
  public List<Tile> getAvailableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    return Bishop.iterator.availableMoves(t, friends, foes, isWhite);
  }

}


