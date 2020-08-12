package Webinar9;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person implements StudentFriendsTime, StudentMethods {

    public static Object getIndexNumber = 21232132;
    private int semester;
    private int year;
    private String fieldOfStudy;
    public final static int MAX_AGE = 30;
    public String placeToGo;
    public String timeToGo;
    public String timeToStudy;
    public String placeToStudy;

    public Student(String name, String surname, int age, int semester, int year, String fieldOfStudy) {
        super(name, surname, age);
        this.semester = semester;
        this.year = year;
        this.fieldOfStudy = fieldOfStudy;

        if (age>MAX_AGE){
            System.out.println("Jestes za stary na studiowanie, wynocha!");
            System.exit(0);
        }
    }

    @Override
    public void selfIntroduction() {
        super.selfIntroduction();
        System.out.println("Studiuję na " + this.year + " roku " + this.semester + " semestru" + " na kierunku " + this.fieldOfStudy);

    }

    @Override
    public void tellAboutPurposeOfStudy() {
        System.out.println("Cel studiów: UCZĘ SIĘ");

    }

    @Override
    public void tellAboutHolidays() {
        System.out.println("Plan na wakacje: cziluje nad morzem");

    }

    @Override
    public void goOutside() {
        placeToGo = "Bar za rogiem";
        timeToGo = "22:00";
        go();

    }
    private void go() {
        System.out.println(String.format("Wychodzę do: %s o godzinie: %s", placeToGo, timeToGo));
    }

    @Override
    public void examMethod() {
        placeToStudy = "Biblioteka";
        timeToStudy = "Zawsze na ostatnią chwilę";
        study();
    }

    private void study() {
        System.out.println(String.format("Zaczynam naukę: %s, w: %s", timeToStudy, placeToStudy));
    }

    public void indexInformation() {
        System.out.println("INFORMACJE O INDEKSIE: ");
        Map<String, Integer> index = new HashMap<String, Integer>();
        index.put("Angielski", 4);
        index.put("Historia", 3);
        index.put("Matematyka", 4);
        index.put("Zarządzanie", 3);
        System.out.println(index.toString() + " mój numer indeksu to "  + this.getIndexNumber) ;
    }
}

