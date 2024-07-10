package src.main.java.org.task.interview;

public class Fibonacci {

    private static int n1 = 1, n2 = 2, n3 = 0;

    private static void printNumber(int n) {

        if (n <= 2) return;

        if (n > 0) {

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3 % 10);

//            String s = String.valueOf(n3);
//            int l = s.toCharArray().length;
//            if (l > 1) System.out.print(" " + s.substring(l - 1));
//            else System.out.print(" " + n3);

            printNumber(n - 1);

        }

    }

    public static void main(String[] args) {

        System.out.print(n1 + " " + n2);
        printNumber(8);
        System.out.println();

    }

}
