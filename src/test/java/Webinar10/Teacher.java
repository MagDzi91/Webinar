package Webinar10;

public class Teacher extends Person implements ExamConducter{

    private int semester;
    private int year;

    public Teacher(String name, String surname, int age, int semester, int year) {
        super(name, surname, age);
        this.semester = semester;
        this.year = year;
    }

    @Override
    public void tellAboutPurposeOfStudy() {

    }

    @Override
    public void tellAboutHolidays() {

    }

    @Override
    public void examMethod() {

    }

    @Override
    public void workMethod() {

    }

    @Override
    public void writeMethod() {

    }
}
