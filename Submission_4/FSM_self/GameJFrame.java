package FSM_self;

import javax.swing.*;

public class GameJFrame
{
    public GameJFrame()
    {
        Player player = new Player();
        player.start();

        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null); // 关键：关闭默认布局

        JButton jbt_toMove = new JButton("转换到移动状态");
        jbt_toMove.addActionListener(e -> {
            Object input = e.getSource();
            if(input == jbt_toMove){
               player.switchToMove();
                System.out.println("已经切换到移动");
            }
        }
        );

        jbt_toMove.setBounds(0, 0, 150, 80); // 比 setSize + setLocation 更直接
        jFrame.add(jbt_toMove);

        jFrame.setVisible(true); // 建议最后再显示
    }
}
