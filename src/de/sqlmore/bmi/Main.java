package de.sqlmore.bmi;

import de.sqlmore.bmi.controller.*;
import de.sqlmore.bmi.model.Affe;
import de.sqlmore.bmi.model.Lebewesen;
import de.sqlmore.bmi.model.Person;
import de.sqlmore.bmi.model.Person0;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //mainLoop();
        //mainObject();
        //mainStructure();

        mainAnonymus();
        mainLambda();
    }

    private static void mainLoop() {
        BMI00 bmi0 = new BMI00();
        BMI01 bmi1 = new BMI01();

        bmi1.forSchleife();
        bmi1.whileSchleife();
        bmi1.doWhileSchleife();
        bmi1.arraySchleife();
        bmi1.incremnt();
    }

    private static void mainObject() {
        Person0 steveJobs = new Person0();
        steveJobs.name = "Steve Jobs";
        steveJobs.gewicht = 60.0;
        steveJobs.groesse = 1.70;

        Calc0 calc0 = new Calc0();
        System.out.println("BMI by Value:     " + calc0.calcVal(steveJobs.gewicht, steveJobs.groesse));
        System.out.println("BMI by Reference: " + calc0.calcRef(steveJobs));

        Person0[] personA = new Person0[4];
        personA[0] = steveJobs;
        personA[1] = new Person0("Steve Wozniak", 90.0, 1.65);
        personA[2] = new Person0("Bill Gates", 72.0, 1.72);
        personA[3] = new Person0("Mark Zuckerberg", 80.0, 1.80);

        for (Person0 p : personA) {
            System.out.printf("%-20s\t%.1fkg\t%.1fm\t%.2f \n", p.name, p.gewicht, p.groesse, calc0.calcRef(p));
        }
   }


   private static void mainStructure() {
        // 1. Superclass Lebewesen ->
       Person p = new Person();
       p.setName("Steve Jobs");
       System.out.println(p.getName());

       Affe a = new Affe("Balou", 100.0, 100.0, "Orang Utan");
       a.nimmtzu();
       a.nimmtab();
       a.nimmtab();
       System.out.println("Gewicht: " + a.getGewicht());


       CalcImpl.calcRef(p);             // statische Methoden können ohne Erzeugung eines Objektes aufgerufen werden
                                        // Notation:    Klassenname.statischeMethode(Parameter)

       Calc calc = new CalcImpl();      //  Objekt vom Typ des Interfaces mit austauschbarer Implementierung

       Calc calc1 = CalcFactory.createInstance();

       //List list = new ArrayList();                         // Liste mit beliebigen Objekten
       List<Lebewesen> list = new ArrayList<Lebewesen>();     // Liste mit Lebewesen-Objekten

       list.add(new Person("Steve Jobs", 60.0, 1.80, true));
       list.add(new Person("Steve Wozniak", 90.0, 1.65, true));
       list.add(new Person("Sheryl Sandberg", 55.0, 1.70, true));
       list.add(new Person("Virginia Rometty", 65.0, 1.75, true));
       list.add(new Person("Bill Gates", 70.0, 1.70, true));
       list.add(new Person("Meg Whitman", 65.0, 1.70, true));

//        for (Object o : list) {
//            Lebewesen l = (Lebewesen) o;
       for (Lebewesen l : list) {
            System.out.printf("BMI  %-20s\t%.1fkg\t%.2fm\tBMI %.2f %-15s \n",
                    l.getName(), l.getGewicht(), l.getGroesse(), calc.calc(l), calc.eval(l));
        }

   }


    private static void mainAnonymus() {

        // Anonyme Klassen -> schlimm!

        Calc calc5 = new Calc() {
            @Override
            public double calc(Koerper k) {
                return k.getGewicht()/ Math.pow(k.getGroesse(),2.0);
            }

            @Override
            public String eval(Koerper k) {
                return ((calc(k)>= BMI_MAX) ? "Übergewicht" : ((calc(k) < BMI_MIN) ? "Untergewicht" : "Normalgewicht"));
            }


        };


        Person p = new Person("Steve Jobs", 60.0, 1.80, true);

        System.out.println("BMI von p: " + calc5.calc(p));
    }

    private static <y> void mainLambda() {

        // Functional Interface "CalcFunctional" erstellen
        CalcFunctional calc0 = (Koerper k) -> {return k.getGewicht() / Math.pow(k.getGroesse(), 2.0);};
        CalcFunctional calc1 = (Koerper k) -> k.getGewicht() / Math.pow(k.getGroesse(), 2.0);
        CalcFunctional calc2 = k -> k.getGewicht() / Math.pow(k.getGroesse(), 2.0);

        FreeFunctional hoch2 = x-> Math.pow(x, 2.0);

        System.out.println("Ergebnis: " + hoch2.calc(10.0));
    }

}
