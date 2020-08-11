package Webinar8;

public abstract class Teacher extends Person {

    private double salary;
    private String degree;
    private double annualSalary;
    private double annualBonus;


    public Teacher(String name, String surname, int age, int salary, String degree) {
        super(name, surname, age);
        this.salary = salary;
        this.degree = degree;
    }

    public void selfIntroduction() {
        System.out.println("cześć, jestem " + this.name + " " + this.surname + " i mam " + this.age + " lat");
    }

    public abstract void purposeOfStudy();
    public abstract void holidays();

    public void calculateBonus() {
        this.annualSalary = this.salary * 12;
        this.annualBonus = annualSalary * 0.1;
        System.out.println("Mój stopień naukowy to " + this.degree + " " + "zarabiam " + this.salary + " " + "więc moja roczna pensja wynosi " + this.annualSalary + " a roczna premia jest równa "+ this.annualBonus);


    }

}



