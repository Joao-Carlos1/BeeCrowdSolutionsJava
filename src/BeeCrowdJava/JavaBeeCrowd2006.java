package BeeCrowdJava;

import java.util.Scanner;

public class JavaBeeCrowd2006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] answer = new int[5];
        int T;
        int contador = 0;

        T = input.nextInt();
        for (int i = 0; i < 5; i++) {
            answer[i] = input.nextInt();
            if (answer[i] == T) {
                contador += 1;
            }
        }
        System.out.println(contador);
    }
}
