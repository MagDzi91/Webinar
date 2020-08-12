package Webinar9;

import Webinar8.Person;

public class Teacher extends Person {

    private double salary;
    private String degree;


    public Teacher(String name, String surname, int age, int salary, String degree) {
        super(name, surname, age);
        this.salary = salary;
        this.degree = degree;
    }

    @Override
    public void selfIntroduction() {
        super.selfIntroduction();
    }

    @Override
    public  void tellAboutPurposeOfStudy() {
        System.out.println("Cel studiów: NAUCZAM");
    }

    @Override
    public  void tellAboutHolidays() {
        System.out.println("Plan na wakacje: Jadę w góry");

    }
}
