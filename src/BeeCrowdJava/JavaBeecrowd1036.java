package BeeCrowdJava;

import java.util.Locale;
import java.util.Scanner;

public class JavaBeecrowd1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double delta = ((B * B) - (4 * A * C));

        if (delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = ((-B + Math.sqrt((delta))) / (2 * A));
            double R2 = ((-B - Math.sqrt((delta))) / (2 * A));

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
    }
}
