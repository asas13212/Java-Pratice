package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class test implements ActionListener
{
    private static int count = 0;
    public JButton jtb = new JButton("请点击我");
    public JButton jtb2 = new JButton("再次点击");

    public test(){

        JFrame jFrame = new JFrame();
        jFrame.setSize(603,600);
        jFrame.setTitle("事件的演示");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        jtb.addActionListener(this);
        jtb2.addActionListener(this);

        jtb.setBounds(0,0,100,50);
        jtb2.setBounds(100,0,100,50);
//        jtb.addActionListener(event -> System.out.println("按钮被点击了")); // 参数是事件执行的代码

        jFrame.add(jtb);
        jFrame.add(jtb2);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object j = e.getSource();

        if( j == jtb){
//            jtb.setBounds(0,0,200,200);
            System.out.println("按钮1被点击了");
        }

        else if(j == jtb2){
              Random r = new Random();
              jtb2.setLocation(r.nextInt(500),r.nextInt(500));
              clickAdd();
              System.out.println("你一共点击了" + count + "次");
        }
    }

    private void clickAdd(){
        count++;
    }
}
