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


    }

}
