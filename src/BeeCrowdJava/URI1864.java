package BeeCrowdJava;
import java.util.Scanner;

public class URI1864 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int quos = a / b;
        int resto = a % b;

        if (resto < 0) {
            if (b > 0) {
                quos -= 1;
                resto += b;
            } else {
                quos += 1;
                resto -= b;
            }
        }

        System.out.println(quos + " " + resto);
    }
}
