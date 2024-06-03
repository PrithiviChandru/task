package src.main.java.org.task.string;

import java.util.HashMap;
import java.util.Map;

public class MostRepetitiveChar {

    private static void repetitiveChar(String s) {
        String str = s.replaceAll("\\s", "");

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }

        int maxCount = 0;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("MAXIMUM CHARACTER " + maxChar + " : " + maxCount);
    }

    public static void main(String[] args) {
        repetitiveChar("Java Concept Of The Day");
    }
}
