package Webinar7;

public class Person {
    protected String name;
    protected String surname;
    protected int age;

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


    public void selfIntroduction() {
        System.out.println("cześć, jestem " + this.name + " " + this.surname + " i mam " + this.age + " lat");

    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

}

