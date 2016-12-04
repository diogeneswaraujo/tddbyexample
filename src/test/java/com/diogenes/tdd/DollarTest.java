package com.diogenes.tdd;

/**
 * Created by daraujo on 04/12/16.
 */
public class DollarTest {
    @org.junit.Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
