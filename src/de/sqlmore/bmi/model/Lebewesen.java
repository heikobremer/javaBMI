package de.sqlmore.bmi.model;

import de.sqlmore.bmi.controller.Koerper;

public abstract class Lebewesen implements Koerper {    // abstract heisst es kann kein Objekt der KLasse erzeugt werden

    // public -> private -> protected
    protected String name;
    protected double groesse, gewicht;

    // Konstruktoren
    public Lebewesen() {

    }

    public Lebewesen(String name, double gewicht, double groesse) {
        this.name = name;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }


    // Methoden

    public void nimmtzu() {
        this.gewicht++;
    }

    public void nimmtab() {
        this.gewicht--;
    }

    public abstract void waechst();
}
