package Webinar10;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Magda", "Dziedzic", 28, 3, 2, "Zarządzamie");


        student.selfIntroduction();
        student.goOutside();
        student.checkAge();


        System.out.println("=======================================");


        String path = "src\\test\\java\\Webinar10\\plik.txt";
        Student newStudent1 = new Student(path);


    }



    }
