package BeeCrowdJava;

import java.util.Locale;
import java.util.Scanner;

public class JavaBeecrowd1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if (A + B > C && A + C > B && C + B > A) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            System.out.printf("Area = %.1f%n" , (C * (A + B)) / 2);
        }
    }
}
