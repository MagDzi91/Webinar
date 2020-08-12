package Webinar9;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

     Map<String, Integer> index = new HashMap<String, Integer>();
        index.put("Angielski", 4);
        index.put("Historia", 3);
        index.put("Matematyka", 4);
        index.put("Zarządzanie", 3);
        System.out.println(index.toString());
    }
}
