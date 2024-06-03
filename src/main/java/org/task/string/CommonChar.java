package src.main.java.org.task.string;

import java.util.Set;
import java.util.TreeSet;

public class CommonChar {

    private static String commonCharString(String a, String b) {

        char[] aArr = a.replaceAll("\\s", "").toCharArray();
        char[] bArr = b.replaceAll("\\s", "").toCharArray();

        Set<Character> aSet = new TreeSet<>();
        Set<Character> bSet = new TreeSet<>();

        for (char c : aArr) {
            aSet.add(c);
        }

        for (char c : bArr) {
            bSet.add(c);
        }

        aSet.retainAll(bSet);
        return aSet.toString();
    }

    public static void main(String[] args) {
        String s = commonCharString("sticks", "bricks");
        System.out.println("COMMON CHARACTERS " + s);
    }

}
