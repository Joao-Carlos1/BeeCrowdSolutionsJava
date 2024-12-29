package BeeCrowdJava;

import java.util.Scanner;

public class JavaBeecrowd1050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ddd;

        String[] cidade = {"61", "71", "11", "21", "32", "19", "27", "31"};
        ddd = input.nextLine();

        if (ddd.equals(cidade[0])) {
            System.out.println("Brasilia");
        } else if (cidade[1].equals(ddd)) {
            System.out.println("Salvador");
        } else if (cidade[2].equals(ddd)) {
            System.out.println("Sao Paulo");
        } else if (cidade[3].equals(ddd)) {
            System.out.println("Rio de Janeiro");
        } else if (cidade[4].equals(ddd)) {
            System.out.println("Juiz de Fora");
        } else if (cidade[5].equals(ddd)) {
            System.out.println("Campinas");
        } else if (cidade[6].equals(ddd)) {
            System.out.println("Vitoria");
        } else if (cidade[7].equals(ddd)) {
            System.out.println("Belo Horizonte");
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
}
