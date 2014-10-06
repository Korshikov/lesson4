package ru.ifmo.md.lesson4;

/**
 * Created by delf on 18.03.14.
 */

public class Add extends Operation {
    Add(Expression3... items) {
        super(items);
    }



    protected double consider(double... items)  throws CalculationException {
        double ret =  items[0];
        for (int i = 1; i < items.length; i++) {
            ret = operation(ret,items[i]);
        }
        return ret;
    }
    /*protected <T extends Number> T consider(T... items) {
        T ret = (T) items[0];
        for (int i = 1; i < items.length; i++) {
            ret = operation(ret,items[i]);
        }
        return ret;
    }*/

    protected static double operation(final double a, final double b) throws CalculationException {
        double c=a+b;
        if (Double.isNaN(c)) {
            throw new CalculationException("Not-a-Number");
        }
        if(Double.isInfinite(c))
        {
            throw  new CalculationException("+/- inf");
        }

        return c;
    }
}
