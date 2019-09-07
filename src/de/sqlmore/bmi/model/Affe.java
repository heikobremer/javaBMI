package de.sqlmore.bmi.model;

public class Affe extends Lebewesen{
    String art;

    public Affe() {
        super();
        System.out.println("Eine Person wurde erstellt!");
    }

    public Affe(String name, double gewicht, double groesse, String art) {
        super();
        super.name = name;
        super.gewicht = gewicht;
        super.groesse = groesse;
        this.art = art;
    }

    @Override
    public void nimmtzu() {
        super.gewicht += 5;
    }

    @Override
    public void nimmtab() {
        super.gewicht -=5;
    }

    @Override
    public void waechst() {
        super.groesse += 5;
    }

}
