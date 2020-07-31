package Webinar6;
import java.io.UnsupportedEncodingException;


public class Strings {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String text = "Na wyścigach wyścigowych wyścigówek wyścigowych wyścigówka wyścigowa wyścignęła wyścigówkę wyścigową numer sześć.";
        char one ='w';
        char two = 'o';
        int count1 = 0;
        int count2 = 0;

        //zliczanie znaków
        for(int i=0; i < text.length(); i++) {
            if (text.charAt(i) == one) {
                count1++;
            }
            if (text.charAt(i) == two) {
                count2++;
            }
        }
        System.out.println("Znak 'w' występuje " + count1 + " razy");
        System.out.println("Znak 'o' występuje " + count2 + " razy");


        //długość każdego wyrazu



        //kopia tekstu


        //zmiana znaków
        System.out.println(text.replace("wyścig", "nowa")) ;

    }
}

