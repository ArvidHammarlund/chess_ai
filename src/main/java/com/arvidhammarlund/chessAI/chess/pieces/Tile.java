package com.arvidhammarlund.chessAI.chess.pieces;

/**
 *  Quick emaluator of awt.Point with int return instead of double
 */
class Tile {

  // --- Attributes ---

  private int x;
  private int y;

  // --- Constructors ---
   
  Tile(int x, int y) {
    this.x = x;
    this.y = y;
  }

  Tile(Tile t) {
    this(t.getX(), t.getY());
  }

  // --- Methods ---
  
  @Override
  public boolean equals(Object o) {
    if (this == o)
        return true;
    if (o == null)
        return false;
    if (getClass() != o.getClass())
        return false;
    Tile tmp = ((Tile) o);
    return (this.x == tmp.getX()) && (this.y == tmp.getY());
  }

  @Override 
  public int hashCode() {
    // Taken from awt.point2D...
    long bits = java.lang.Double.doubleToLongBits(getX());
    bits ^= java.lang.Double.doubleToLongBits(getY()) * 31;
    return (((int) bits) ^ ((int) (bits >> 32)));
  }

  Tile translate(int dx, int dy) {
    x += dx;
    y += dy;
    return this;
  }

  // --- Getters & Setters ---

  int getX() {
    return x;
  }

  int getY() {
    return y;
  }

}
