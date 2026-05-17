package com.test5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main
{

    static void main()
    {
        new MyFrame("title");
    }
}

class MyFrame extends JFrame
{
    private ArrayList point;

    public MyFrame(String titile) throws HeadlessException
    {
        super(titile);
        this.setSize(400,400);
        point = new ArrayList<>();

    }

    @Override
    public void paint(Graphics g)
    {
        Iterator iterator = point.iterator();
        while ( iterator.hasNext())
        {
            Point point = (Point) iterator.next();
            g.setColor(Color.BLUE);
            g.fillOval(point.x,point.y,10,10);
        }
    }

    public void addPaint(Point point)
    {
//        point.add(point);
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
        // 拿到窗口
        MyFrame myFrame = (MyFrame) e.getSource();
        myFrame.addPaint(new Point(e.getX(),e.getY()));
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