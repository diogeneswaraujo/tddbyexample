package com.diogenes.tdd;

/**
 * Created by daraujo on 04/12/16.
 */
public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
