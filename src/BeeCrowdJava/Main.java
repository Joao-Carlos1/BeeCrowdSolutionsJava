package BeeCrowdJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (; ; ) {
            int m = input.nextInt();
            int n = input.nextInt();
            int soma = 0;

            if (m == 0 || n == 0) {
                break;
            } else if (m > n) {
                for (; m >= n; n++) {
                    System.out.print(n + " ");
                    soma += n;
                }
            } else {
                for (; n >= m; m++) {
                    System.out.print(m);
                    soma += m;
                }
            }
            System.out.println("Sum=" + soma);
        }
    }
}

