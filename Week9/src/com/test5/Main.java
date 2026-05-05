package com.test5;

public class Main
{

    static void main()
    {
        D d = new D();
        d.setDaemon(true);

        T1 t1 = new T1();
        T2 t2 = new T2();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.setT2(t2);

        t1.start();
        t2.start();
        System.out.println(t1.getState());
        d.start();
    }

}

class T1 extends Thread
{
    Thread t2 = null;

    @Override
    public void run()
    {
        for (int i = 0; i < 20; i++)
        {
            System.out.println(Thread.currentThread().getName()
            + "吃了" + i + "个包子");

            if ( i == 5 )
            {
                try
                {
                    t2.join();
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void setT2(Thread t2)
    {
        this.t2 = t2;
    }
}

class T2 extends Thread
{

    @Override
    public void run()
    {
        for (int i = 0; i < 20; i++)
        {
            System.out.println(Thread.currentThread().getName()
                    + "吃了" + i + "个包子");
        }
    }
}

class D extends Thread
{

    @Override
    public void run()
    {
        while  (true)
        {
//            System.out.println("hhhh");
        }
    }
}