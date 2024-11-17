package BeeCrowdJava;

import java.util.Scanner;

public class JavaBeeCrowd1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a == b) {
            c = 24;
        } else {
            if (b > a) {
                c = b - a;
            }
            else {
                c = (24 - a) + b;
            }
        }
        System.out.println("O JOGO DUROU " + c + " HORA(S)");

    }
}

