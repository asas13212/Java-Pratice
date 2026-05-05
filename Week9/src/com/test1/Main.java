package com.test1;

public class Main
{

    static void main() throws InterruptedException
    {
        ThreadTest threadTest = new ThreadTest();
        //threadTest.start();
        /*
         必须要start才可以真正的启动一个线程
         使用.run() 则会串行化，打印的线程名是main
         */


        RunnableTest runnableTest = new RunnableTest();
        Thread thread = new Thread(runnableTest);
        //  设计模式 ----- 静态代理
        thread.start();

        /*
        while (true)
        {
            // 会交替打印
            Thread.sleep(1000);
            System.out.println("之后的线程是" +ThreadTest.currentThread().getName());
        }
        */
    }


}
