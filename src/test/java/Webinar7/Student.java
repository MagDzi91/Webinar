package Webinar7;

public class Student extends Person {

    int semester = 2;
    int year = 3;
    String fieldOfStudy = "Zarządzanie";



    public Student (String name, String surname, int age) {
        super(name, surname, age);
    }

    public void setNewStudent () {
        System.out.println("cześć, jestem "+ this.getName() + " " + this.getSurname() + " i mam " + this.getAge() + " lat");
        System.out.println("Studiuję na " + this.year + " roku " + this.semester + " semestru" + " na kierunku " + this.fieldOfStudy);

    }


}
