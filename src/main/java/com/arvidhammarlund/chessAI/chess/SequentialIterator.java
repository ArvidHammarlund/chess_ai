package com.arvidhammarlund.chessAI.chess;

import java.util.List;

class DirectionalIterator implements TileIterator {
 
  // --- Attriubtes ---

  private final direction[] directions;
  private final MoveValidator validator;
  private final int length;

  // --- Constructor ---
 
  DirectionalIterator(
      MoveValidator validator, 
      Directions[] directions, 
      int length) {
    this.directions = directions.copy();
    this.validator = validator;
    this.length = length;
  }

  // --- Methods ---

  List<Tile> availableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    List<Tile> res = new ArrayList<>();
    for (int i=1; !directions.isEmpty() && i <= length; i++) {
      for (Iterator iter=directions.iterator(); iter.hasNext();) {
        Tile result = result(t, iter.next(), i, isWhite);
        if (isValidMove(result, friends, foes, isWhite)) {
          res.add(result);
          continue;
        } 
        if (isValidAttack(result, foes)) {
          res.add(result);
        }
        directions.remove(direction);
      }
    } 
    return res
  }

  // --- Helpers ---
  
  private Tile result(
    Tile state, Direction action, int times, boolean isWhite
  ) {
    int x = t.getX() + times * direction.getDx(isWhite); 
    int y = t.getY() + times * direction.getDy(isWhite);
    return new Tile(x,y);
  } 

  private isValidMove(
    Tile t, Piece[][] friends, Piece[][] foes, boolean isWhite
  ) {
    return validator.validateMove(result, friends, foes, isWhite);
  }

  private isValidAttack(Tile result, Piece[][] foes) {
    return validator.validateAttack(result, foes);
  }

}


