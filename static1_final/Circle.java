package com.company;

import lombok.ToString;

@ToString
public class Circle {
    public double radius; // per instance
    //public static final double PIE = 3.14; // only one! and Const
    public static double PIE = 3.14; // only one!
    //public final double PIE = 3.14; // many! and Const

    public Circle(double _radius)
    {
        radius = _radius;
    }

    public double getArea() {
        return radius * PIE;
    }

    public static void printNicePie() {
        System.out.println(String.format("**** PIE %f ****", PIE));
    }
}
