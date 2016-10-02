package com.chlebda;

/**
 * Created by Łukasz on 02.10.2016.
 */
public class Constant implements Expresion {
    protected final double value;

    public Constant(double value) {
        this.value = value;
    }

     public double getValue(){
         return value;
     };
}
