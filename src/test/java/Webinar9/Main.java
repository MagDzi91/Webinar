package Webinar9;


public class Main {
    public static void main(String[] args) {

        Student student = new Student("Magda", "Dz", 28, 2, 5, "Zarządzanie");
        student.selfIntroduction();
        student.goOutside();
        student.examMethod();
        student.indexInformation();

        System.out.println("=======================================");

        Teacher teacher = new Teacher("Karol", "Kobyłka", 32, 2666, "Profesor");
        teacher.selfIntroduction();
        teacher.examMethod();
        teacher.research();


    }
}
