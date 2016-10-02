package com.chlebda.test;

import com.chlebda.*;
import org.junit.Assert.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class Test {
    @org.junit.Test
    public void shouldAdd() {
        double testValue1 = 2;
        double testValue2 = 10;
        Expresion left = new Constant(testValue1);
        Expresion right = new Constant(testValue2);
        Expresion e = new Adder(left, right);
        assertEquals((testValue1+testValue2), e.getValue(), 0.0);
    }
    @org.junit.Test
    public void shouldSubstract() {
        double testValue1 = 2;
        double testValue2 = 10;
        Expresion left = new Constant(testValue1);
        Expresion right = new Constant(testValue2);
        Expresion e = new Substracter(left, right);
        assertEquals((testValue1-testValue2), e.getValue(), 0.0);
    }
    @org.junit.Test
    public void shouldDevide() {
        double testValue1 = 2;
        double testValue2 = 10;
        Expresion left = new Constant(testValue1);
        Expresion right = new Constant(testValue2);
        Expresion e = new Divider(left, right);
        assertEquals((testValue1/testValue2), e.getValue(), 0.0);
    }
    @org.junit.Test
    public void shouldMultiply() {
        double testValue1 = 2;
        double testValue2 = 10;
        Expresion left = new Constant(testValue1);
        Expresion right = new Constant(testValue2);
        Expresion e = new Multiplyer(left, right);
        assertEquals((testValue1*testValue2), e.getValue(), 0.0);
    }
    @org.junit.Test
    public void shouldCalculateFormula() {
        double testValue1 = 2;
        double testValue2 = 10;
        Expresion left = new Constant(testValue1);
        Expresion right = new Constant(testValue2);
        Expresion e = new Divider(
                new Adder(new Multiplyer(new Constant(22), new Constant(11)), new Constant(33)), new Divider(new Constant(31), new Constant(11)));
        assertEquals(97.5806 , e.getValue(), 0.0001);
    }

}
