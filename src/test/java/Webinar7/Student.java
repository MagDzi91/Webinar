package Webinar7;

public class Student extends Person {

    int semester;
    int year;
    String fieldOfStudy;


    public Student(String name, String surname, int age, int semester, int year, String fieldOfStudy) {
        super(name, surname, age);
        this.semester = semester;
        this.year = year;
        this.fieldOfStudy = fieldOfStudy;
    }

    public void selfIntroduction() {
        System.out.println("cześć, jestem " + this.name + " " + this.surname + " i mam " + this.age + " lat");
        System.out.println("Studiuję na " + this.year + " roku " + this.semester + " semestru" + " na kierunku " + this.fieldOfStudy);


    }


}
