package test;

import javax.swing.*;
import javax.swing.plaf.synth.Region;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Test2 implements MouseListener,KeyListener

{


//    JButton jtb = new JButton();

    public Test2(){

//        jtb.setText("鼠标监听实验");
        JFrame jFrame = new JFrame();
        jFrame.setSize(603,600);
        jFrame.setTitle("事件的演示");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        jtb.setBounds(0,0,120,50);
//        jtb.addMouseListener(this);

//        jFrame.add(jtb);
        jFrame.addKeyListener(this);

    }


    //<editor-fold desc="鼠标的事件">
    @Override
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("鼠标点击了");
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        System.out.println("鼠标按下了");
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("鼠标松开了");
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("鼠标进入了");
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        System.out.println("鼠标退出了");
    }
    //</editor-fold>

    @Override
    public void keyTyped(KeyEvent e)
    {

            System.out.println("现在按下的是" + e.getKeyChar());

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        System.out.println("界面的键盘按下");
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        System.out.println("界面的键盘松开");
    }
}
