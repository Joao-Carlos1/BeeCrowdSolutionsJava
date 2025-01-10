package BeeCrowdJava;

import java.util.Locale;
import java.util.Scanner;

public class URI1160 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double PA, PB, G1, G2;

        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            int cont = 0;
            PA = input.nextDouble();
            PB = input.nextDouble();
            G1 = input.nextDouble();
            G2 = input.nextDouble();

            while (PB >= PA) {
                PA += (int) (PA * (G1 / 100.0));
                PB += (int) (PB * (G2 / 100.0));
                cont++;

                if (cont > 100) {
                    break;
                }
            }
            if (cont > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(cont + " anos.");
            }
        }
    }
}

