package Webinar6;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;


public class Strings {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String text = "Na wyścigach wyścigowych wyścigówek wyścigowych wyścigówka wyścigowa wyścignęła wyścigówkę wyścigową numer sześć.";

        //zliczanie znaków
        char one ='w';
        char two = 'o';
        int count1 = 0;
        int count2 = 0;
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


        //długość każdego wyrazu i długość tekstu

        System.out.println("Długość tekstu to " + text.length());
        String[] splited = text.split(" "); //każdy wyraz rozdzielony spacją, przechowywany jest w tablicy
        System.out.println("w tablicy jest " + splited.length + " wyrazów");
        String word1 = splited[0];
        String word2 = splited[1];
        String word3 = splited[2];
        String word4 = splited[3];
        String word5 = splited[4];
        String word6 = splited[5];
        String word7 = splited[6];
        String word8 = splited[7];
        String word9 = splited[8];
        String word10 = splited[9];
        String word11 = splited[10];
        String word12 = splited[11];

        System.out.println(("Słowo nr 1 ma " + word1.length() + " znaków"));
        System.out.println(("Słowo nr 2 ma " + word2.length() + " znaków" + "...i tak dalej"));


        //kopia tekstu i zamiana znaków
        String text2 = text;
        System.out.println(text2.replace("wyścig", "nowa")) ;

        //Stwórz 2 nowe ciągi (String) z których jeden będzie zawierał 2 pierwsze i 2 ostatnie słowa ciągu bazowego, a drugi wszystkie pozostałe

        String text3 = word1 + " " + word2 + " " + word11 + " " + word12;
        System.out.println(text3);
        String text4 = word3 + " " + word4 + " " + word5 + " " + word6 + " " + word7 + " " + word8 + " " + word9 + " " + word10;
        System.out.println(text4);

        //sortowanie alfabetyczne
        String text5 = text4;


    }
}

