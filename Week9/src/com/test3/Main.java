package com.test3;

public class Main
{

    static void main()
    {
//        sellTicket t1 = new sellTicket();
//        sellTicket t2 = new sellTicket();
//        sellTicket t3 = new sellTicket();
//
//
//        t1.start();
//        t2.start();
//        t3.start();
        sellTicket2 sellTicket1 = new sellTicket2();

        new Thread(sellTicket1).start();
        new Thread(sellTicket1).start();
        new Thread(sellTicket1).start();
    }
}

class sellTicket extends Thread
{
    private static int ticket = 1000;

    @Override
    public void run()
    {
        while (true)
        {

            if (m()) break;

        }
    }

    private synchronized boolean m()
    {
        if (ticket <= 0)
        {
            System.out.println("票卖完了");
            return true;
        }

        //<editor-fold desc="Try-catch">
        try
        {
            Thread.sleep(50);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        //</editor-fold>

        System.out.println("窗口是" + Thread.currentThread().getName()
         +" 还剩下" + ticket + "张票");
        ticket--;
        // 多个线程，需要提前终止线程
        return false;
    }
}

class sellTicket2 implements Runnable
{
    private int ticket = 1000;
    Object object = new Object();

    @Override
    public void run()
    {
        while (true)
        {

            if (sell()) break;

        }
    }

    private boolean sell()
    {
        synchronized (this){
        if (ticket <= 0)
        {
            System.out.println("票卖完了");
            return true;
        }

        //<editor-fold desc="Try-catch">
        try
        {
            Thread.sleep(50);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        //</editor-fold>

        System.out.println("窗口是" + Thread.currentThread().getName()
                + " 还剩下" + ticket + "张票");
        ticket--;
        return false;
    }
    }
}