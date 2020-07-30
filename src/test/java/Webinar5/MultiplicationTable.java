package Webinar5;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("podaj wartość x");
        Scanner scan1 = new Scanner(System.in);
        int x = scan1.nextInt();

        System.out.println("podaj wartość y");
        Scanner scan2 = new Scanner(System.in);
        int y = scan2.nextInt();

        int numbers[][] = new int[100][100];

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                numbers[j][i] = j * i;
            }
        }
        System.out.println(numbers[x][y]);
    }
}
