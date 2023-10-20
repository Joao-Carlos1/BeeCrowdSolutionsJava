package academy.BeeCrowd;

import java.util.Scanner;

public class JavaBeecrowd1014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int distPercorrida = sc.nextInt();
        double gasUsage = sc.nextDouble();
        double total = (distPercorrida / gasUsage);
        System.out.printf("%.3f", total);
        System.out.println(" km/l");
    }
}
