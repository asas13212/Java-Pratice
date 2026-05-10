package com.test1;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    static void main()
    {
        A a = new A();
        B b = new B();
        b.setA(a);
        Thread thread = new Thread(a);
        Thread thread1 = new Thread(b);

        thread1.start();
        thread.start();

    }
}

class A implements Runnable
{
    protected boolean isTriggered = true;

    @Override
    public void run()
    {
        Random r = new Random();

        while (isTriggered)
        {
            System.out.println(r.nextInt(0,100) + 1);
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

    public void setTriggered(boolean triggered)
    {
        isTriggered = triggered;
    }
}

class B implements Runnable
{
    private A a = null;

    @Override
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        String str = "";
        do
        {
            str = sc.nextLine();
        }while (!str.equals("q"));

        a.setTriggered(false);
    }

    public void setA(A a)
    {
        this.a = a;
    }
}