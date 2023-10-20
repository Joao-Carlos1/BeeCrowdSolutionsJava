package academy.BeeCrowd;

import java.util.Scanner;

public class JavaBeecrowd1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ray = sc.nextInt();
        double volume = ((4.0 / 3) * 3.14159 * ray * ray * ray);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
