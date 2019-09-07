package de.sqlmore.bmi.model;

public class Person extends Lebewesen{
    private boolean nerd;

    public Person() {
        super();
        System.out.println("Eine Person wurde erstellt!");
    }

    public Person(String name, double gewicht, double groesse, boolean nerd) {
        super();
        super.name = name;
        super.gewicht = gewicht;
        super.groesse = groesse;
        this.nerd = nerd;
    }

    public boolean isNerd() {
        return nerd;
    }

    public void setNerd(boolean nerd) {
        this.nerd = nerd;
    }

    @Override
    public void waechst() {
        super.groesse++;
    }
}
