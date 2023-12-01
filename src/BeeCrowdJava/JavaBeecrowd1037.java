package BeeCrowdJava;

import java.util.Locale;
import java.util.Scanner;

public class JavaBeecrowd1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double intervalo = sc.nextDouble();

        if (intervalo >= 00.00 & intervalo <= 25.00) {
            System.out.println("Intervalo " + "(00,25]");
        }
        else if (intervalo >= 25.01 & intervalo <= 50.00) {
            System.out.println("Intervalo " + "(25,50]"); 
        }else if (intervalo >= 50.01 & intervalo <= 75.00) {
            System.out.println("Intervalo " + "(50,75]");
        }
        else if (intervalo >= 75.01 & intervalo <= 100.00) {
            System.out.println("Intervalo " + "(75,100]");
        }else {
            System.out.println("Fora de intervalo");
        }
    }
}
