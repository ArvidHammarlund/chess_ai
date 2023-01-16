package com.arvidhammarlund.chessAI.chess.pieces;

import java.util.List;

interface iPiece {

 List<Tile> getAvailableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite
  ); 

}


