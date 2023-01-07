package com.arvidhammarlund.chessAi;

import com.arvidhammarlund.chessAi.chess.Game;
import java.util.List;
import java.util.ArrayList;

public class Model {

  // --- Attributes ---
  
  private Game game = Game();
  private List<Observer> observers = new ArrayList<>();

  // --- Constructors ---
  

  // --- Methods ---

  private void signal() {
    for (Observer o : observers) o.update();
  }

  // --- Helpers ----
  
  // --- Setters & Getters ---

  public void addObserver(Observer o) {
    observers.add(o);
  }

}
