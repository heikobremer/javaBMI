package de.sqlmore.bmi.controller;

import de.sqlmore.bmi.model.Lebewesen;

public class CalcImpl implements Calc {
    @Override
    public double calc(Koerper l) {
        return l.getGewicht() / Math.pow(l.getGroesse(), 2.0);  // Math.pow(a,b) = a^b
    }

    @Override
    public String eval(Koerper l) {
        return ((calc(l) >= Calc.BMI_MAX ? "Übergewicht" : ((calc(l) < Calc.BMI_MIN ? "Untergewicht" : "Normalgewicht"))));
    }

    public static double calcRef(Lebewesen leb) {
        return leb.getGewicht() / Math.pow(leb.getGroesse(), 2.0);
    }
}
