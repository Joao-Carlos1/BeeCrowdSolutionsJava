package BeeCrowdJava;

import java.util.Locale;
import java.util.Scanner;

public class JavaBeeCrowd1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int cont = 0;

        for (int i = 1; i <= 6; i++) {
            double num = input.nextDouble();
            if (num > 0) {
                cont++;
            }
        }
        System.out.println(cont + " valores positivos");
    }
}
