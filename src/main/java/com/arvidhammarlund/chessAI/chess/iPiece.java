package com.arvidhammarlund.chessAi.chess

import java.util.List;

public interface iPiece {
  
  static int LONGEST_PERMITED_CONSEQUTIVE_MOVE = 7;

  Tile getTile()

  List<Move[]> getMoves();

}
