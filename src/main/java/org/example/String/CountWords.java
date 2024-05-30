package src.main.java.org.example.String;

public class CountWords {

    static void count(String str) {

        int count = 1;
        String[] strArr = str.split(" ");
//        count = strArr.length;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') count++;
        }

        System.out.println("No of count " + str + " is " + count);

    }

    public static void main(String[] args) {
        count("Enter the string");
    }

}
