package Webinar10;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteToFile {

    public void writeToFile() {

        try {
            BufferedReader reader;
            try {
                reader = Files.newBufferedReader(Paths.get("C:\\Users\\MagdaDziedzic\\bootcamp\\GIT\\IntelliJ\\src\\test\\java\\Webinar10\\textfile.txt"), Charset.defaultCharset());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } finally {

        }
        ;

    }
}
