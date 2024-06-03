package src.main.java.org.task.interview;

import java.util.Arrays;

public class Anagram {

    private static boolean areAnagram(String a, String b) {

        String first = a.replaceAll("\\s", "").toLowerCase();
        String last = b.replaceAll("\\s", "").toLowerCase();

        if (first.length() != last.length()) return false;

        char[] fArr = first.toCharArray();
        char[] lArr = last.toCharArray();

        Arrays.sort(fArr);
        Arrays.sort(lArr);

        return Arrays.equals(fArr, lArr);

    }

    public static void main(String[] args) {

        String a = "Integral";
        String b = "triangle";

        if (areAnagram(a, b)) System.out.println(a + " and " + b + "are Anagrams");
        else System.out.println(a + " and " + b + "are Not Anagrams");

    }

}

