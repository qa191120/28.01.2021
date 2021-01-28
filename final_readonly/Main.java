package com.company;

public class Main
{
    public static void main(String[] args)  {

        System.out.println(String.format("How many person created? %d", Person.next_id - 1));
        Person p1 = new Person("moshe", "Netanya");
        Person p2 = new Person("danny", "tel-aviv");
        // p1.id = 0; // Error!
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(String.format("How many person created? %d", Person.next_id - 1));
    }
}
