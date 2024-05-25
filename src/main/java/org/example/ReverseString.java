package org.example;

public class ReverseString {

    private static void reverseString(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        reverseString("vijay");
    }

}
