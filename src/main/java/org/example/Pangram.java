package org.example;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

    private static boolean isPangram(String str) {

        String s = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        Set<Character> set = new HashSet<>();

        for (Character c : s.toCharArray()) {
            set.add(c);
        }

        return set.size() == 26;

    }

    public static void main(String[] args) {

        String str = "The quick brown fox jumps over 1the 6lazy 8dog.";

        if (isPangram(str)) System.out.println(str + " is Pangrams");
        else System.out.println(str + " is Not Pangrams");

    }

}
