package com.chlebda;

/**
 * Created by Łukasz on 02.10.2016.
 */
public abstract class BinaryExpression implements Expresion {

    protected final Expresion left;
    protected final Expresion right;

    public BinaryExpression(Expresion left, Expresion right) {
        this.left = left;
        this.right = right;
    }

    public abstract double getValue();
}
