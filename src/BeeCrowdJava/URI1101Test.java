package BeeCrowdJava;

import java.util.Scanner;

public class URI1101Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //tried to solve the problem using arrays and for, didn't finish, should have used a for(;;) to scan the m n.

        for (; ; ) {
            int[] m = new int[]{input.nextInt()};
            int[] n = new int[]{input.nextInt()};
            int total = 0;

            for (int i = 0; ; i++) {

                if (m[i] == 0 || n[i] == 0) {
                    break;
                } else if (m[i] >= n[i]) {
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
}