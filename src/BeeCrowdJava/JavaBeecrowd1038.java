package BeeCrowdJava;

import java.util.Locale;
import java.util.Scanner;

public class JavaBeecrowd1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        switch (codigo) {
            case 1 -> System.out.printf("Total: R$ %.2f\n", quantidade * 4.00);
            case 2 -> System.out.printf("Total: R$ %.2f\n", quantidade * 4.50);
            case 3 -> System.out.printf("Total: R$ %.2f\n", quantidade * 5.00);
            case 4 -> System.out.printf("Total: R$ %.2f\n", quantidade * 2.00);
            case 5 -> System.out.printf("Total: R$ %.2f\n", quantidade * 1.50);
        }
    }
}
