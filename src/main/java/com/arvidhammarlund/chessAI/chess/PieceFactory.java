package com.arvidhammarlund.chessAi.chess

class PieceFactory {
  
  Queen createQueen() { return new Queen() };
  King createKing() { return new King() };
  Rock createRock() { return new Rock() };
  Bishop createBishop() { return new Bishop() };
  Pawn createPawn() { return new Pawn() };
  Knight createKnight() { return new Knight() };

}
