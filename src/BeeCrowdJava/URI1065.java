package BeeCrowdJava;
import java.util.Scanner;
public class URI1065 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int[] num = new int[5];

        for (int i = 0 ; i <=4 ; i++){
            num[i] = input.nextInt();
            if (num[i] % 2 == 0){
                total++;
            }
        }
        System.out.println(total + " valores pares");
    }
}