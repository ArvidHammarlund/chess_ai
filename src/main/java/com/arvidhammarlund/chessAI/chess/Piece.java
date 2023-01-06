package com.arvidhammarlund.chessAi.chess

import java.util.List;
import java.util.ArrayList;

enum Piece {

  PAWN () {

    @Override
    private Point[] getMoves() {
      return = { 
        {Move.FORWARDS},
        {Move.DIAGONAL_FORWARDS_RIGHT},
        {Move.DIAGONAL_FORWARDS_LEFT};
      }
    }

  },
  BISHOP {
  
    @Override
    private Point[] availableActions(
      Point p, Boolean[][] friends, Boolean[][] foes
    ) {
      List<Point> res = new ArrayList<>();
      int inferedSize = friends.length;
      int[][] directions = {
        {1,1}, {-1,-1}, {-1,1}, {1,-1};
      }
      for (int i = 0; i < inferedSize; i++) {
        for (int[] direction : directions) {
          int newX = p.getX() + direction[0] * i;
          int newY = p.getY() + direction[1] * i;
          if (
                (newX < 0 || newX > inferedSize) || 
                (newY < 0 || newY > inferedSize) || 
                (friends[newX][newY])
          ) { 
            directions.remove(dirction); 
          } elif (foes[newX][newY]) {
            res.add(new Point(newX, newY));
            directions.remove(direction);
          } else {
            res.add(new Point(newX, newY))
          }
        }
      }
      return res.toArray();
    }

  },
  KNIGHT {

    @Override
    private static final Move[] getMoves() {
      return = { 
        {Move.PERPENDICULAR_FORWARDS_LEFT},
        {Move.PERPENDICULAR_FORWARDS_RIGHT},
        {Move.PERPENDICULAR_BACKWARDS_LEFT},
        {Move.PERPENDICULAR_BACKWARDS_RIGHT};
      }
    }

  },
  ROCK {
    
    @Override
    private Point[] availableActions(
      Point p, Boolean[][] friends, Boolean[][] foes
    ) {
      List<Point> res = new ArrayList<>();
      int inferedSize = friends.length;
      int[][] directions = {
        {0,-1}, {0,1}, {1,0}, {-1,0};
      }
      for (int i = 0; i < inferedSize; i++) {
        for (int[] direction : directions) {
          int newX = p.getX() + direction[0] * i;
          int newY = p.getY() + direction[1] * i;
          if (
                (newX < 0 || newX > inferedSize) || 
                (newY < 0 || newY > inferedSize) || 
                (friends[newX][newY])
          ) { 
            directions.remove(dirction); 
          } elif (foes[newX][newY]) {
            res.add(new Point(newX, newY));
            directions.remove(direction);
          } else {
            res.add(new Point(newX, newY))
          }
        }
      }
      return res.toArray();
    }

 
  },
  KING {
  
    @Override
    private Point[] availableActions(
      Point p, Boolean[][] friends, Boolean[][] foes
    ) {
      List<Point> res = new ArrayList<>();
      for (int i = -1; i < 2; i++) {
        for (int j = -1; j < 2; i++) {
          newX = p.getX() + i;
          newY = p.getY() + j;
          if (i == 1 && j == 1) continue;
          if (
                (newX < 0 || newX > inferedSize) || 
                (newY < 0 || newY > inferedSize) || 
                (friends[newX][newY])
          ) { 
            directions.remove(dirction); 
          } elif (foes[newX][newY]) {
            res.add(new Point(newX, newY));
            directions.remove(direction);
          } else {
            res.add(new Point(newX, newY))
          }
        } 
      }
      return res.toArray();
    }

  },
  QUEEN {
  
    @Override
    private Point[] availableActions(
      Point p, Boolean[][] friends, Boolean[][] foes
    ) {
      List<Point> res = new ArrayList<>();
      int inferedSize = friends.length;
      int[][] directions = {
        {0,-1}, {0,1}, {1,0}, {-1,0}, {1,1}, {-1,-1}, {-1,1}, {1,-1};
      }
      for (int i = 0; i < inferedSize; i++) {
        for (int[] direction : directions) {
          int newX = p.getX() + direction[0] * i;
          int newY = p.getY() + direction[1] * i;
          if (
                (newX < 0 || newX > inferedSize) || 
                (newY < 0 || newY > inferedSize) || 
                (friends[newX][newY])
          ) { 
            directions.remove(dirction); 
          } elif (foes[newX][newY]) {
            res.add(new Point(newX, newY));
            directions.remove(direction);
          } else {
            res.add(new Point(newX, newY))
          }
        }
      }
      return res.toArray();
    }
  };

  private Point[] getMoves(Point p, Boolean[][] friends, Boolean[][] foes);

}


