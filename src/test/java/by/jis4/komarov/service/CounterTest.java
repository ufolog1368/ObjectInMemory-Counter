package by.jis4.komarov.service;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest  {
    Counter counter;

    @Before
    public void setUp(){
        counter = new Counter();
    }

    @Test
    public void testGetValue() {
        counter.setValue(150);
        int expected = 0;
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStep() {
            counter.setStep(5);
            int expected = 5;
            int actual = counter.getStep();
            assertEquals(expected, actual);
    }

    @Test
    public void testGetStepUpLimit() {
        counter.setStep(15);
        int expected = 1;
        int actual = counter.getStep();
        assertEquals(expected, actual);
    }


    @Test
    public void testReset() {
        counter.setStep(4);
        counter.setValue(44);
        counter.reset();

        boolean expected = false;
        boolean actual = (counter.getStep() == 4 && counter.getValue() == 44);
        assertEquals(expected, actual);
 }

    @Test
    public void testIncrement() {
        counter.setStep(4);
        counter.setValue(44);
        counter.increment();

        int expected = 48;
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testIncrementUpLimit() {
        counter.setStep(4);
        counter.setValue(98);
        counter.increment();

        int expected = 98;
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testDecrement() {
        counter.setStep(4);
        counter.setValue(44);
        counter.decrement();

        int expected = 40;
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testDecrementDownLimit() {
        counter.setStep(4);
        counter.setValue(2);
        counter.decrement();

        int expected = 2;
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }
}