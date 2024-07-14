package src.main.java.org.task.interview;

public class PalindromeSubString {

    private int expandAroundCenter(String input, int left, int right) {

        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    private String longestPalindrome(String input) {

        if (null == input || input.length() < 1) return "";
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

    public static void main(String[] args) {

        PalindromeSubString palindrome = new PalindromeSubString();

        String ls = palindrome.longestPalindrome("caba");
        System.out.println("LONGEST SUB STRING " + ls);

    }
}
