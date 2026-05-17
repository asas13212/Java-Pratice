package com.test6;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // 主窗口
        JFrame frame = new JFrame("CardLayout 演示");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // 1. 中间卡片面板：用 CardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // 做两张卡片页面
        JPanel page1 = new JPanel();
        page1.setBackground(Color.PINK);
        page1.add(new JLabel("我是页面 1"));

        JPanel page2 = new JPanel();
        page2.setBackground(Color.CYAN);
        page2.add(new JLabel("我是页面 2"));

        // 给卡片命名并加入
        cardPanel.add("p1", page1);
        cardPanel.add("p2", page2);

        // 2. 底部按钮面板（普通FlowLayout，按钮一直显示）
        JPanel btnPanel = new JPanel();
        JButton btn1 = new JButton("显示页面1");
        JButton btn2 = new JButton("显示页面2");

        btnPanel.add(btn1);
        btnPanel.add(btn2);

        // 3. 把卡片放中间，按钮放南部
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(btnPanel, BorderLayout.SOUTH);

        // 4. 按钮切换事件
        btn1.addActionListener(e -> {
            cardLayout.show(cardPanel, "p1");
        });
        btn2.addActionListener(e -> {
            cardLayout.show(cardPanel, "p2");
        });

        frame.setVisible(true);
    }
}