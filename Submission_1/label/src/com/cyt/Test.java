package com.cyt;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test
{

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            JWindow window = new JWindow();
            window.setAlwaysOnTop(true);
            window.setBackground(new Color(0, 0, 0, 0));

            Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
            window.setSize(screen);
            window.setLocation(0, 0);

            DropPanel panel = new DropPanel(screen.width, screen.height);
            window.setContentPane(panel);

            window.setVisible(true);
            panel.start();
        });
    }

    static class DropPanel extends JPanel
    {

        private final int w;
        private final int h;
        private final Random random = new Random();
        private final List<Drop> drops = new ArrayList<>();
        private Image dropImage; // 改为非final，允许兜底赋值

        DropPanel(int w, int h)
        {
            this.w = w;
            this.h = h;
            setOpaque(false);
            this.dropImage = loadDropImage(); // 调用修复后的加载方法
        }

        // 修复：优化图片读取逻辑 + 兜底图片
        private Image loadDropImage()
        {
            // 方式1：优先读取类路径下的图片（IDEA编译后自动加载）
            URL resourceUrl = getClass().getResource("/com/cyt/assets/drop.png");
            if (resourceUrl != null)
            {
                System.out.println("找到图片：" + resourceUrl);
                return new ImageIcon(resourceUrl).getImage();
            }

            // 方式2：尝试项目源码目录的绝对路径（开发阶段备用）
            String projectRoot = System.getProperty("user.dir"); // 获取项目根目录
            String[] relativePaths = {
                    "src/com/cyt/assets/drop.png",
                    "out/production/label/com/cyt/assets/drop.png" // 适配你的编译输出目录
            };
            for (String path : relativePaths)
            {
                File imgFile = new File(projectRoot, path);
                if (imgFile.exists() && imgFile.isFile())
                {
                    System.out.println("从本地路径找到图片：" + imgFile.getAbsolutePath());
                    return new ImageIcon(imgFile.getAbsolutePath()).getImage();
                }
            }

            // 方式3：兜底方案——创建默认红色小圆图片（避免程序崩溃）
            System.err.println("未找到drop.png，使用默认图片兜底");
            BufferedImage defaultImg = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = defaultImg.createGraphics();
            g2.setColor(new Color(255, 0, 0, 180)); // 半透明红色
            g2.fillOval(0, 0, 32, 32); // 画圆形模拟雨滴
            g2.dispose();
            return defaultImg;
        }

        void start()
        {
            for (int i = 0; i < 120; i++)
            {
                drops.add(new Drop(random.nextInt(w), random.nextInt(h)));
            }

            Timer timer = new Timer(16, e -> {
                for (Drop d : drops)
                {
                    d.y += d.speed;
                    d.x += d.drift;

                    if (d.y > h + 40)
                    {
                        d.reset(random.nextInt(w), -20 - random.nextInt(200));
                    }
                    if (d.x < -40) d.x = w + 40;
                    if (d.x > w + 40) d.x = -40;
                }
                repaint();
            });
            timer.start();
        }

        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

            for (Drop d : drops)
            {
                Composite old = g2.getComposite();
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, d.alpha / 255f));
                int size = (int) d.size;
                // 增加非空判断，避免空指针
                if (dropImage != null)
                {
                    g2.drawImage(dropImage, (int) d.x, (int) d.y, size, size, null);
                }
                g2.setComposite(old);
            }

            g2.dispose();
        }

        static class Drop
        {

            double x, y;
            double speed, drift, size;
            int alpha;
            private final Random r = new Random();

            Drop(double x, double y)
            {
                reset(x, y);
            }

            void reset(double x, double y)
            {
                this.x = x;
                this.y = y;
                this.speed = 1.0 + r.nextDouble() * 3.2;
                this.drift = -0.6 + r.nextDouble() * 1.2;
                this.size = 18 + r.nextDouble() * 26;
                this.alpha = 150 + r.nextInt(106);
            }
        }
    }

    // 新增：BufferedImage导入（兜底图片需要）
    private static class BufferedImage extends java.awt.image.BufferedImage
    {

        public BufferedImage(int width, int height, int imageType)
        {
            super(width, height, imageType);
        }
    }
}