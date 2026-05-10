package com.test2;

public class Main
{

    static void main()
    {
        P p1 = new P();
        P p2 = new P();
        Thread thread = new Thread(p1);
        Thread thread1 = new Thread(p2);

        thread1.setName("人一");
        thread.setName("人二");

        thread1.start();
        thread.start();

    }
}

class P implements Runnable
{
    private static int money = 1000;
    @Override
    public void run()
    {
        while(money > 0){
            moneyDecrease();
        }
        System.out.println("抢完了");
    }

    private synchronized static void moneyDecrease()
    {
        System.out.println(Thread.currentThread().getName() + "在取钱 " +
                "还剩" + money + "元");
        money--;
    }
}
