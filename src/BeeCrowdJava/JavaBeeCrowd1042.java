package BeeCrowdJava;

import java.util.Scanner;

public class JavaBeeCrowd1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int um = sc.nextInt();
        int dois = sc.nextInt();
        int tres = sc.nextInt();

        if (um < dois && um < tres) {
            System.out.println(um);
            if (dois < tres) {
                System.out.println(dois);
                System.out.println(tres);
            } else {
                System.out.println(tres);
                System.out.println(dois);

            }
        } else if (dois < um && dois < tres) {
            System.out.println(dois);
            if (tres < um) {
                System.out.println(tres);
                System.out.println(um);
            } else {
                System.out.println(um);
                System.out.println(tres);
            }


        } else {
            System.out.println(tres);
            if (um < dois) {
                System.out.println(um);
                System.out.println(dois);
            } else {
                System.out.println(dois);
                System.out.println(um);
            }
        }
        System.out.println();
        System.out.println(um);
        System.out.println(dois);
        System.out.println(tres);
    }
}



