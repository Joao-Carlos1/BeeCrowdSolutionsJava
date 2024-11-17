package BeeCrowdJava;

import java.util.Scanner;
//Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
//
//Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

public class JavaBeecrowd1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();
        int horaTotal = horaFinal - horaInicial;
        int minutosTotal = minutoFinal - minutoInicial;


        if (horaTotal < 0) {
            horaTotal += 24;
        }
        if (minutosTotal < 0) {
            minutosTotal += 60;
            horaTotal--;
            if (horaTotal <= -1) {
                horaTotal += 24;
            }
        }
        if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + horaTotal + " HORA(S) E " + minutosTotal + " MINUTO(S)");
        }
    }
}

