package ru.ifmo.md.lesson4;
/**
 * Created by delf on 18.03.14.
 */
public class Variable extends Polynom {
    protected final char varName;

    Variable(String var){
        varName=var.charAt(0);
    }

    public double evaluate(double var1, double var2, double var3) {
        switch (varName){
            case 'x':
            case 'X':
                return var1;
            case 'y':
            case 'Y':
                return var2;
            case 'z':
            case 'Z':
                return var3;
            default:
                return 0;
        }
    }
}
