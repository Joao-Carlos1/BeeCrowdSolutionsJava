package academy.BeeCrowd;

import java.util.Scanner;

public class JavaBeecrowd1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codUnit = sc.nextInt();
        int quantity = sc.nextInt();
        double value = sc.nextDouble();
        int codUnit2 = sc.nextInt();
        int quantity2 = sc.nextInt();
        double value2 = sc.nextDouble();
        double allValue = (quantity * value + quantity2 * value2);
        System.out.printf("VALOR TOTAL A PAGAR: R$ %.2f\n", allValue);
    }
}