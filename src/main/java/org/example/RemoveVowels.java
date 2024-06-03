package src.main.java.org.example;

public class RemoveVowels {

    private static String removeVowels(String s) {

        String str = s.replaceAll("[AEIOUaeiou]", "");
        return str;

    }

    public static void main(String[] args) {
        String rV = removeVowels("Java Concept Of The Day");
        System.out.println("WITHOUT VOWELS " + rV);
    }

}
