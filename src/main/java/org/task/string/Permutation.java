package src.main.java.org.task.string;

/**
 * PERMUTATION OF abc
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 */
public class Permutation {

    private static void permutation(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            String first = str.substring(0, i);
            String last = str.substring(i + 1);
            String res = first + last;

            permutation(res, ans + c);

        }

    }

    public static void main(String[] args) {
        permutation("abc", "");
    }

}
