package src.main.java.org.task.string;

public class ApplicableSubString {

    private static void subString(String s) {
        int length = s.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String ss = s.substring(i, j);
                System.out.println(ss);
            }
        }

    }

    public static void main(String[] args) {
        subString("JAVA");
    }

}
