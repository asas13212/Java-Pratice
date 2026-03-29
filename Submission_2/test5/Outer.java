package com.test5;

import java.sql.SQLOutput;

public class Outer
{

    private int temp = 10;
    private Inner i;

    public class Inner{
        public void SayTemp(){
            System.out.println(temp);
        }
    }


    public void Say(){
//        /i.SayTemp();
        new Inter(){
            @Override
            public void show()
            {
                System.out.println("这是inter匿名内部类");
            }
        }.show();
    }


}
