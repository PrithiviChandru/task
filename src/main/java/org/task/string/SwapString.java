package src.main.java.org.task.string;

import java.util.Scanner;

public class SwapString {

    private static void swap() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name");
        String s1 = scanner.nextLine();

        System.out.println("Enter Last Name");
        String s2 = scanner.nextLine();

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("First Name " + s1);
        System.out.println("Last Name " + s2);

    }

    public static void main(String[] args) {
        swap();
    }

}
