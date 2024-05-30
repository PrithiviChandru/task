package src.main.java.org.example.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countEachCharacter {

    private static void count(String s) {
        String nS = s.replaceAll("\\s", "");
        char[] sArr = nS.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {

            if (map.containsKey(sArr[i]))
                map.put(sArr[i], map.get(sArr[i]) + 1);
            else
                map.put(sArr[i], 1);
        }

        Set<Character> set = map.keySet();
        for (Character c : set) {
            System.out.println(c + " : " + map.get(c));
        }

    }

    public static void main(String[] args) {
        count("Java J2EE Java JSP J2EE");
    }

}
