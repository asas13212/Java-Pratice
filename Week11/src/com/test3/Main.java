package com.test3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{

    static void main()
    {
        new MyFrame();
    }
}

class MyFrame extends JFrame
{
    public MyFrame()
    {
        this.setSize(200,200);
        TextField textField = new TextField();
        this.add(textField);
        MyActionListen myActionListen = new MyActionListen();
        textField.addActionListener(myActionListen);
        textField.setEchoChar('*');
        this.setVisible(true);


    }
}

class MyActionListen implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        TextField field = (TextField) e.getSource();
        System.out.println(field.getText());
        field.setText("");
    }
}