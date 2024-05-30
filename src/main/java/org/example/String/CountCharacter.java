package src.main.java.org.example.String;

public class CountCharacter {

    static void count(String str, String c) {

        str = str.toLowerCase();
        c = c.toLowerCase();
        String s = str.replace(c, "");
        int count = str.length() - s.length();

        System.out.println("Number of occurrences of " + c + " in " + str + " = " + count);
    }

    public static void main(String[] args) {
        count("Java is java again java again", "j");
    }

}
