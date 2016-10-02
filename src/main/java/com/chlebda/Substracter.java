package com.chlebda;

/**
 * Created by Łukasz on 02.10.2016.
 */
public class Substracter extends BinaryExpression {
    public Substracter(Expresion left, Expresion right) {
        super(left, right);
    }

    public double getValue() {
        return left.getValue() - right.getValue();
    }
}
