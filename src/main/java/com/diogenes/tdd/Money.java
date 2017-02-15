package com.diogenes.tdd;

/**
 * Created by daraujo on 14/02/17.
 */
public abstract class Money {
    protected int amount;

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
            && getClass().equals(money.getClass());
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);
}
