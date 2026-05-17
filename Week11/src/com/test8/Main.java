package com.test8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;

public class Main
{

    static void main()
    {
//        new MyFrame().init();
        new My().init();
    }
}

class MyFrame extends JFrame
{

    public MyFrame() throws HeadlessException
    {
    }

    public void init()
    {
        JFrame frame = new JFrame("第一");
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JLabel jLabel = new JLabel("文字");
        frame.add(jLabel);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = this.getContentPane();
    }
}

class My extends JFrame
{
    public void init(){
        this.setVisible(true);
        this.setSize(200,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());


        JButton jButton = new JButton("点击弹处对话框");
        jButton.setBounds(30,30,200,50);
        this.add(jButton);


        jButton.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                new MyDia();
            }

            @Override
            public void mousePressed(MouseEvent e)
            {

            }

            @Override
            public void mouseReleased(MouseEvent e)
            {

            }

            @Override
            public void mouseEntered(MouseEvent e)
            {

            }

            @Override
            public void mouseExited(MouseEvent e)
            {

            }

        });
    }
}

class MyDia extends JDialog
{
    public MyDia(){
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}

