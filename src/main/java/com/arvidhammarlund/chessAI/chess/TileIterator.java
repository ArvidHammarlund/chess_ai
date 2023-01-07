package com.arvidhammarlund.chessAI.chess;

import java.util.List;

interface TileIterator {

  List<Tile> availableMoves(
      Tile t,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite
  );

}
