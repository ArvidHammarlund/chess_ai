package com.arvidhammarlund.chessAI.view;

import jaxax.swing.*;

class Piece extends JLabel {

  Piece() {
    super();
    this.setLayout(new GridLayout(8,8));
    this.addTiles();
  }

}
