package com.arvidhammarlund.chessAI.view;

import jaxax.swing.*;
import java.awt.Color;
import javax.swing.JPanel;

class TilePanel extends JPanel {

  TilePanel() {
    super();
    this.setBackground(Color.GREEN);
    this.setLayout(new GridLayout(8,8));
  }

}