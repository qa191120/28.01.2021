package com.company;

public class Person {
    //public static final double PIE = 3.14;
    public final int id; // 1 - first place for final
    public String name;
    public String address;

    public static int next_id = 1;

    // 2 - put final here
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = next_id;
        next_id++;
    }
}
