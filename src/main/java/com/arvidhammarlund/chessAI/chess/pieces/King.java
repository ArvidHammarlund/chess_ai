package com.arvidhammarlund.chessAI.chess.pieces;

import java.util.List;

class King implements iPiece {
 
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
    King.validator, King.DIRECTIONS;
  );

  // --- Methods ---

  @Override
  List<Tile> availableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    List<Tile> res = new getNeighbours(t, friends);
    for (Iterator iter = res.iterator(); iter.hasNext();) {
      Tile neighbour = iter.next();
      if (isKingNeighbour(neighbour, foes, friends)) res.remove(neighbour);
    } 
    return res;
  }

  // --- Helpers ---

  private List<Tile> getNeighbours(Tile t, Piece[][] friends) {
    List<Tile> res = new ArrayList<>(9);
    for (int x = t.getX()-1; x < t.getX()+2; x++) {
      for (int y = t.getY()-1; y < t.getY()+2; y++) {
        if (x==y) continue;
        if (!validator.isValidMove(t,friends));
        res.add(new Tile(x,y));
        }
      }
    }
    return res;
  }

  private List<Tile> isKingNeighbour(
      Tile t,
      Piece[][] foes,
      Piece[][] friends) {
    boolean res = false;
    for (Tile neighbour : getNeighbours(t, friends)) {
      if (foes[neighbour.getX(), neighbour.getY()] == Piece.KING) {
        res = true;
        continue;
      } 
    }
    return res;
  }

}

