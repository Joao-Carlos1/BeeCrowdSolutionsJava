package academy.BeeCrowd;

import java.util.Scanner;

public class JavaBeecrowd1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int Maior = A;
        if (B > Maior) {
            Maior = B;
        }
        if (C > Maior) {
            Maior = C;
        }
        System.out.println(Maior + " eh o maior");
    }
}
