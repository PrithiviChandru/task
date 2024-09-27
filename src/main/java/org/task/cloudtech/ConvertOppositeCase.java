package src.main.java.org.task.cloudtech;

public class ConvertOppositeCase {

    public static String convert(StringBuffer str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
//                char lC = Character.toLowerCase(c);
                char lC = (char) (c + 32);
                str.setCharAt(i, lC);
            } else {
//                char uC = Character.toUpperCase(c);
                char uC = (char) (c - 32);
                str.setCharAt(i, uC);
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("CloudTech");
        System.out.println(convert(str));
    }

}
