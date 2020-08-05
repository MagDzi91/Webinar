package Webinar7;

public class Main {
    public static void main(String[] args) {
        Person x = new Person("Magda", " Dziedzic", 29);
        Person y = new Person("Grześ", " Nowak", 13);
        Person z = new Person("Kuba", " Kowalski", 33);

        x.selfIntroduction();
        y.selfIntroduction();
        z.selfIntroduction();

        System.out.println("------------------------");
        Teacher teacher1 = new Teacher("Robert", "Dziedziczny", 25);
        teacher1.setNewTeacher();
        teacher1.countAnnualSalary();
        teacher1.countAnnualBonus();

        System.out.println("------------------------");
        Student student1 = new Student("Jowita", "Kulka", 24);
        student1.setNewStudent();
        }
    }

