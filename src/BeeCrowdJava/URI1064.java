package BeeCrowdJava;

import java.util.Locale;
import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        //URI 1064
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double j = 0, b = 0;
        Double[] number = new Double[6];

        for (int i = 0; i < 6; i++) {
            number[i] = input.nextDouble();
            if (number[i] > 0) {
                j += number[i];
                b++;
            }
        }
        System.out.printf("%.0f valores positivos\n", b);
        System.out.printf("%.1f%n", j / b);
    }
}