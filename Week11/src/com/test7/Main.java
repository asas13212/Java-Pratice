package com.test7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main
{

    static void main()
    {
        new MyFrame();
    }
}

class MyFrame extends JFrame
{

    public MyFrame() throws HeadlessException
    {
        setSize(200,200);
        setVisible(true);
        addWindowListener(new MyWindows());
        this.addKeyListener(new Key());
    }

    class MyWindows extends WindowAdapter
    {

        @Override
        public void windowClosing(WindowEvent e)
        {
            super.windowClosing(e);
            System.out.println("隐藏窗口");
//            System.exit(0);
        }

        protected MyWindows()
        {
            super();
        }

        @Override
        public void windowOpened(WindowEvent e)
        {
            super.windowOpened(e);
        }

        @Override
        public void windowClosed(WindowEvent e)
        {
            super.windowClosed(e);
        }

        @Override
        public void windowIconified(WindowEvent e)
        {
            super.windowIconified(e);
        }

        @Override
        public void windowDeiconified(WindowEvent e)
        {
            super.windowDeiconified(e);
        }

        /**
         * 功能描述：这里的激活是指失去焦点后返回
         * @author cyt
         * @date 2026/5/12 18:30
         */
        @Override
        public void windowActivated(WindowEvent e)
        {
            super.windowActivated(e);
        }

        @Override
        public void windowDeactivated(WindowEvent e)
        {
            super.windowDeactivated(e);
        }

        @Override
        public void windowStateChanged(WindowEvent e)
        {
            super.windowStateChanged(e);
        }

        @Override
        public void windowGainedFocus(WindowEvent e)
        {
            super.windowGainedFocus(e);
        }

        @Override
        public void windowLostFocus(WindowEvent e)
        {
            super.windowLostFocus(e);
        }
    }
}

class Key implements KeyListener
{

    @Override
    public void keyTyped(KeyEvent e)
    {
//        System.out.println((char)e.getSource() + "键被返回");
        char  key = e.getKeyChar();
        System.out.println(key + "键被按下");
    }

    @Override
    public void keyPressed(KeyEvent e)
    {

    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }
}
