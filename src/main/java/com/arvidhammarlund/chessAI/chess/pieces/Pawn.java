package com.arvidhammarlund.chessAI.chess.pieces;

import java.util.List;
import java.util.ArrayList;

class Pawn implements iPiece {
 
  // --- Attributes ---

  private static final CommonValidator validator = new CommonValidator();

  // --- Methods ---

  @Override
  public List<Tile> getAvailableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    List<Tile> res = Pawn.getValidAttacks(t, foes, isWhite);
    res.addAll(Pawn.getValidMoves(t, friends, isWhite));
    return res;
  }

  // --- Helpers 
  
  private static List<Tile> getValidAttacks(
      Tile t,
      Piece[][] foes,
      boolean isWhite) {
    List<Tile> res = new ArrayList<>(1);
    Tile left = Direction.DIAGONAL_UP_LEFT.result(t);
    Tile right = Direction.DIAGONAL_UP_RIGHT.result(t);
    if (validator.isValidAttack(left, foes)) res.add(left);
    if (validator.isValidAttack(right, foes)) res.add(right);
    return res;
  }

  private static List<Tile> getValidMoves(
      Tile t,
      Piece[][] friends,
      boolean isWhite) {
    List<Tile> res = new ArrayList<>(1);
    Tile result = Direction.UP.result(t);
    if (validator.isValidMove(result, friends)) res.add(result);
    return res;
  }

}
