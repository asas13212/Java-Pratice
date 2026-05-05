package com.test1;


public class ThreadTest extends Thread
{

    public ThreadTest()
    {

    }

    @Override
    public void run()
    {
        int num = 0;
        while (true)
        {
            num++;
//            System.out.println("猫咪叫");
            System.out.println("进入了" + Thread.currentThread().getName() + "线程");

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            if (num == 20){
                return;
            }
        }
    }
}
