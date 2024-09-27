package src.main.java.org.task.cloudtech;

public class Palindrome {

    public static boolean isPalindrome(int n) {
        int reminder = 0, reverseNumber = 0, temp = n;

        while (n > 0) {
            reminder = n % 10;
            reverseNumber = (reverseNumber * 10) + reminder;
            n = n / 10;
        }

        return reverseNumber == temp;
    }

    public static void main(String[] args) {
        int n = 454;
        if (isPalindrome(n)) System.out.println(n + " is a Palindrome Number");
        else System.out.println(n + " is not a Palindrome number");
    }
}
