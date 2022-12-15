package com.example.lr6.functions.basic;

import com.example.lr6.functions.Function;

public abstract class TrigonometricFunction implements Function {

    public double getRightDomainBorder(){
        return Double.POSITIVE_INFINITY;
    }

    public double getLeftDomainBorder(){
        return Double.NEGATIVE_INFINITY;
    }

    public abstract double getFunctionValue(double x);

}
