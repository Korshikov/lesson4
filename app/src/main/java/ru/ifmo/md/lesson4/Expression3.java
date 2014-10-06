package ru.ifmo.md.lesson4;

import ru.ifmo.md.lesson4.CalculationException;

public interface Expression3 {
    //public double evaluate(double var1, double var2, double var3);
    //public <T extends Number> T evaluate(T var1,T var2,T var3);
    public double evaluate(double var1, double var2, double var3)  throws CalculationException;
}
