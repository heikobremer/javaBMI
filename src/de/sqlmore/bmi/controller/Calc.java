package de.sqlmore.bmi.controller;

import de.sqlmore.bmi.model.Lebewesen;

public interface Calc{
    public static final double BMI_MAX = 25;
    public static final double BMI_MIN = 18;

    public double calc(Koerper k);

    public String eval(Koerper k);

}
