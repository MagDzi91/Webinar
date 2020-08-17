package Webinar10;

public abstract class Person {
    private String name;
    private String surname;
    private int age;

    public Person() {
        this.name = "unknown";
        this.surname = "unknown";
        this.age = 0;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public abstract void tellAboutPurposeOfStudy();

    public abstract void tellAboutHolidays();

    public void selfIntroduction() {
        System.out.println("cześć, jestem " + this.name + " " + this.surname + " i mam " + this.age + " lat");

    }

}
