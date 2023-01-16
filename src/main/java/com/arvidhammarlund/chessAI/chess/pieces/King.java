package com.arvidhammarlund.chessAI.chess.pieces;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class King implements iPiece {
 
  // --- Attributes ---

  private static final CommonValidator validator = new CommonValidator();

  // --- Methods ---

  @Override
  public List<Tile> getAvailableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite) {
    List<Tile> res = getNeighbours(t, friends);
    for (Iterator<Tile> iter = res.iterator(); iter.hasNext();) {
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
        if (!validator.isValidMove(t,friends)) continue;
        res.add(new Tile(x,y));
      }
    }
    return res;
  }

  private boolean isKingNeighbour(
      Tile t,
      Piece[][] foes,
      Piece[][] friends) {
    boolean res = false;
    for (Tile neighbour : getNeighbours(t, friends)) {
      if (foes[neighbour.getX()][neighbour.getY()] == Piece.KING) {
        res = true;
        break;
      } 
    }
    return res;
  }

}

