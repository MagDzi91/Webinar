package Webinar7;

public class Main {
    public static void main(String[] args) {


        System.out.println("------------------------");
        Teacher teacher1 = new Teacher("Robert", "Dziedziczny", 25, 2500, "Profesor", 30000);
        teacher1.introduceYourself();

        System.out.println("------------------------");
        Student student1 = new Student("Jowita", "Kulka", 24);
        student1.selfIntroduction();
        student1.setNewStudent();
        }
    }

