package de.sqlmore.bmi.controller;

public class CalcFactory {
    public static Calc createInstance() {
        return new CalcImplNeu();
    }
}
