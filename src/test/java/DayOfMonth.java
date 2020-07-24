import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {

        String[] month = new String[13];
        month[0]="Zacznij od jedynki :P";
        month[1]= "Styczeń";
        month[2]= "Luty";
        month[3]= "Marzec";
        month[4]= "Kwiecień";
        month[5]= "Maj";
        month[6]= "Czerwiec";
        month[7]="Lipiec";
        month[8]="Sierpień";
        month[9]="Wrzesień";
        month[10]="Październik";
        month[11]="Listopad";
        month[12]="Grudzień";

        System.out.println("Podaj numer miesiąca");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();


        Integer.parseInt(name);
        System.out.println("Miesiąc to " + month[Integer.parseInt(name)] );

    }
}






