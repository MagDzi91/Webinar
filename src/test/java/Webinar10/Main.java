package Webinar10;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Magda", "Dziedzic", 30, 3, 2, "Zarządzamie") {
            @Override
            public void selfIntroduction() {
                super.selfIntroduction();
            }
        };


        student.selfIntroduction();
        student.goOutside();
        student.checkAge();


        System.out.println("=======================================");


    }

}
