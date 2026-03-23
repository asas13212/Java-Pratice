package com.cyt;

public class Exercise1
{

    public static void main(String[] args)
    {
        double length = 2.3;
        double radius = 2;
        double pi = 3.14;
        double a = 3, b = 4, c = 5;

        System.out.println("边长为2.3的正方形,体积是" + volume(length));
        System.out.println("半径为2的球,体积是" + volume(radius, pi));
        System.out.println("长宽高分别为a,b,c,体积是" + volume(a, b, c));
    }

    public static double volume(double length)
    {
        return Math.pow(length, 3);
    }

    public static double volume(double radius, double pi)
    {
        return (4.0 / 3.0) * pi * Math.pow(radius, 3);
    }

    public static double volume(double a, double b, double c)
    {
        return a * b * c;
    }
}
