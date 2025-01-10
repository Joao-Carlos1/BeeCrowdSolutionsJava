package BeeCrowdJava;

import java.util.Scanner;

public class JavaBeeCrowd1061 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        String[] dia = input.nextLine().split(" ");
        String[] hms = input.nextLine().split(" : ");
        int day1 = Integer.parseInt(dia[1]);
        int hour1 = Integer.parseInt(hms[0]);
        int minute1 = Integer.parseInt(hms[1]);
        int second1 = Integer.parseInt(hms[2]);

        String[] dia2 = input.nextLine().split(" ");
        String[] hms2 = input.nextLine().split(" : ");

        int day2 = Integer.parseInt(dia2[1]);
        int hour2 = Integer.parseInt(hms2[0]);
        int minute2 = Integer.parseInt(hms2[1]);
        int second2 = Integer.parseInt(hms2[2]);

        if (second2 < second1) {
            segundos += (60 - second1) + second2;
            minute2--;
        } else if (second2 > second1) {
            segundos += second2 - second1;
        }
        if (minute2 < minute1) {
            minutos += (60 - minute1) + minute2;
            hour2--;
        } else if (minute2 > minute1) {
            minutos += minute2 - minute1;
        }
        if (hour2 < hour1) {
            horas += (24 - hour1) + hour2;
            day2--;
        } else if (hour2 > hour1) {
            horas += hour2 - hour1;
        }
        dias = day2 - day1;
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}
