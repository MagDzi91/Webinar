package Webinar10;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Magda", "Dziedzic", 28, 3, 2, "Zarządzamie");

        student.selfIntroduction();
        student.goOutside();
        student.checkAge();

        System.out.println("=======================================");

        Student student2= StudentCreator.createStudentFromFile()


        System.out.println("=======================================");

        Teacher teacher = new Teacher("Julian", "Kulka", 43, 2, 3);
        teacher.selfIntroduction();
        teacher.tellAboutPurposeOfStudy();
        teacher.tellAboutHolidays();
        teacher.examMethod();
        teacher.workMethod();
        teacher.writeMethod();

        System.out.println("=======================================");

        ScoreCard scoreCard = new ScoreCard();
        scoreCard.createRandomIndexNumber();




    }



    }
