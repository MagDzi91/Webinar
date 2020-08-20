package Webinar10;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student("Magda", "Dziedzic", 28, 3, 2, "Zarządzamie");
//
//
//        student.selfIntroduction();
//        student.goOutside();
//        student.checkAge();


        System.out.println("=======================================");

        String currentRelativePath = Paths.get("src/test/java/Webinar10").toAbsolutePath().toString();
        String pathToFile = Paths.get(currentRelativePath, "plik.txt").toString();
        Student student1 = StudentCreator.createStudentFromFile(pathToFile);
        student1.selfIntroduction();

    }
}
