package com.test5;

public class MainTest
{
    static void main(){
        Outer.Inner i = new Outer().new Inner();
        i.SayTemp();

        Outer o = new Outer();
        o.Say();

    }
}
