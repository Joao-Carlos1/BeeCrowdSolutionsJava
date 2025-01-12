package BeeCrowdJava;

import java.util.Scanner;

public class URI1101Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] m = new int[3];
        int[] n = new int[3];

        for (int i = 0; i < 3; i++) {
            m[i] = input.nextInt();
            n[i] = input.nextInt();
            int total = 0;

            if (m[i] == 0 || n[i] == 0 ){
                break;
            }
            else if (m[i] > n[i]) {
                for (int j = n[i]; j <= m[i]; j++) {
                    System.out.print(j + " ");
                    total += j;
                }
            } else {
                for (int k = m[i]; k <= n[i]; k++) {
                    System.out.print(k + " ");
                    total += k;
                }
            }
            System.out.println("Sum=" + total);
        }
    }
}