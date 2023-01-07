package com.arvidhammarlund.chessAI.view;

import jaxax.swing.*;

class Tile extends JLabel {

  Tile() {
    super();
    this.setLayout(new GridLayout(8,8));
    this.addTiles();
  }

}
