package com.test4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class Main
{

    static void main()
    {
        new MyFrame().loadImgae();
    }
}

class MyFrame extends JFrame
{
    public void loadImgae()
    {
        setBounds(200,200,600,500);
        this.setVisible(true);


    }


    @Override
    public void paint(Graphics g)
    {
        // 画笔
        g.setColor(Color.ORANGE);
        g.drawLine(100,100,100,100);
        g.fillRect(200,200,300,300);
//        repaint(); repaint会调用paint,死循环了
        g.setColor(Color.BLACK);
        // 画笔用完，重新设置颜色
    }
}

class MyMouseListener implements MouseListener
{

    @Override
    public void mouseClicked(MouseEvent e)
    {

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
}