package day2.test1;

public class Main
{

    private static Object ob1 = new Object();
    private static Object ob2 = new Object();

    /**
     *  作用是展示死锁的使用
     *  the deadlockDemo
     */

    static void main()
    {
        new Thread(()->
        {
            synchronized (ob1){
                System.out.println(Thread.currentThread().getName() +
                        " 进入了,找下一个");
                synchronized (ob2){
                    System.out.println("找到了，结束进程 ");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (ob2)
            {
                System.out.println("找了，需要找下一个");
                synchronized (ob1)
                {
                    System.out.println("找到了，结束进程");
                }
            }

        }).start();
    }
}

