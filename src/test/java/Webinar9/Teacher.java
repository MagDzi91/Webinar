package Webinar9;


public class Teacher extends Person implements TeacherExamMethods, TeacherScientificWork {

    private double salary;
    private String degree;


    public Teacher(String name, String surname, int age, int salary, String degree) {
        super(name, surname, age);
        this.salary = salary;
        this.degree = degree;
    }

    @Override
    public void selfIntroduction() {
    }

    @Override
    public  void tellAboutPurposeOfStudy() {
        System.out.println("Cel studiów: NAUCZAM");
    }

    @Override
    public  void tellAboutHolidays() {
        System.out.println("Plan na wakacje: Jadę w góry");

    }

    @Override
    public void writeScientificWork(String writeMethodName) {

    }

    @Override
    public void research(String researchMethodName) {

    }

    @Override
    public void examMethod(String examMethodName) {

    }
}
