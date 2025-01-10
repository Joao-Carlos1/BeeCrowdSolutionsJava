package BeeCrowdJava;

import java.util.Scanner;

public class URI1074 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = input.nextInt();
            if (X[i] == 0) {
                System.out.println("NULL");
            } else if (X[i] > 0 && X[i] % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            } else if (X[i] > 0 && X[i] % 2 != 0) {
                System.out.println("ODD POSITIVE");
            } else if (X[i] < 0 && X[i] % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (X[i] < 0 && X[i] % 2 != 0) {
                System.out.println("ODD NEGATIVE");
            }
        }
    }
}
