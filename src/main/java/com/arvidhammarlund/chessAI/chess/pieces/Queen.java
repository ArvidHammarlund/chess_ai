package com.arvidhammarlund.chessAI.chess.pieces;

import java.util.List;

class Queen implements iPiece {
 
  // --- Attributes ---

  private static final Direction[] DIRECTIONS = {
    Direction.UP, 
    Direction.DOWN,
    Direction.LEFT,
    Direction.RIGHT,
    Direction.DIAGONAL_UP_LEFT, 
    Direction.DIAGONAL_UP_RIGHT,
    Direction.DIAGONAL_DOWN_LEFT,
    Direction.DIAGONAL_DOWN_RIGHT
  }
  private static final CommonValidator validator = new CommonValidator();
  private static final TileIterator iterator = new SequentialInterator(
    Queen.validator, Queen.DIRECTIONS;
  );

  // --- Methods ---

  @Override
  List<Tile> availableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    return Queen.iterator.availableMoves(t, friends, foes, isWhite);
  }

}

