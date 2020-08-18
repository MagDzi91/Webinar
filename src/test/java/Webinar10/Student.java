package Webinar10;

public abstract class Student extends Person {

    public static Object getIndexNumber = 21232132;
    private int semester;
    private int year;
    String fieldOfStudy;
    public String placeToGo;
    public String timeToGo;
    public String timeToStudy;
    public String placeToStudy;

    public Student(String name, String surname, int age, int semester, int year, String fieldOfStudy) {
        super(name, surname, age);
        this.semester = semester;
        this.year = year;
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public void selfIntroduction() {
        super.selfIntroduction();
        System.out.println("Studiuję na " + this.year + " roku " + this.semester + " semestru" + " na kierunku " + this.fieldOfStudy);

    }

    @Override
    public void tellAboutPurposeOfStudy() {
        System.out.println("Cel studiów: UCZĘ SIĘ");

    }

    @Override
    public void tellAboutHolidays() {
        System.out.println("Plan na wakacje: cziluje nad morzem");

    }

    public void goOutside() {
        placeToGo = "Bar za rogiem";
        timeToGo = "22:00";
        go();
    }
    private void go() {
        System.out.println(String.format("Wychodzę do: %s o godzinie: %s", placeToGo, timeToGo));
    }

}
