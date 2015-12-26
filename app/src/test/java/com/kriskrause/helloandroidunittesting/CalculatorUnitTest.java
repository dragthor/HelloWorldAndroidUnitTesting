package com.kriskrause.helloandroidunittesting;

import com.kriskrause.calculator.Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kkrause on 12/26/15.
 */
public class CalculatorUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Calculator c = new Calculator(2, 2);

        assertEquals(4, c.Add());
    }

    @Test
    public void divide_isCorrect() throws Exception {
        Calculator c = new Calculator(4, 2);

        assertEquals(2, c.Divide());
    }
}
