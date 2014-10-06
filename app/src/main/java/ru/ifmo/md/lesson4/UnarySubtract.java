package ru.ifmo.md.lesson4;

/**
 * Created by delf on 01.04.14.
 */
public class UnarySubtract extends Operation {
    UnarySubtract(Expression3... items) {
        super(items);
    }


    protected double consider(double... items) throws CalculationException{
        assert (items.length == 1):"unexpected operands count";

        if (Double.isNaN(-items[0])) {
            throw new CalculationException("Not-a-Number");
        }
        if(Double.isInfinite(-items[0]))
        {
            throw  new CalculationException("+/- inf");
        }

        return -(items[0]);
    }
}