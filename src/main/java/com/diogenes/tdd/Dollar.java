package com.diogenes.tdd;

/**
 * Created by daraujo on 04/12/16.
 */
public class Dollar extends Money {

    public Dollar(int amount, String currency) {
       super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
