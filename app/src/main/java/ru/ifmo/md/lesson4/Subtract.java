package ru.ifmo.md.lesson4;

import ru.ifmo.md.lesson4.CalculationException;

/**
 * Created by delf on 18.03.14.
 */
public class Subtract extends Operation {
    public static final int MIN_OPERANDS_COUNT = 2;

    Subtract(Expression3... items) {
       super(items);
    }



    protected double consider(double... items) throws CalculationException {
        assert (items.length >= MIN_OPERANDS_COUNT):"unexpected operands count";
        double ret = items[0];
        for (int i = 1; i < items.length; i++) {
            ret = operation(ret,items[i]);
        }
        return ret;
    }
    /*protected <T extends Number> T consider(T... items) {
        assert items.length >= MIN_OPERANDS_COUNT;
        T ret = items[0];
        for (int i = 1; i < items.length; i++) {
            ret = operation(ret,items[i]);
        }
        return ret;
    } */

    private double operation(double first, double second) throws CalculationException {
        double c=first-second;
        /*if(((first^c)&(second^c))>0){
            throw new CalculationException("Overflow");
        }*/
        if (Double.isNaN(c)) {
            throw new CalculationException("Not-a-Number");
        }
        if(Double.isInfinite(c))
        {
            throw  new CalculationException("+/- inf");
        }

        return (c);
    }
}
