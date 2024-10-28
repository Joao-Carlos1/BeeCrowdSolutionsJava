package BeeCrowdJava;
import java.util.Scanner;

public class JavaBeecrowd1930 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T1, T2, T3, T4, T;

        T1 = sc.nextInt();
        T2 = sc.nextInt();
        T3 = sc.nextInt();
        T4 = sc.nextInt();

        T1 = T1 - 1;
        T2 = T2 - 1;
        T3 = T3 - 1;
        T = T1 + T2 + T3 + T4;

        System.out.println(T);

    }
}