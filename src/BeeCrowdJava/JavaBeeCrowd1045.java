package BeeCrowdJava;

import java.util.Scanner;

public class JavaBeeCrowd1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
        se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
        se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
        se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
        se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
        se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES*/

        float A, B, C;

        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();
        float maior;

        if (B > A && B > C) {
            maior = A;
            A = B;
            B = maior;
        } else if (C > A && C > B) {
            maior = A;
            A = C;
            C = maior;
        }

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((A * A) == ((B * B) + (C * C))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if ((A * A) > ((B * B) + (C * C))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if ((A * A) < ((B * B) + (C * C))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == C && A == B) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (A == C && A != B || A == B && A != C || B == C && B != A) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
