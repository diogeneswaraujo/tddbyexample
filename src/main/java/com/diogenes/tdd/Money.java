package com.diogenes.tdd;

/**
 * Created by daraujo on 14/02/17.
 */
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
            && getClass().equals(money.getClass());
    }
}
