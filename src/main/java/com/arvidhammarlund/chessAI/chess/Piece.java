package com.arvidhammarlund.chessAI.chess;

import java.util.List;

public enum Piece {

  // --- Constants ---

  PAWN (
    new DirectionalInterator(
      new PawnsValidator(),
      {Direction.UP, 
       Direction.DOWN,
       Direction.DIAGONAL_UP_LEFT, 
       Direction.DIAGONAL_UP_RIGHT,
       Direction.DIAGONAL_DOWN_LEFT,
       Direction.DIAGONAL_DOWN_RIGHT}
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
    )
  ),
  BISHOP (
    new DirectionalInterator(
      new CommonValidator(),
      {Direction.DIAGONAL_UP_LEFT, 
       Direction.DIAGONAL_UP_RIGHT,
       Direction.DIAGONAL_DOWN_LEFT,
       Direction.DIAGONAL_DOWN_RIGHT}
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
    )
  ), 
  ROCK (
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
    )
  );
    
  // --- Attributes ---

  private final TileIterator choserAvailableMoves;

  // --- Constructor ---

  Piece(TileIterator iterator) {
    this.choserAvailableMoves = iterator; 
  }

  // --- Methods ---

  List<Tile> availableMoves(Tile t) {
    return choserAvailableMoves.iterate(t);
  }

}


