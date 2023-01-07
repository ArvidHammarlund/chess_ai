package com.arvidhammarlund.chessAi.chess;

import java.util.List;
import java.util.ArrayList;
import java.awt.Point;

enum Piece {

  PAWN {

    @Override
    Point[] availableMoves(
        Point p, 
        Piece[][] friends,
        Piece[][] foes,
        Boolean isWhite
    ) {

      List<Point> res = new ArrayList<>();
      int x = p.getX();
      int y = p.getY();
      // Forward move 
      if (
          (friends[x][y + 1] == null) && 
          (foes[x][y + 1] == null) && 
          validMove()
      ) {
        res.add(new Point(p).translate(0,1));
      }
      // Diagonal attacks
      int[][] directions = new int[][] {
        {1,1}, {-1,1} 
      };
      for (int[] direction : directions) {
        x += direction[0]; 
        y += direction[1];
        if (foes[x][y] != null) res.add(new Point(x,y));
      }
      return res.toArray();
    }

  },  

  KING {

    private List<Point> getNeighbours(Point p) {
      List<Point> res = new ArrayList<>(9);
      for (int x = p.getX()-1; x < p.getX()+2; x++) {
        for (int y = p.getY()-1; y < p.getY()+2; y++) {
          Point newPoint = new Point (x,y);
          if (!newPoint.equals(p)) res.add(newPoint);
        }
      }
      return res;
    }

    @Override 
    private boolean validMove(
        Point p,
        Piece[][] friends,
        Piece[][] foes
    ) {
      boolean res = Piece.validMove();
      Point PointOfEnemyKing;
        for (int i = 0; i < foes.length; i++) {
          for (int j = 0; j < foes[i].length; i++) {
            if (foes[i][j] == Piece.KING) PointOfEnemyKing = new Point(i,j);
          } 
        }
      if (! PointOfEnemyKing == null) {
        res &= ! getNeighbours().contains(PointOfEnemyKing);
      } 
      return res;
      
    }
  
    @Override
    Point[] availableMoves(
        Point p, 
        Piece[][] friends,
        Piece[][] foes,
        Boolean isWhite
    ) {
      List<Point> res = new ArrayList<>();
      for (Point neighbour : getNeighbours()) {
        if (validMove(neighbour, friends, foes)) res.add(neighbour);
      }
      return res.toArray();
    }
  },

  BISHOP {
  
    @Override
    Point[] availableMoves(
        Point p, 
        Piece[][] friends,
        Piece[][] foes,
        Boolean isWhite
    ) {
      List<Point> res = new ArrayList<>();
      List<int[]> directions = Arrays.asList(new int[][] {
        new int[]{-1,-1},  // Downleft 
        new int[]{-1,1},   // Dowright
        new int[]{1,-1},   // Upleft
        new int[]{1,1}    // Upright
      });
      int i = 1;
      do {
        Iterator iter = directions.iterator();
        while (iter.hasNext()) {
          int[] direction = iter.next();
          int x = p.getX() * direction[0]; 
          int y = p.getY() * direction[1];
          Point newPoint = new Point(x,y);
          if (validMove(newPoint)) {
            res.add(newPoint);
          } else {
            directions.remove(direction);
          }
        }
        i++;
      } while (! directions.isEmpty());
      return res.toArray();
    } 

  },

  KNIGHT {

    @Override
    Point[] availableMoves(
        Point p, 
        Piece[][] friends,
        Piece[][] foes,
        Boolean isWhite
    ) {
      List<Point> res = new ArrayList<>();
      List<int[]> positions = Arrays.asList(new int[][] {
        {-1,2},  // 2up - 1left 
        {1,2},   // 2up - 1right
        {-2,1},   // 2left - 1up
        {-2,-1},    // 2left - 1down
        {-1,-2},  // 2down - 1left 
        {1,-2},   // 2down - 1right
        {2,1},   // 2right - 1up
        {2,-1},   // 2right - 1down
      });
      for (int[] position : position) {
        Point newPoint = new Point(p).translate(position[0], position[1]);
        if (validMove(newPoint)) res.add(newPoint);
      }
     
      return res.toArray();
    }

  },

  ROCK {
    
    @Override
    Point[] availableMoves(
        Point p, 
        Piece[][] friends,
        Piece[][] foes,
        Boolean isWhite
    ) {
      List<Point> res = new ArrayList<>();
      List<int[]> directions = Arrays.asList(new int[][] {
        {-1,0},  // left 
        {1,0},   // right
        {0,1},   // up
        {0,-1}    // down
      });
      int i = 1;
      do {
        Iterator iter = directions.iterator();
        while (iter.hasNext()) {
          int[] direction = iter.next();
          int x = p.getX() * direction[0]; 
          int y = p.getY() * direction[1];
          Point newPoint = new Point(x,y);
          if (validMove(newPoint)) {
            res.add(newPoint);
          } else {
            directions.remove(direction);
          }
        }
        i++;
      } while (! directions.isEmpty());
      return res.toArray();
    } 
  },

  QUEEN {
  
    @Override
    Point[] availableMoves(
        Point p, 
        Piece[][] friends,
        Piece[][] foes,
        Boolean isWhite
    ) {
      List<Point> res = new ArrayList<>();
      List<int[]> directions = Arrays.asList(new int[][] {
        {-1,0},   // left 
        {1,0},    // right
        {0,1},    // up
        {0,-1},   // down
        {-1,-1},  // Downleft 
        {-1,1},   // Dowright
        {1,-1},   // Upleft
        {1,1}   // Upright
      });
      int i = 1;
      do {
        Iterator iter = directions.iterator();
        while (iter.hasNext()) {
          int[] direction = iter.next();
          int x = p.getX() * direction[0]; 
          int y = p.getY() * direction[1];
          Point newPoint = new Point(x,y);
          if (validMove(newPoint)) {
            res.add(newPoint);
          } else {
            directions.remove(direction);
          }
        }
        i++; 
      } while (! directions.isEmpty());
      return res.toArray();
    } 

  };

  private boolean validMove(Point p, Piece[][] friends) {
    int inferedSize = friends.length;
    int x = p.getX();
    int y = p.getY();
    return ! (
      (x < 0 || x >= inferedSize) || 
      (y < 0 || x >= inferedSize) || 
      (friends[x][y])
    );
  }

  abstract Point[] availableMoves(
      Point p,
      Piece[][] friends,
      Piece[][] foes,
      boolean isWhite
  );

}


