package com.arvidhammarlund.chessAi.chess;

import java.awt.Point;

public class Game {

  private boolean currentPlayerIsWhite = true;
  private Board board = new Board();

  public Point[] remainingPiecesCurrentPlayer() {
    return board.remainingPieces(currentPlayerIsWhite);
  }

  public Point[] allowedMovesCurrentPlayer(Point p)
      throws assertionException {
    assert remainingPiecesCurrentPlayer(currentPlayerIsWhite).contains(p);
    return board.allowedMoves(p, currentPlayerIsWhite);
  }

  public void movePieceCurrentPlayer(Point current, Point destination)
      throws assertionException {
    board.movePiece(current, destination, currentPlayerIsWhite);
    changePlayer();
  }

  // --- Helpers ---

  private void changePlayer() { currentPlayerIsWhite = !currentPlayerIsWhite; }

  private void isChess() {

  }

  // --- Setter & Getters ---

  public Piece[][] getWhite() {
    return board.getTeam(true);
  }

  public Piece[][] getBlack() {
    return board.getTeam(false);
  }

  public boolean getCurrentPlayerIsWhite() {
    return currentPlayerIsWhite;
  } 

}


