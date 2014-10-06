/**
 * Created by delf on 18.03.14.
 */
package ru.ifmo.md.lesson4;

public class Const extends Polynom{
    protected final double Value;

    Const(double constValue){
        Value=constValue;
    }

    public double evaluate(double var1, double var2, double var3) throws CalculationException{
        return Value;
    }
}
