package Webinar7;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Teacher extends Person {

    int salary;
    String degree;
    int annualSalary;


    public Teacher(String name, String surname, int age) {
        super(name, surname, age);
    }

    public void setNewTeacher () {
        System.out.println("Podaj swój stopień naukowy");
        Scanner scan = new Scanner(System.in);
        String degree = scan.nextLine();
        System.out.println("Podaj swoją miesięczną pensję");
        int salary = scan.nextInt();
        System.out.println("Mój stopień naukowy to " + degree + " " + "i zarabiam " + salary + " PLN");
        int annualSalary = salary * 12;
        System.out.println("Moja roczna pensja wynosi " + annualSalary + " " + "PLN");
        double annualBonus = annualSalary * 0.1;
        System.out.println("Moja roczna premia wynosi " + annualBonus + " " + "PLN");

    }
    }


