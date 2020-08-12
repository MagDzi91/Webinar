package Webinar9;

import Webinar8.Person;
import Webinar8.Student;
import Webinar8.Teacher;

public class Main {
    public static void main(String[] args) {

        Webinar8.Person[] persons = new Webinar8.Person[10];
        persons[0] = new Webinar8.Student("Beata", "Nowak", 30, 2, 3, "Zarządzanie");
        persons[1] = new Webinar8.Teacher("Kazik", "LALALA", 44, 1200, "profesor");
        persons[2] = new Webinar8.Student("Ola", "Nowak", 25, 1, 3, "Turystyka");
        persons[3] = new Webinar8.Student("Iga", "Iwaniak", 22, 1, 2, "Informatyka");
        persons[4] = new Webinar8.Student("Jakub", "Jakubiak", 30, 2, 3, "Zarządzanie");
        persons[5] = new Webinar8.Student("Radek", "Radkowski", 23, 2, 1, "Informatyka");
        persons[6] = new Webinar8.Student("Tomasz", "Tomczyk", 25, 3, 2, "Historia");
        persons[7] = new Student("Paweł", "Kowalski", 23, 2, 2, "Angielski");
        persons[8] = new Webinar8.Teacher("Krzysztof", "Niewypał", 42, 1500, "profesor");
        persons[9] = new Teacher("Aldona", "Niewyspana", 38, 1400, "profesor");

        Person.tellAboutYourself(persons[7]);

    }
}
