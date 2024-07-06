package BeeCrowdJava;

import java.util.Locale;
import java.util.Scanner;

public class JavaBeecrowd1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float X = sc.nextFloat(), Y = sc.nextFloat();

        if (X > 0.0 && Y > 0.0) {
            System.out.println("Q1");
        } else if (X < 0.0 && Y > 0.0) {
            System.out.println("Q2");
        } else if (X < 0.0 && Y < 0.0) {
            System.out.println("Q3");
        } else if (X > 0.0 && Y < 0.0) {
            System.out.println("Q4");
        } else if (X != 0.0 && Y == 0.0 ) {
            System.out.println("Eixo X");
        } else if (Y != 0.0 && X == 0.0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Origem");
        }
    }
}
