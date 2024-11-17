package BeeCrowdJava;

import java.util.Scanner;

public class JavaBeecrowd1049 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String group1, group2, group3;
        group1 = sc.nextLine();
        group2 = sc.nextLine();
        group3 = sc.nextLine();

        if (group1.equals("vertebrado")) {
            if (group2.equals("ave")) {
                if (group3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (group3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (group2.equals("inseto")) {
                if (group3.equals("hematofago")){
                    System.out.println("pulga");
                }else {
                    System.out.println("lagarta");
                }
            }else {
                if(group3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}
