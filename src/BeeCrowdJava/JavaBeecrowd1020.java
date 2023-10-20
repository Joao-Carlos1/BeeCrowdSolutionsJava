package BeeCrowdJava;

import java.util.Scanner;

public class JavaBeecrowd1020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga a quantidade de dias");
        int dias = sc.nextInt();

        int anos = dias / 365;
        dias %= 365;
        int meses = dias / 30;
        dias %= 30;
        int dias1 = dias;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mese(es)");
        System.out.println(dias + " dia(s)");
    }
}
