package com.diogenes.tdd;

/**
 * Created by daraujo on 04/12/16.
 */
public class Dollar extends Money {


    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }


}
