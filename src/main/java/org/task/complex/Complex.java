package src.main.java.org.task.complex;

import java.io.*;
import java.util.HashMap;

public class Complex {

    public static void main(String[] args) {

        System.out.println("************ FIBONACCI ************");
        System.out.print(n1 + " " + n2);
        fibonacci(8);
        System.out.println();

        System.out.println("************ FACTORIAL ************");
        System.out.println(factorial(5));

        System.out.println("************ FILE WRITER ************");
        writer();

        System.out.println("************ FILE READER ************");
        reader();

        System.out.println("************ APPLICABLE SUB STRING ************");
        applicable("java");

        System.out.println("************ SWAP STRING ************");
        swap("hello", "world");

        System.out.println("************ LONGEST SUB STRING WITHOUT DUPLICATE ************");
        longestSubstring("ABCDEFGABEF");

        System.out.println("************ PERMUTATION ************");
        permutation("abc", "");

        System.out.println("************ LONGEST PALINDROME SUB STRING ************");
        System.out.println(longestPalindromeSubstring("caba"));

    }

    private static int n1 = 1, n2 = 2, n3 = 0;

    /**
     * FIBONACCI SERIES
     */
    private static void fibonacci(int n) {

        if (n <= 2) return;

        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3 % 10);
            fibonacci(n - 1);
        }

    }

    /**
     * FACTORIAL
     */
    private static int factorial(int n) {
        if (n == 1) return 1;
        else return n * factorial(n - 1);
    }

    /**
     * FILE WRITER
     */
    private static void writer() {

        FileWriter fW = null;
        BufferedWriter bW = null;
        PrintWriter pW = null;

        try {

            fW = new FileWriter("D:\\new.txt", true);
            bW = new BufferedWriter(fW);
            pW = new PrintWriter(bW);

            pW.println("Pruthiviraj C");
            pW.println("Java Developer");
            pW.println();
            System.out.println("FILE WRITING SUCCESS");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pW.close();
                bW.close();
                fW.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * FILE READER
     */
    private static void reader() {

        FileReader fR = null;
        BufferedReader bR = null;

        try {

            fR = new FileReader("D:\\new.txt");
            bR = new BufferedReader(fR);
            String rL = bR.readLine();

            while (rL != null) {
                System.out.println(rL);
                rL = bR.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bR.close();
                fR.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * APPLICABLE SUB STRING
     */
    private static void applicable(String s) {

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }

    }

    /**
     * SWAP STRING
     */
    private static void swap(String a, String b) {

        a = a + b;

        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println(a + " " + b);

    }

    /**
     * LONGEST SUB STRING WITHOUT DUPLICATE
     */
    private static void longestSubstring(String s) {

        char[] sArr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        String subString = null;
        int subLength = 0;

        for (int i = 0; i < sArr.length; i++) {

            char c = sArr[i];

            if (!map.containsKey(c)) {
                map.put(c, i);
            } else {
                i = map.get(c);
                map.clear();
            }

            if (map.size() > subLength) {
                subLength = map.size();
                subString = map.keySet().toString();
            }

        }

        System.out.println(subLength + " " + subString);
    }

    /**
     * PERMUTATION
     */
    private static void permutation(String s, String a) {

        if (null == s || s.length() == 0) {
            System.out.println(a);
            return;
        }

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            String first = s.substring(0, i);
            String last = s.substring(i + 1);
            String result = first + last;

            permutation(result, a + c);

        }

    }

    /**
     * LONGEST PALINDROME SUB STRING HELPER
     */
    private static int expandAroundCenter(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    /**
     * LONGEST PALINDROME SUB STRING
     */
    private static String longestPalindromeSubstring(String input) {

        if (null == input || input.length() == 0) return "";
        if (input.length() == 1) return input;

        int start = 0;
        int subLength = 0;
        for (int i = 0; i < input.length(); i++) {
            int l1 = expandAroundCenter(input, i, i);
            int l2 = expandAroundCenter(input, i, i + 1);
            int length = Math.max(l1, l2);

            if (length > subLength) {
                start = i - (length - 1) / 2;
                subLength = length;
            }
        }

        return input.substring(start, start + subLength);
    }

}
