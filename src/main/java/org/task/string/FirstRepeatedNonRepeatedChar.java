package src.main.java.org.task.string;

import java.util.HashMap;

public class FirstRepeatedNonRepeatedChar {

    private static void firstRepeatedNonRepeated(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        char[] sArr = s.toCharArray();

        for (Character c : sArr) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }

        for (Character c : sArr) {

            if (map.get(c) == 1) {
                System.out.println("First Non Repeated Character is " + c);
                break;
            }

        }

        for (Character c : sArr) {

            if (map.get(c) > 1) {
                System.out.println("First Repeated Character is " + c);
                break;
            }

        }

    }

    public static void main(String[] args) {
        firstRepeatedNonRepeated("JavaConceptOfTheDay");
    }

}
