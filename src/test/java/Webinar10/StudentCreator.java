package Webinar10;

public class StudentCreator extends Student {
    public final static int MAX_AGE = 30;

    public StudentCreator(String name, String surname, int age, int semester, int year, String fieldOfStudy) {
        super(name, surname, age, semester, year, fieldOfStudy);
    }
}
