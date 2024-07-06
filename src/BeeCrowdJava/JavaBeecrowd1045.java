package BeeCrowdJava;

import java.util.Locale;
import java.util.Scanner;
      /*se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
        se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
        se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
        se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
        se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
        se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES*/

public class JavaBeecrowd1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double A, B, C, num = 0;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        if (B > A) {
            num = A;
            A = B;
            B = num;
        }
        if (C > A) {
            num = A;
            A = C;
            C = num;
        }
        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        if (A * A == (B * B) + (C * C)) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if (A * A > (B * B) + (C * C)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (A * A < (B * B) + (C * C)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == B && A == C && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}


