package com.company;

public class Main
{
    public static void main(String[] args)  {

        System.out.println(String.format("Latest android os %f", SamsungMobile.latest_os));
        SamsungMobile.newOS(); // 4.4 -> 4.5
        SamsungMobile s20 = new SamsungMobile("Black", 4.8f); // os = 4.5
        SamsungMobile.newOS(); // 4.5 -> 4.6
        // s20 OS = 4.5
        System.out.println(String.format("Android os = %f", s20.current_os)); // 4.5
        s20.upgradeToLatestOS();
        System.out.println(String.format("Android os = %f", s20.current_os)); // 4.6
        System.out.println();
        SamsungMobile s21 = new SamsungMobile("Blue", 5.2f); // os = 4.6

    }
}
