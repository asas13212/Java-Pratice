package com.test1.ui;

import javax.swing.*;

public abstract class BaseJFrame extends JFrame {

    public BaseJFrame() {
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setVisible(true);
    }
}
