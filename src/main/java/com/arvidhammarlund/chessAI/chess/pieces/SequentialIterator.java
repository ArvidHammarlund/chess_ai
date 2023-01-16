package com.arvidhammarlund.chessAI.chess.pieces;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class SequentialIterator {
 
  // --- Attriubtes ---

  private final List<Direction> directions;
  private final CommonValidator validator;

  // --- Constructor ---
 
  SequentialIterator(
      CommonValidator validator, 
      Direction[] directions) {
    this.directions = new ArrayList<Direction>(Arrays.asList(directions));
    this.validator = validator;
  }

  // --- Methods ---

  List<Tile> availableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    List<Tile> res = new ArrayList<>();
    for (int i=1; !directions.isEmpty(); i++) {
      for (Iterator<Direction> iter=directions.iterator(); iter.hasNext();) {
        Direction direction = iter.next();
        Tile result = result(t, direction, i, isWhite);
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
    return res;
  }

  // --- Helpers ---
  
  private Tile result(
    Tile t, Direction direction, int times, boolean isWhite
  ) {
    int x = t.getX() + times * direction.getDx(isWhite); 
    int y = t.getY() + times * direction.getDy(isWhite);
    return new Tile(x,y);
  } 

  private boolean isValidMove(
    Tile t, Piece[][] friends, Piece[][] foes, boolean isWhite
  ) {
    return validator.isValidMove(t, friends);
  }

  private boolean isValidAttack(Tile result, Piece[][] foes) {
    return validator.isValidAttack(result, foes);
  }

}


