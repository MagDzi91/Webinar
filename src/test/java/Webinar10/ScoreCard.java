package Webinar10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ScoreCard {

    private Map<String, Integer> index = new HashMap<>(3);

    public void createRandomIndexNumber() {
        int numbers[] = { 1324234,2434343,33423,4212323,5464645,6234223,74353,85345346,935345345};
        Random random = new Random();
        int n = random.nextInt(8);
        System.out.println("Mój numer indeksu to " + numbers[n]);
    }

}





