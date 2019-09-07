package de.sqlmore.bmi.controller;

import de.sqlmore.bmi.model.Person0;

public class Calc0 {

    public double calcVal(double gewicht, double groesse) {
        double bmi = gewicht / (groesse * groesse);
        return bmi;
    }

    public double calcRef(Person0 person) {
        return person.gewicht / (person.groesse * person.groesse);
    }
}
