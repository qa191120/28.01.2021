package com.company;

import java.util.Date;

public class Main
{
    public static void main(String[] args)  {

        Transaction t1 = new Transaction(1000);
        Transaction t2 = new Transaction(2000);

        //t1.transactionTime = new Date(); // ERROR
        // t1.transactionSize *= 100; // ERROR
        System.out.println(String.format("average of trans = %f", Transaction.averageTransaction()));

    }
}
