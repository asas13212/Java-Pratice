package day2.test2;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    static void main()
    {
        Print print = new Print();
        new Thread(print).start();

        M m = new M(print);
        new Thread((m)).start();


    }
}

class Print implements Runnable
{
    private boolean loop = true;
    @Override
    public void run()
    {
        int num = 0;
        Random r = new Random();

        while (loop)
        {
            System.out.println("随机数是 " + r.nextInt(0,100));
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

    private void scan()
    {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        if(c.equals("Q"))
            setLoop(false);
    }

    public void setLoop(boolean loop)
    {
        this.loop = loop;
    }
}

class M implements Runnable
{
    private Print print = null;
    @Override
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        if(c.equals("Q"))
            print.setLoop(false);
    }

    public M(Print print)
    {
        this.print = print;
    }
}