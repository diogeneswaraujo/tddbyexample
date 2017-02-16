package com.diogenes.tdd;

/**
 * Created by daraujo on 04/12/16.
 */
public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
}
