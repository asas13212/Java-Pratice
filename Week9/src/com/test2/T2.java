package com.test2;

public class T2 implements Runnable
{

    @Override
    public void run()
    {
        int num = 0;

        while(num != 50){

            System.out.println("hehe" + num++);
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
