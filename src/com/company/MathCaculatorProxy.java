package com.company;

public class MathCaculatorProxy implements Caculator{
    private MathCaculator mathCaculator;

    public MathCaculatorProxy() {
        this.mathCaculator = new MathCaculator();
    }
    @Override
    public double add(double first, double second) {
        return 0;
    }

    @Override
    public double sub(double first, double second) {
        return 0;
    }

    @Override
    public double mul(double first, double second) {
        return 0;
    }

    @Override
    public double div(double first, double second) {
        return 0;
    }
}
