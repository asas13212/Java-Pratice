package com.test1;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main
{

    static void main()
    {
        JFrame frame = new JFrame();

        JButton jButton = new JButton("west");
        JButton jButton1 = new JButton("east");

        JPanel panel = new JPanel();
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        frame.add(panel);
        panel.add(jButton,BorderLayout.WEST);
        panel.add(jButton1,BorderLayout.EAST);

        frame.setSize(200,200);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
