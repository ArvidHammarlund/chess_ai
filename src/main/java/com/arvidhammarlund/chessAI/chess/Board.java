package com.arvidhammarlund.chessAI.chess;

import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.awt.Point;
import java.lang.AssertionError;

class Board {

  // --- Attributes ---
  
  private static final int SIZE = 8;
  private Map<Piece, Point> white = buildWhite();
  private Map<Piece, Point> black = buildBlack();

  // --- Constructors ---

  // --- Methods ---

  void movePiece(Point current, Point destionation, boolean isWhite) 
      throws AssertionError {
    Map<Piece, Point> friends = (isWhite) ? white : black;
    Map<Piece, Point> foes = (isWhite) ? black : white;
    assert friends.contains(current) : "Player has no piece at position";
    assert allowedMoves(current).contains(destionation) : "Invalid destion for piece";
    Piece piece = friends.get(current);
    friends.remove(current);
    if (foes.contains(destiontion)) foes.remove(destionation);
    friends.put(destionation, piece);
  }

  Point[] remainingPieces(boolean isWhite) {
    List<Point> res = new ArrayList<>();
    Piece[] team = (isWhite) ? white.keySet() : black.keySet();
    for (Point p : team) {
      res.add(new Point(p));
    }
    return p;
  }

  public Point[] allowedMoves(Point p, boolean isWhite) {
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
      foes = getTeam(true);
    }
    return actorKind.availableMoves(p, friend, foes, isWhite);
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
    return res;
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
    return res;
  }

  // --- Setters & Getters ---
  
  public Piece[][] getTeam(boolean isWhite) {
    Map<Point, Piece> team = (isWhite) ? this.white : this.black;
    Piece[][] res = new Piece[Board.SIZE][Board.SIZE];
    for (Map.entry<Point, Piece> item : team.entrySet()) {
      res[item.getKey().getX()][item.getKey().getY()] = item.getValue();
    }
    return res;
  }

}
