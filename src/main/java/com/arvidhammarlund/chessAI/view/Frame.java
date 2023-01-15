package com.arvidhammarlund.chessAI.view;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Frame extends JFrame {

  Frame() {
    super("Chess game with ai");
    this.setSize(800, 800);
    this.setLayout(new BorderLayout());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    this.add(new TilePanel(), BorderLayout.CENTER);
    this.setVisability(true);
  }

}
