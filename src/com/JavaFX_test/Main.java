package com.JavaFX_test;


import javax.swing.*;
import java.awt.*;

public class Main
{

    static void main()
    {
//        System.out.println("hello world");
        // 多选框
        JRadioButton jRadioButton = new JRadioButton("男",true);
        JRadioButton jRadioButton2 = new JRadioButton("女");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton);

        JCheckBox jCheckBox = new JCheckBox("男",true);
        JCheckBox jCheckBox2 = new JCheckBox("女",false);
        JComboBox<String> jComboBox = new JComboBox<>();

        jComboBox.addItem("请选择学历");
        jComboBox.addItem("高中");
        jComboBox.addItem("小学");
        jComboBox.addItem("大学");


        JFrame j = new JFrame();
        j.setLayout(new FlowLayout());
        j.setVisible(true);
        //j.setLocationRelativeTo(null);
        j.setBounds(400,300,300,300);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JDialog jd = new JDialog(j,"Dialog");
        jd.setBounds(400,300,200,200);
        jd.setVisible(true);
        jd.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton jb = new JButton("按钮");
        jb.setEnabled(false);

        JLabel jLabel = new JLabel("账号",SwingConstants.CENTER);

        JPanel jp = new JPanel();
        j.add(jp);
        jp.add(jb);
        jp.add(jLabel);
        jp.add(jRadioButton);
        jp.add(jRadioButton2);
        jp.add(jCheckBox2);
        jp.add(jCheckBox);
        jp.add(jComboBox);

    }
}
