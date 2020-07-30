package Webinar5;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {


        System.out.println("podaj wartość x");
        Scanner scan1 = new Scanner(System.in);
        int x = scan1.nextInt();


        while (x != 0) {
            while (x == 1) {
                System.out.println("Jest słonecznie");
                return;
            }
            while (x == 2) {
                System.out.println("1EUR = 4,56PLN");
                return;
            }
        }
    }
}


