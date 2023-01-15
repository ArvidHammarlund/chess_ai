package com.arvidhammarlund.chessAI.chess.pieces;

import java.util.List;

class Rock implements iPiece {
 
  // --- Attributes ---

  private static final Direction[] DIRECTIONS = {
    Direction.UP, 
    Direction.DOWN,
    Direction.LEFT,
    Direction.RIGHT
  }
  private static final CommonValidator validator = new CommonValidator();
  private static final TileIterator iterator = new SequentialInterator(
    Rock.validator, Rock.DIRECTIONS;
  );

  // --- Methods ---

  @Override
  List<Tile> availableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    return Rock.iterator.availableMoves(t, friends, foes, isWhite);
  }

}
