package com.chlebda;

/**
 * Created by Łukasz on 02.10.2016.
 */
public class Multiplyer extends BinaryExpression{
    public Multiplyer(Expresion left, Expresion right) {
        super(left, right);
    }

    public double getValue() {
        return left.getValue() * right.getValue();
    }
}
