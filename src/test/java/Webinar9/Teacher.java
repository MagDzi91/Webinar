package Webinar9;


public class Teacher extends Person implements TeacherExamMethods, TeacherScientificWork {

    private double salary;
    private String degree;
    private String place;
    private String tools;
    private boolean passedExams;


    public Teacher(String name, String surname, int age, int salary, String degree) {
        super(name, surname, age);
        this.salary = salary;
        this.degree = degree;
    }

    public void selfIntroduction() {
        super.selfIntroduction();
    }

    @Override
    public void tellAboutPurposeOfStudy() {
        System.out.println("Cel studiów: NAUCZAM");
    }

    @Override
    public void tellAboutHolidays() {
        System.out.println("Plan na wakacje: Jadę w góry");

    }

    @Override
    public void writeScientificWork() {

    }

    @Override
    public void research() {
        place = "Labolatorium badawcze";
        tools = "Sprzęt labolatoryjny";

        letsResearch();


    }

    private void letsResearch() {
        System.out.println(String.format("Zwykle pracuje w : %s i używam do tego: %s", place, tools));
    }

    @Override
    public void examMethod() {



    }

    ;
}
