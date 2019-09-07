package de.sqlmore.bmi;

public class BMI01 {

    // forSchleife
    public void forSchleife() {
        double groesse = 1.70;

        System.out.println("For-Schleife");
        System.out.println("Gewicht\tGroesse\tBMI\tBemerkung");
        for (double gewicht = 40.0; gewicht <= 100; gewicht = gewicht + 5.0) {
            double bmi = gewicht / (groesse * groesse);
            System.out.printf("%.1fkg\t%.1fm\t%.2f ", gewicht, groesse, bmi);
            System.out.println("\t" + ((bmi >= 25) ? "Achtung Übergewicht" : ((bmi < 18) ? "Achtung Untergewicht" : "Normalgewicht")));
        }
    }

    // whileSchleife
    public void whileSchleife() {
        double groesse = 1.70;
        double gewicht = 140.0;
        double bmi;

        System.out.println("\nWhile-Schleife");
        System.out.println("Gewicht\tGroesse\tBMI\tBemerkung");
        while (gewicht <= 100) {
            bmi = gewicht / (groesse * groesse);
            System.out.printf("%.1fkg\t%.1fm\t%.2f ", gewicht, groesse, bmi);
            System.out.println("\t" + ((bmi >= 25) ? "Achtung Übergewicht" : ((bmi < 18) ? "Achtung Untergewicht" : "Normalgewicht")));
            gewicht = gewicht + 5.0;
        }
    }


    // dowhileSchleife
    public void doWhileSchleife() {
        double groesse = 1.70;
        double gewicht = 140.0;
        double bmi;

        System.out.println("\nDo-While-Schleife");
        System.out.println("Gewicht\tGroesse\tBMI\tBemerkung");
        do {
            bmi = gewicht / (groesse * groesse);
            System.out.printf("%.1fkg\t%.1fm\t%.2f ", gewicht, groesse, bmi);
            System.out.println("\t" + ((bmi >= 25) ? "Achtung Übergewicht" : ((bmi < 18) ? "Achtung Untergewicht" : "Normalgewicht")));
            gewicht = gewicht + 5.0;
        } while (gewicht <= 100);
    }


    public void arraySchleife() {
        double groesse = 1.70;
        double bmi;
//        double[] gewicht0 = new double[4];
//        gewicht0[0] = 40.0;
//        gewicht0[1] = 45.0;
//        gewicht0[2] = 50.0;
//        gewicht0[3] = 55.0;
//        //gewicht0[4] = 60.0;

        double[] gewicht = {40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 85.0};


        System.out.println("Array-Schleife");
        System.out.println("Gewicht\tGroesse\tBMI\tBemerkung");
        for (int i = 0; i < gewicht.length; i++) {
            bmi = gewicht[i] / (groesse * groesse);
            System.out.printf("%.1fkg\t%.1fm\t%.2f ", gewicht[i], groesse, bmi);
            System.out.println("\t" + ((bmi >= 25) ? "Achtung Übergewicht" : ((bmi < 18) ? "Achtung Untergewicht" : "Normalgewicht")));
        }
    }

    public void incremnt() {
        int a = 1;
        int a1 = ++a;
        int b = 1;
        int b1 = b++;

        System.out.println("\nIncrement");
        System.out.println("a1 = ++a = " + a1);
        System.out.println("b1 = b++ = " + b1);
        System.out.println(a);
        System.out.println(b);

        int c = 0;
        c += 5;

        System.out.println("c += 5  ->  " + c);
    }

}
