package Webinar10;

public class StudentCreator {
    public final static int MAX_AGE = 30;

    public void checkAge(String name, String surname, int age, int semester, int year, String fieldOfStudy) {
        if (age >= MAX_AGE) {
            System.out.println("Jesteś za stary");
        } else {
            System.out.println("Wiek poniżej 30 lat - OK");
        }

    }
}

