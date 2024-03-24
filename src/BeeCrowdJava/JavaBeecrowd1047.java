package BeeCrowdJava;

import java.util.Scanner;

public class JavaBeecrowd1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int horaTotal = Math.abs(horaInicial - horaFinal);
        int minutoTotal1 = ((horaInicial * 60) + minutoInicial);
        int minutoTotal2 = ((horaFinal * 60) + minutoFinal);
        int minutoTotal3 = minutoTotal1 - minutoTotal2;
        if (horaTotal == 0) {
            horaTotal = 24;
            System.out.println("O JOGO DUROU " + horaTotal + " HORA(S) E " + minutoTotal3+ " MINUTOS");
        }
    }
}
