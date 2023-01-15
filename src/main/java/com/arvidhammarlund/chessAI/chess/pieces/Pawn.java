package com.arvidhammarlund.chessAI.chess.pieces;

import java.util.List;

class Pawn implements iPiece {
 
  // --- Attributes ---

  private static final CommonValidator validator = new CommonValidator();

  // --- Methods ---

  @Override
  List<Tile> availableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    return ;
  }

  // --- Helpers 
  
  private static List<Tile> getValidAttacks(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    List<Tile> res = new ArrayList<>(1);
    Tile left = Direction.DIAGONAL_UP_LEFT.result(t);
    Tile right = Direction.DIAGONAL_UP_RIGHT.result(t);
    if (validator.isValidAttack(left)) res.add(result);
    if (validator.isValidAttack(left)) res.add(result);
    return res;
  }

  private static List<Tile> getValidMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    List<Tile> res = new ArrayList<>(1);
    Tile result = Direction.UP.result(t);
    if (validator.isValidMove(result)) res.add(result);
    return res;
  }

}
