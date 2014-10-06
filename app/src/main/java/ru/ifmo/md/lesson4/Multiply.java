package ru.ifmo.md.lesson4;

/**
 * Created by delf on 18.03.14.
 */
public class Multiply extends Operation {
    public static final int MIN_OPERANDS_COUNT = 2;
    Multiply(Expression3 ... items){
        super(items);
    }


    protected double consider(double ... items) throws CalculationException {
        assert items.length>=MIN_OPERANDS_COUNT;
        double ret=items[0];
        for(int i=1;((i<items.length)&&(ret!=0));i++){
            ret*=items[i];
        }

        if (Double.isNaN(ret)) {
            throw new CalculationException("Not-a-Number");
        }
        if(Double.isInfinite(ret))
        {
            throw  new CalculationException("+/- inf");
        }

        return (int) ret;
    }
}
