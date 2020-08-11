package Webinar8;

public abstract class Person {
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
    public abstract void purposeOfStudy();

    public abstract void holidays();


//    public void selfIntroduction() {
//        System.out.println("cześć, jestem " + this.name + " " + this.surname + " i mam " + this.age + " lat");
//    }

    public final void selfIntroductionFinal() {
        System.out.println("cześć, jestem " + this.name + " " + this.surname + " i mam " + this.age + " lat");


    }





}

