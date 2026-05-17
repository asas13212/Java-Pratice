package com.test2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main
{

    static void main()
    {

        //<editor-fold desc="初始化界面">
        JFrame jFrame = new JFrame();
            JPanel jPanel1 = new JPanel();
            JPanel jPanel2 = new JPanel();

            jFrame.setLayout(new BorderLayout());
            jFrame.add(jPanel1,BorderLayout.EAST);
            jFrame.add(jPanel2,BorderLayout.WEST);
            jFrame.setSize(300,300);
            jFrame.setVisible(true);

            jPanel1.setLayout(new BorderLayout());
            jPanel2.setLayout(new BorderLayout());

            JButton jButton = new JButton("1");
            JButton jButton2 = new JButton("2");
            jButton.setActionCommand("开始");  // 用于判断到底哪个按钮被点击了
            jButton2.setActionCommand("结束");  // 用于判断到底哪个按钮被点击了

            jPanel2.add(jButton,BorderLayout.WEST);
            jPanel1.add(jButton2,BorderLayout.EAST);
        //</editor-fold>

//        MyActionListener myActionListener = new MyActionLis//tener();
        MyMonitor myMonitor = new MyMonitor();
        jButton.addActionListener(myMonitor);
        jButton2.addActionListener(myMonitor);

    }

    private static void windowClose(JFrame jFrame)
    {
        jFrame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}

/**
 * 功能描述：事件监听
 * @author cyt
 * @date 2026/5/12 12:43
 */
class MyActionListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("你好");
    }
}

class  MyMonitor implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // getter and setter
        System.out.println("点击了" + e.getActionCommand());
    }
}