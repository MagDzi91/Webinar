package Webinar7;

import java.util.Scanner;

public class Student extends Person {

    int semester;
    int year;
    String fieldOfStudy;



    public Student (String name, String surname, int age) {
        super(name, surname, age);
    }

    public void setNewStudent () {
        System.out.println("Podaj kierunek studiów");
        Scanner scan = new Scanner(System.in);
        String fieldOfStudy = scan.nextLine();
        System.out.println("Podaj rok");
        int year = scan.nextInt();
        System.out.println("Podaj nr semestru");
        int semester = scan.nextInt();

        System.out.println("Studiuję na " + this.year + " roku " + this.semester + " semestru" + " na kierunku " + this.fieldOfStudy);


    }


}
