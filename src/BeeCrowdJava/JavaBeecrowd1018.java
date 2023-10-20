package academy.BeeCrowd;

import java.util.Scanner;


public class JavaBeecrowd1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int notas100 = 0;
        int notas50 = 0;
        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;
        int notas1 = 0;
        System.out.println(value);
        notas100 = value /100;
        value %= 100;
        notas50 = value / 50;
        value %= 50;
        notas20 = value / 20;
        value %= 20;
        notas10 = value / 10;
        value %= 10;
        notas5 = value / 5;
        value %= 5;
        notas2 = value / 2;
        value %= 2;
        notas1 = value;

        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 2,00");

    }
}






