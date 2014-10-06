package ru.ifmo.md.lesson4;

/**
 * Created by delf on 18.03.14.
 */
public class Divide extends Operation {
    Divide(Expression3 ... items){
        super(items);
    }


    protected double consider(double ... items) throws CalculationException{
        double ret=items[0],buf;
//        assert items[1]!= 0;
        buf = items[1];
        for(int i=2;i<items.length;i++){
            //assert items[i]!= 0;
            if(items[i]==0){
                throw new DivByZeroException("DivByZero");
            }
            buf*=items[i];
        }
        ret = ret/buf;
        if (Double.isNaN(ret)) {
            throw new CalculationException("Not-a-Number");
        }
        if(Double.isInfinite(ret))
        {
            throw  new CalculationException("+/- inf");
        }
        return ret;
    }
}
