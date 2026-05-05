package com.test1;

public class RunnableTest implements Runnable
{

    @Override
    public void run()
    {
        int num = 0;
        System.out.println("我进入了线程" + Thread.currentThread().getName());

        while( num != 10 ){

            System.out.println("打印测试");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}

