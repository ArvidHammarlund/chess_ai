package com.arvidhammarlund.chessAI.piece.chess;

import java.util.List;

interface iPiece {

 List<Tile> getAvailableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite
  ); 

}


