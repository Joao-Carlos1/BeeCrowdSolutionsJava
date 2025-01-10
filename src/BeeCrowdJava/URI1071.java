package BeeCrowdJava;

import java.util.Scanner;

public class URI1071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cont = 0;
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > y) {
            for (int i = y + 1; i < x; i++) {
                if (i % 2 != 0) {
                    cont += i;
                }
            }
        } else {
            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    cont += i;
                }
            }
        }
        System.out.println(cont);
    }
}
