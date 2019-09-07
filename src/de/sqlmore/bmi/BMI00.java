package de.sqlmore.bmi;

public class BMI00 {

    public BMI00() {
        double groesse;             // Deklaration
        groesse = 1.70;             // Initiallisierung
        double gewicht = 80.0;      //  Deklaration + Initialisierung
        double bmi = gewicht / (groesse * groesse);

        System.out.println("Größe:   " + groesse);
        System.out.println("Gewicht: " + gewicht);
        System.out.println("BMI:     " + bmi);

        // Implizites und explizites Casting
        float a = 1.0f;
        float b = (float) 1.0;

        // Formatierte Ausgabe
        System.out.printf("Die Größe %.2fm und das Gewicht %.1fkg eregben einen BMI von: %.2f ", groesse, gewicht, bmi);

        // Boolean und Vergeliche
        boolean uebergewicht = (bmi >= 25.0);
        System.out.println("\nübergewicht: " + uebergewicht);

        // Bedingungen
        if (uebergewicht) {
            System.out.println("Achtung Übergewicht");
        } else if (bmi < 18) {
            System.out.println("Achtung Untergewicht");
        } else {
            System.out.println("Normalgewicht");
        }

        // ternären Operator  if ? then : else
        System.out.println("\n" + ((bmi >= 25) ? "Achtung Übergewicht" : ((bmi < 18) ? "Achtung Untergewicht" : "Normalgewicht")));
        double d = 2.0;
        double e;

        if (d < 1.0) {
            e = d;
        } else {
            e = d / 2;
        }
        ;
        // d < 1 ? e = d : e = d/2;
        e = (d < 1) ? d : d / 2;

        int i = ((bmi >= 25) ? 1 : ((bmi < 18) ? -1 : 0));

        switch (i) {
            case 0:
                System.out.println("\n0 Normalgewicht");
                break;
            case 1:
                System.out.println("\n+1 Übergewicht");
                break;
            case -1:
                System.out.println("\n-1 Untergewicht");
                break;
            default:
                System.out.println("Programmfehler");
                break;
        }
    }
}
