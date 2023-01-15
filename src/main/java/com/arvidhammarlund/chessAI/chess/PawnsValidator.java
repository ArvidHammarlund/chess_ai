package com.arvidhammarlund.chessAI.chess;

class PawnsValidator implements MoveValidator {

  // --- Methods ---

  static boolean validateMove(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    return (
      CommonValidator.validateMove(t, friends, foes, isWhite) 
      && !KingsValidator.kingIsNeighbour(t, foes);
    )
  }

  static boolean validateAttack(Tile t, piece[][] foes) {
    return (
      CommonValidator.validateMove(t, friends, foes, isWhite)
      && !KingsValidator.kingIsNeighbour(t, foes);
  }

}
