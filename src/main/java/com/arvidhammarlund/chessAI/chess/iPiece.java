package com.arvidhammarlund.chessAi.chess

import java.util.List;

public interface iPiece {
  
  LONGEST_PERMITED_CONSEQUTIVE_MOVE = 7;

  List<Move[]> getMoves();

}
