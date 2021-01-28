package com.company;

public class Main
{
    public static void main(String[] args)  {

        // static members
        // final
        // readonly

        System.out.println( );

        System.out.println(String.format("PIE = %f", Circle.PIE));
        Circle.printNicePie();

        Circle c1 = new Circle(0);
        c1.printNicePie(); // this acutally calls Circle.printNicePie()

        //Circle c2 = new Circle(3.111);
        //Circle.PIE = 3.5;
        //c2.PIE = 3.5;

        Person danny = new Person(1, "Danny");
        danny.id = 2; // BALAGAN
    }
}
