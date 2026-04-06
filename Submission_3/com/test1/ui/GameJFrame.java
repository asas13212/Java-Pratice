package com.test1.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends BaseJFrame implements KeyListener
{
    private int[][] data = new int[4][4];
    private int xZero;
    private int yZero;

    public GameJFrame()
    {
        super();
        initJFrame();

        initDate();

        initJMenu();  // initial the menu

        initImage();
        this.addKeyListener(this); // add an event to GameWindow
        this.setVisible(true);
    }

    private void initDate()
    {
        // 创建临时数组，用来存储索引的值
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r = new Random();

        for (int i = 0; i < tempArr.length; i++)
        {
            // 创建了一个随机的变量，用来随机打乱索引值
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // 创建了一个二维数组
        for (int i = 0; i < tempArr.length; i++)
        {
            if(tempArr[i] == 0)
            {
                yZero = i%4;
                xZero = i/4;
            }
            else {
                data[i/4][i%4] = tempArr[i];
            }
        }

    }

    private void initJFrame()
    {
        this.setSize(603,680);
        this.setTitle("拼图游戏");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

    private void initImage()
    {
        this.getContentPane().removeAll();
        // 加载背景图片
        JLabel backGround = new JLabel(new ImageIcon("Week5\\cyt\\image\\background.png"));


        // 用二维数组写
        for (int j = 0; j < 4; j++)
        {
            for (int i = 0; i < 4; i++)
            {
                int num = data[i][j];
                // 这里直接是添加图片到屏幕上了，没有创建数组
                JLabel jLabel = new JLabel(new ImageIcon("Week5\\cyt\\image\\animal" +
                        "\\animal3\\" + num + ".jpg"));
                jLabel.setBounds(i * 105 + 83,j * 105 + 134,105,105);
                jLabel.setBorder(new BevelBorder(1));
                this.getContentPane().add(jLabel);
            }
        }

        // 添加背景图
        backGround.setBounds(40,40,508,560);
        this.getContentPane().add(backGround);

        this.getContentPane().repaint();
    }



    private void initJMenu()
    {
        //<editor-fold desc="make the menu">
        JMenuBar jMenuBar = new JMenuBar();

        JMenu fuctionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        // group 1
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        // group 2
        JMenuItem weChantItem = new JMenuItem("作者微信");

        //region This is a data structure with nested groups
        fuctionJMenu.add(replayItem);
        fuctionJMenu.add(reLoginItem);
        fuctionJMenu.add(closeItem);

        aboutJMenu.add(weChantItem);

        jMenuBar.add(fuctionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
        //endregion
        //</editor-fold>
    }


    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {

    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        int playerInput = e.getKeyCode();
        System.out.println(playerInput);

        switch (playerInput)
        {
            case 37: // Left
                if (yZero > 0)
                {
                    data[xZero][yZero] = data[xZero][yZero - 1];
                    data[xZero][yZero - 1] = 0;
                    yZero--;
                }
                break;
            case 38: // Up
                if (xZero > 0)
                {
                    data[xZero][yZero] = data[xZero - 1][yZero];
                    data[xZero - 1][yZero] = 0;
                    xZero--;
                }
                break;
            case 39: // Right
                if (yZero < 3)
                {
                    data[xZero][yZero] = data[xZero][yZero + 1];
                    data[xZero][yZero + 1] = 0;
                    yZero++;
                }
                break;
            case 40: // Down
                if (xZero < 3)
                {
                    data[xZero][yZero] = data[xZero + 1][yZero];
                    data[xZero + 1][yZero] = 0;
                    xZero++;
                }
                break;
            default:
                break;
        }

        initImage();
    }
}
