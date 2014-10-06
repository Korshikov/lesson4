package ru.ifmo.md.lesson4;

/**
 * Created by root on 22.04.14.
 */
public class DivByZeroException extends CalculationException{
    DivByZeroException(String message){
        super(message);
    }

    DivByZeroException(){
        super();
    }
}
