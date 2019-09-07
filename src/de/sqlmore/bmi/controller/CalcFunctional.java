package de.sqlmore.bmi.controller;

/*
Functional Interfaces sind Interfaces mit nur einer Methode
SAM  Single Abstract Method Interface
 */

@FunctionalInterface
public interface CalcFunctional {
    public abstract double calc(Koerper k);
}
