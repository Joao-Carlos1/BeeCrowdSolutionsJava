package academy.BeeCrowd;

import java.util.Scanner;

public class JavaBeecrowd1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempoViagem = sc.nextInt();
        int mediaVelocidade = sc.nextInt();
        double litrosTotal = (double) (tempoViagem * mediaVelocidade) / 12;
        System.out.printf("%.3f\n", litrosTotal);
    }
}
