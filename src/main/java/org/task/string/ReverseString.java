package src.main.java.org.task.string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseString {

    private static String reverseString(String s) {

        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    private static String reverseSpacePosition(String s) {

        char[] result = new char[s.length()];
        for (int i = 0; i < result.length; i++) {
            if (s.charAt(i) == ' ')
                result[i] = ' ';
        }

        String rString = reverseString(s).replaceAll("\\s", "");
        char[] rArr = rString.toCharArray();
        List<Character> list = new ArrayList<>();
        for (Character c : rArr) {
            list.add(c);
        }

        Iterator<Character> iterator = list.iterator();
        for (int j = 0; j < result.length; j++) {

            if (!(result[j] == ' ')) {
                result[j] = iterator.next();
            }

        }

        return new String(result);
    }

    private static String reverseEachWords(String s) {

        StringBuilder sb = new StringBuilder();
        String[] sArr = s.split(" ");

        for (String e : sArr) {
            sb.append(reverseString(e));
            sb.append(" ");
        }

        return sb.toString();
    }

    private static String reverseWords(String s) {

        String[] sArr = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = sArr.length - 1; i >= 0; i--) {
            sb.append(sArr[i]);
            sb.append(" ");
        }

        return sb.toString();
    }

    private static String rotationString(String s1, String s2) {

        String result = "";

        if (s1.length() != s2.length()) {
            System.out.println("Not Rotation String");
        } else {

            String s3 = s1 + s1;
            if (s3.contains(s2)) {
                result = "Rotation String";
            } else {
                result = "Not Rotation String";
            }

        }

        return result;
    }


    public static void main(String[] args) {
        String rString = reverseString("My Java");
        System.out.println("REVERSE STRING : " + rString);

        String rpString = reverseSpacePosition("I Am Not String");
        System.out.println("REVERSE STRING SPACE POSITION : " + rpString);

        String reWords = reverseEachWords("Java Concept Of The Day");
        System.out.println("REVERSE STRING EACH WORDS : " + reWords);

        String rWords = reverseWords("Java Concept Of The Day");
        System.out.println("REVERSE STRING WORDS : " + rWords);

        String rotation = rotationString("StrutsHibernateJavaJ2ee", "J2eeStrutsHibernateJava");
        System.out.println(rotation);
    }

}
