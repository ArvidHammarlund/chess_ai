package com.arvidhammarlund.chessAI.chess;

import java.util.List;

class MirroredIterator implements TileIterator {

  // --- Attributes ---

  private final int firstDistance 
  private final int secondDistance
  private final MoveValidator validator;

  // --- Constructor ---
  
  MirroredIterator(MoveValidator validator, int fst, int snd) {
    this.firstDistance = fst;
    this.secondDistance = snd;
    this.validator = validator;
  }
 
  // --- Methods ---

  List<Tile> iterate(Tile t) {
    List<Tile> res = new ArrayList<>();
    
    return res
  }

}


