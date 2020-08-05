package Webinar7;

public class Teacher extends Person {

    int salary = 5000;
    String degree = "Profesor";
    int annualSalary = salary * 12;
    double annualBonus = annualSalary * 0.10;


    public Teacher(String name, String surname, int age) {
        super(name, surname, age);
    }

    public void setNewTeacher () {
        System.out.println("cześć, jestem "+ this.getName() + " " + this.getSurname() + " i mam " + this.getAge() + " lat");
        System.out.println("Mój stopień naukowy to " + this.degree +" " + "i zarabiam " + this.salary + " PLN");
    }

    public void countAnnualSalary() {
        System.out.println("Moja roczna pensja wynosi " + annualSalary + " " + "PLN");
    }

    public void countAnnualBonus() {
        System.out.println("Moja roczna premia wynosi " + annualBonus + " " + "PLN");
    }
    }

