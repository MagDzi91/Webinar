package Webinar10;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Magda", "Dziedzic", 28, 3, 2, "Zarządzamie") {
            @Override
            public void selfIntroduction() {
                super.selfIntroduction();
            }
        };


        student.selfIntroduction();
        student.goOutside();


        System.out.println("=======================================");

        StudentCreator creator = new StudentCreator() {


            @Override
            public void checkAge(String name, String surname, int age, int semester, int year, String fieldOfStudy) {
                super.checkAge(name, surname, age, semester, year, fieldOfStudy);
            }
        };

        creator.checkAge("Ala", "Nowak", 10, 3, 2, "Turystyka");
    }

}
