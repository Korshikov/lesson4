package ru.ifmo.md.lesson4;

public class DummyCalculateEngine implements CalculationEngine {
    @Override
    public double calculate(String expression) throws CalculationException {
        return  ExpressionParser.parse(expression).evaluate(0,0,0);
    }
}
