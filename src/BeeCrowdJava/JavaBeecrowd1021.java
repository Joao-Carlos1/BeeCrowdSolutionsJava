package BeeCrowdJava;

import java.util.Locale;
import java.util.Scanner;

public class JavaBeecrowd1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        int notas100 = 0;
        int notas50 = 0;
        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;
        int moedas1 = 0;
        int moedas050 = 0;
        int moedas025 = 0;
        int moedas010 = 0;
        int moedas05 = 0;
        int moedas01 = 0;

        notas100 = (int) value / 100;
        value %= 100;
        notas50 = (int) value / 50;
        value %= 50;
        notas20 = (int) value / 20;
        value %= 20;
        notas10 = (int) value / 10;
        value %= 10;
        notas5 = (int) value / 5;
        value %= 5;
        notas2 = (int) value / 2;
        value %= 2;

        value = value * 100;
        moedas1 = (int) value / 100;
        value %= 100.0;
        moedas050 = (int) value / 50;
        value %= 50.0;
        moedas025 = (int) value / 25;
        value %= 25.0;
        moedas010 = (int) value / 10;
        value %= 10.0;
        moedas05 = (int) value / 5;
        value %= 5.0;
        moedas01 = (int) value;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", moedas1);
        System.out.printf("%d moeda(s) de R$ 0.50%n", moedas050);
        System.out.printf("%d moeda(s) de R$ 0.25%n", moedas025);
        System.out.printf("%d moeda(s) de R$ 0.10%n", moedas010);
        System.out.printf("%d moeda(s) de R$ 0.05%n", moedas05);
        System.out.printf("%d moeda(s) de R$ 0.01%n", moedas01);
        sc.close();
    }

}
