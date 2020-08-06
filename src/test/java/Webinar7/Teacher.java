package Webinar7;

public class Teacher extends Person {

    private int salary;
    private String degree;
    private int annualSalary;


    public Teacher(String name, String surname, int age, int salary, String degree, int annualSalary) {
        super(name, surname, age);
        this.salary = salary;
        this.degree = degree;
        this.annualSalary = annualSalary;
    }

    public void introduceYourself() {
        System.out.println("cześć, jestem " + this.name + " " + this.surname + " i mam " + this.age + " lat");
        System.out.println("--------------------");
    }

}



