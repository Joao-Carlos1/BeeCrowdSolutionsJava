package academy.BeeCrowd;

import java.util.Scanner;

public class JavaBeecrowd1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int horas = time / 3600;
        int minutos = (time % 3600) / 60;
        int segundos = time % 60 ;
    System.out.println(horas +":"+ minutos +":"+ segundos);

    }
}
