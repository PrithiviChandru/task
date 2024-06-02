package src.main.java.org.example;

import java.text.DecimalFormat;

public class CharacterPercentage {

    private static void percentage(String s) {

        char[] sArr = s.toCharArray();

        int lowerCase = 0;
        int upperCase = 0;
        int digits = 0;
        int specialCase = 0;
        for (int i = 0; i < sArr.length; i++) {
            if (Character.isLowerCase(sArr[i]))
                lowerCase++;
            else if (Character.isUpperCase(sArr[i]))
                upperCase++;
            else if (Character.isDigit(sArr[i]))
                digits++;
            else
                specialCase++;
        }

        double lcP = lowerCase * 100.0 / sArr.length;
        double ucP = upperCase * 100.0 / sArr.length;
        double dP = digits * 100.0 / sArr.length;
        double scP = specialCase * 100.0 / sArr.length;

        DecimalFormat format = new DecimalFormat("##.##");

        System.out.println("LOWER CASE PERCENTAGE " + format.format(lcP) + "%");
        System.out.println("UPPER CASE PERCENTAGE " + format.format(ucP) + "%");
        System.out.println("DIGITS PERCENTAGE " + format.format(dP) + "%");
        System.out.println("SPECIAL CASE PERCENTAGE " + format.format(scP) + "%");

    }

    private static void immutable() {

        String s1 = new String("JAVA");
        System.out.println(s1);

        s1.concat("J2EE");
        System.out.println(s1);

    }

    public static void main(String[] args) {
        percentage("Tiger Runs @ The Speed Of 100 km/hour.");
        immutable();
    }

}
