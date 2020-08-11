package Webinar8;

public class Student extends Person {

    private int semester;
    private int year;
    private String fieldOfStudy;
    public final static int MAX_AGE = 30;

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
}
