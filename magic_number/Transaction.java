package com.company;

import java.util.Date;

public class Transaction {

    public final Date transactionTime;
    public final int transactionSize;

    public static int amount_count = 0;
    public static int amount_sum = 0;

    public static double averageTransaction() {
        return (double)amount_sum/ amount_count;
    }

    public Transaction(int transactionSize) {
        transactionTime = new Date();
        this.transactionSize = transactionSize;
        amount_count++;
        amount_sum += transactionSize;
    }

}
