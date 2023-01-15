package com.arvidhammarlund.chessAI.chess;

import java.util.List;

public enum Piece {

  // --- Constants ---

  PAWN (
    new DirectionalInterator(
      new PawnsValidator(),
      {Direction.UP, 
       Direction.DIAGONAL_UP_LEFT, 
       Direction.DIAGONAL_UP_RIGHT},
      1
    )
  ),
  KING (
    new DirectionalInterator(
      new KingsValidator(),
      {Direction.UP, 
       Direction.DOWN,
       Direction.LEFT,
       Direction.RIGHT}
       Direction.DIAGONAL_UP_LEFT, 
       Direction.DIAGONAL_UP_RIGHT,
       Direction.DIAGONAL_DOWN_LEFT,
       Direction.DIAGONAL_DOWN_RIGHT}
      1
    )
  ),
  BISHOP (
    new DirectionalInterator(
      new CommonValidator(),
      {Direction.DIAGONAL_UP_LEFT, 
       Direction.DIAGONAL_UP_RIGHT,
       Direction.DIAGONAL_DOWN_LEFT,
       Direction.DIAGONAL_DOWN_RIGHT}
      7
    )
  ),
  KNIGHT (
    new MirroredIterator(
      new CommonValidator(),
      2,1
    )
  ),
  ROCK (
    new DirectionalInterator(
      new CommonValidator(),
      {Direction.UP, 
       Direction.DOWN,
       Direction.LEFT,
       Direction.RIGHT}
      7
    )
  ), 
  QUEEN (
    new DirectionalInterator(
      new CommonValidator(),
      {Direction.UP, 
       Direction.DOWN,
       Direction.LEFT,
       Direction.RIGHT}
       Direction.DIAGONAL_UP_LEFT, 
       Direction.DIAGONAL_UP_RIGHT,
       Direction.DIAGONAL_DOWN_LEFT,
       Direction.DIAGONAL_DOWN_RIGHT}
      7
    )
  );
    
  // --- Attributes ---

  private final TileIterator iterator;

  // --- Constructor ---

  Piece(TileIterator iterator) {
    this.iterator = iterator; 
  }

  // --- Methods ---

  List<Tile> availableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite
  ) {
    return iterator.availableMoves(t, friends, foes, isWhite);
  }

}


