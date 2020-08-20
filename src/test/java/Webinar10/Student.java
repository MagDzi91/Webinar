package Webinar10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Student extends Person {

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

    public Student (String filePath) {
        String fileContent = readByLine(filePath);
        String nameRegex = "/name: (.+?),/";
        System.out.println(cutByRegex(fileContent, nameRegex));

    }

    private static java.lang.String readByLine(String filePath)
    {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    private static String cutByRegex(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        matcher.matches();
        return matcher.group(1);
//        assertEquals("Zygmunt", matcher.group(1));
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
