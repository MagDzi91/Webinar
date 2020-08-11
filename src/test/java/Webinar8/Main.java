package Webinar8;

public class Main {
    public static void main(String[] args) {

        Person[] persons = new Person[10];
        persons[0] = new Student("Beata", "Nowak", 30, 2, 3, "Zarządzanie");
        persons[1] = new Teacher("Kazik", "LALALA", 44, 1200, "profesor");
        persons[2] = new Student("Ola", "Nowak", 25, 1, 3, "Turystyka");
        persons[3] = new Student("Iga", "Iwaniak", 22, 1, 2, "Informatyka");
        persons[4] = new Student("Jakub", "Jakubiak", 30, 2, 3, "Zarządzanie");
        persons[4] = new Student("Radek", "Radkowski", 23, 2, 1, "Informatyka");
        persons[4] = new Student("Tomasz", "Tomczyk", 35, 3, 2, "Historia");
        persons[4] = new Student("Paweł", "Kowalski", 23, 2, 2, "Angielski");
        persons[1] = new Teacher("Krzysztof", "Niewypał", 42, 1500, "profesor");
        persons[1] = new Teacher("Aldona", "Niewyspana", 38, 1400, "profesor");

        Person.tellAboutYourself(persons[2]);

    }


}






