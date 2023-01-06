package com.arvidhammarlund.chessAi.chess

import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import org.apache.commons.collections4.Bidimap;

public class Game {

  // --- Attributes ---
  
  private static final int SIZE = 8;
  private Map<Piece, Point> white;
  private Map<Piece, Point> black;

  // --- Constructors ---
  
  public Board() {
    this.black = buildBlack();
    this.white = buildWhite();
  }

  // --- Methods ---

  movePiece() {

  }

  public Point[] allowedMoves(Point p) {
    Piece actorKind;
    Boolean[][] friends;
    Boolean[][] foes;
    if (white.containsKey(p)) {
      actorKind = white.get(p); 
      friends = getTeam(true);
      foes = getTeam(false);
    } else {
      actorKind = black.get(p);
      friends = getTeam(false);
      foes = getTeam(true)
    }
    return actorKind.getMoves(p, friend, foes);
  } 
  


  // --- Helpers ----
  
  private Map<Point, Piece> buildBlack() {
    Map<Point, Piece> res = new HashMap<>();
    res.put(new Point(0,0), Piece.ROCK);
    res.put(new Point(1,0), Piece.KNIGHT);
    res.put(new Point(2,0), Piece.BISHOP);
    res.put(new Point(3,0), Piece.KING);
    res.put(new Point(4,0), Piece.QUEEN);
    res.put(new Point(5,0), Piece.BISHOP);
    res.put(new Point(6,0), Piece.KNIGHT);
    res.put(new Point(7,0), Piece.ROCK);
    
    for (int i = 0; i < Board.SIZE; i++) {
      res.put(new Point(i,1), Piece.PAWN);
    }
    return res
  }

  private Map<Point, Piece> buildWhite() {
    Map<Point, Piece> res = new HashMap<>();
    res.put(new Point(0,7), Piece.ROCK);
    res.put(new Point(1,7), Piece.KNIGHT);
    res.put(new Point(2,7), Piece.BISHOP);
    res.put(new Point(3,7), Piece.KING);
    res.put(new Point(4,7), Piece.QUEEN);
    res.put(new Point(5,7), Piece.BISHOP);
    res.put(new Point(6,7), Piece.KNIGHT);
    res.put(new Point(7,7), Piece.ROCK);
    
    for (int i = 0; i < Board.SIZE; i++) {
      res.put(new Point(i,6), Piece.PAWN);
    }
    return res
  }

  // --- Setters & Getters ---
  
  public Boolean[][] getTeam(boolean isWhite) {
    Point[] team = (isWhite) ? this.white.keySet() : this.black.keySet();
    res = new Boolean[Game.SIZE][Game.SIZE]():
    for (Point p : team) {
      res[p.getX()][p.getY()] = true;
    }
    return res
  }

}
