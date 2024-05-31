package src.main.java.org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountWords {

    private static int countWords(String str) {

        int count = 1;
        String[] strArr = str.split(" ");
//        count = strArr.length;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') count++;
        }

        return count;
    }

    private static int countSpecificCharacter(String str, String c) {

        str = str.toLowerCase();
        c = c.toLowerCase();
        String s = str.replace(c, "");
        int count = str.length() - s.length();

        return count;
    }


    private static void countEachCharacter(String s) {
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

    private static int countDuplicate(String str) {
        int result = 0;

        String[] strArr = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            if (map.containsKey(strArr[i].toLowerCase()))
                map.put(strArr[i].toLowerCase(), map.get(strArr[i].toLowerCase()) + 1);
            else
                map.put(strArr[i].toLowerCase(), 1);
        }

        Set<String> set = map.keySet();
        for (String s : set) {
            if (map.get(s) > 1) result = map.get(s);
        }

        return result;
    }


    public static void main(String[] args) {
        int cWords = countWords("Enter the string");
        System.out.println("WORDS COUNT " + cWords);

        int cSC = countSpecificCharacter("Java is java again java again", "j");
        System.out.println("SPECIFIC CHARACTER COUNT " + cSC);

        countEachCharacter("Java J2EE Java JSP J2EE");

        int duplicate = countDuplicate("Super Man Bat Man Spider Man");
        System.out.println("DUPLICATE WORDS COUNT " + duplicate);
    }

}
