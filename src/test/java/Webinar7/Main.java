package Webinar7;

public class Main {
    public static void main(String[] args) {


        System.out.println("------------------------");
        Teacher teacher1 = new Teacher("Robert", "Dziedziczny", 25, 2500, "Profesor", 30000);
        teacher1.selfIntroduction();
        teacher1.calculateBonus();

        System.out.println("------------------------");
        Student student1 = new Student("Jowita", "Kulka", 24, 2, 3, "Zarządzanie");
        student1.selfIntroduction();
        }
    }

