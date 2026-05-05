package com.test2;

public class T1 implements Runnable
{

    @Override
    public void run()
    {
        int num = 0;

        while ( num != 60)
        {

            System.out.println("HelloWorld" +num++);
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
