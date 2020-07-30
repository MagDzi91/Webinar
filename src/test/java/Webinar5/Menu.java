package Webinar5;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        System.out.println("Wybierz z menu: 1 lub 2, gdzie: ");
        System.out.println("1 - dzisiejszy stan pogody");
        System.out.println("2 - dzisiejszy kurs walut EUR");
        System.out.println("Wybierz 0 aby wyjść");

        int y = 0;

        while (y == 0) {
            System.out.println("podaj wartość");
            Scanner scan1 = new Scanner(System.in);
            int x = scan1.nextInt();

            switch (x) {
                case 1:
                    System.out.println("jest słonecznie");
                    break;
                case 2:
                    System.out.println("1EUR = 4,45PLN");
                    break;
            }
            while (x == 0) {
                System.out.println("Koniec.");
                System.exit(0);
            }
        }
    }
}


