package com.diogenes.tdd;

/**
 * Created by daraujo on 04/12/16.
 */
public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        amount *= multiplier;
        return null;
    }
}
