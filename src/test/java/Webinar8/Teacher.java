package Webinar8;

public class Teacher extends Person {

    private double salary;
    private String degree;


    public Teacher(String name, String surname, int age, int salary, String degree) {
        super(name, surname, age);
        this.salary = salary;
        this.degree = degree;
    }

    public void selfIntroduction() {
        System.out.println("cześć, jestem " + this.name + " " + this.surname + " i mam " + this.age + " lat");
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



