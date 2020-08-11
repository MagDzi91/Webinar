package Webinar8;

public abstract class Student extends Person {

    private int semester;
    private int year;
    private String fieldOfStudy;


    public Student(String name, String surname, int age, int semester, int year, String fieldOfStudy) {
        super(name, surname, age);
        this.semester = semester;
        this.year = year;
        this.fieldOfStudy = fieldOfStudy;
    }

    public static int age = 30;

    public abstract void purposeOfStudy();

    public abstract void holidays();

    public void selfIntroduction() {
        System.out.println("cześć, jestem " + this.name + " " + this.surname + " i mam " + this.age + " lat");
        System.out.println("Studiuję na " + this.year + " roku " + this.semester + " semestru" + " na kierunku " + this.fieldOfStudy);

    }
}
