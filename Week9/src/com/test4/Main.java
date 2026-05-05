package com.test4;

import com.test1.ThreadTest;

public class Main
{

    static void main() throws InterruptedException
    {
        T t = new T();
        t.setName("线程1");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();


        Thread.sleep(3000);
        t.interrupt();
        //  要理解中断的作用
//        t.setLoop(false);           // 通知方式
    }
}

class T extends Thread
{
    boolean loop = true;

    @Override
    public void run()
    {
        while (loop)
        {
            System.out.println(Thread.currentThread().getName() + "正在运行中....");
            try
            {
                System.out.println("睡觉中 。。。。");
                Thread.sleep(10000);

            }
            catch (InterruptedException e)
            {
                System.out.println(Thread.currentThread().getName() + "被中断了");
            }

        }
    }

    public void setLoop(boolean loop)
    {
        this.loop = loop;
    }
}
