package Webinar8;

public class Main {
    public static void main(String[] args) {


        System.out.println("------------------------");
        Teacher teacher1 = new Teacher("Robert", "Dziedziczny", 25, 2500, "Profesor") {
            public void purposeOfStudy() {
                System.out.println("Cel studiów: NAUCZAM");
            }

            public void holidays() {
                System.out.println("Plan na wakacje: cziluje nad morzem");
            }
        };

        teacher1.selfIntroduction();
        teacher1.calculateBonus();
        teacher1.purposeOfStudy();
        teacher1.holidays();

        System.out.println("------------------------");
        Student student1 = new Student("Jowita", "Kulka", 24, 2, 3, "Zarządzanie") {
            public void purposeOfStudy() {
                System.out.println("Cel studiów: UCZĘ SIĘ");
            }

            public void holidays() {
                System.out.println("Plan na wakacje: cziluje nad morzem");
            }
        };

        student1.selfIntroduction();
        student1.purposeOfStudy();
        student1.holidays();
    }

//    Person person = new Person() {
//        @Override
//        public void purposeOfStudy() {
//            System.out.println("Cel studiów: UCZĘ SIĘ");
//        }
//
////        @Override
////        public void holidays() {
//
//        }
    };






