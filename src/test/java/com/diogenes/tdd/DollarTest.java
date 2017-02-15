package com.diogenes.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by daraujo on 04/12/16.
 */
public class DollarTest {

    @org.junit.Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);

        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @org.junit.Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);

        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
