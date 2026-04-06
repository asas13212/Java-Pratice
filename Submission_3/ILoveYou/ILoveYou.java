package ILoveYou;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ILoveYou implements ActionListener
{
    private JButton jtb = new JButton("请点击我");
    private static int clickNumber = 0;

    public ILoveYou(){

        JFrame jFrame = new JFrame();
        jFrame.setSize(600,600);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("我是侯哥小迷妹");
        jFrame.setAlwaysOnTop(true);
        jFrame.setVisible(true);

        jtb.addActionListener(this);
        jtb.setBounds(0,0,120,50);

        jFrame.add(jtb);

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object j = e.getSource();

        if( j.equals(jtb)){
            Random r = new Random();
            jtb.setBounds(r.nextInt(480),r.nextInt(550),120,50);
            clickIncrease();
            if (clickNumber == 1) {
                jtb.setText("请再次点击我");
            }
            System.out.println("您一共点击了" + clickNumber + "次");
        }
    }

    private static void clickIncrease()
    {
        clickNumber++;
    }

}
