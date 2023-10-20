package academy.BeeCrowd;

import java.util.Scanner;


public class tests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        while (time > 3600) {
            time = time / 3600;
            System.out.println(time);
            while (time > 60)
                time = time / 60;
            System.out.println(time);
        }
    }
}