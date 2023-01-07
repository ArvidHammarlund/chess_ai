package com.arvidhammarlund.chessAI.chess;

import java.util.List;

class DirectionalIterator implements TileIterator {
 
  // --- Attriubtes ---

  private final direction[] DIRECTIONS;
  private final MoveValidator validator;

  // --- Constructor ---
 
  DirectionalIterator(MoveValidator validator, Directions[] directions) {
    this.DIRECTIONS = directions;
    this.validator = validator;
  }

  // --- Methods ---

  List<Tile> iterate(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite
  ) {
    List<Tile> res = new ArrayList<>();
    direction[] directions = DIRECTIONS.copy();
    int i = 1;
    do {
      Iterator iter = directions.iterator();
      while (iter.hasNext()) {
        int[] direction = iter.next();
        int x = t.getX() + i * direction.getDx(); 
        int y = t.getY() + i * direction.getDy();
        Tile newTile = new Tile(x,y);
        if (validator.isValid(newTile, friends, foes, isWhite)) {
          res.add(newTile);
        } elif (foes[x][y] != null) {
          res.add(newTile);
          directions.remove(direction);
        } else {
          directions.remove(direction);
        }
      }
      i++;
    } while (! directions.isEmpty());
    return res
  }

  // --- Helpers ---

}


