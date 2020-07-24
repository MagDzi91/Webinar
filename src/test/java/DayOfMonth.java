
import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {

        String[] month = new String[13];
        month[0] = "Zacznij od jedynki :P";
        month[2] = "Styczeń";
        month[2] = "Luty";
        month[3] = "Marzec";
        month[4] = "Kwiecień";
        month[5] = "Maj";
        month[6] = "Czerwiec";
        month[7] = "Lipiec";
        month[8] = "Sierpień";
        month[9] = "Wrzesień";
        month[10] = "Październik";
        month[11] = "Listopad";
        month[12] = "Grudzień";

        System.out.println("Podaj numer miesiąca");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        if (Integer.parseInt(name) > 12 || Integer.parseInt(name) <0) {
            System.out.println("nie ma takiego miesiąca");
        } else {

            Integer.parseInt(name);
            System.out.println(month[Integer.parseInt(name)]);
            
        }
    }
}






