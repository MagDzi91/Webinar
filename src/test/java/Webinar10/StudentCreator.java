package Webinar10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StudentCreator {
    private static final String nameRegex = "name: (.*?),";
    private static final String surnameRegex = "surname: (.*?),";
    private static final String ageRegex = "age: (.*?),";
    private static final String semesterRegex = "semester: (.*?),";
    private static final String yearRegex = "year: (.*?),";
    private static final String fieldOfStudyRegex = "fieldOfStudy: (.*?),";

    public static Student createStudentFromFile(String pathToFile) {
        String fileContent = readFileByLine(pathToFile);
        String name = extractByRegex(nameRegex, fileContent);
        String surname = extractByRegex(surnameRegex, fileContent);
        String fieldOfStudy = extractByRegex(fieldOfStudyRegex, fileContent);
        int age = Integer.parseInt(extractByRegex(ageRegex, fileContent));
        int semestr = Integer.parseInt(extractByRegex(semesterRegex, fileContent));
        int year = Integer.parseInt(extractByRegex(yearRegex, fileContent));
        return new Student(name, surname, age, semestr, year, fieldOfStudy);
    }

    private static String readFileByLine(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    private static String extractByRegex(String regex, String content) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return "Not Found";
        }
    }
}
