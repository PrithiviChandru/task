package src.main.java.org.example;

public class Palindrome {

    private static boolean palindrome(String s) {

        String str = s.replaceAll("\\s", "");
        char[] sArr = str.toCharArray();
        int forward = 0;
        int backward = sArr.length - 1;

        while (forward <= backward) {
            if (sArr[forward] != sArr[backward]) {
                return false;
            }

            forward++;
            backward--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Palindrome " + palindrome("1221"));
        System.out.println("Palindrome " + palindrome("Level"));
        System.out.println("Palindrome " + palindrome("rotator"));
    }

}
