package src.main.java.org.task.concept;

public class Recursion {

    private static int count = 0;

    private static int n1 = 0, n2 = 1, n3 = 0;

    private static void hello() {
        count++;
        System.out.println("hello " + count);

        if (count < 5) hello();
    }

    static int factorial(int n) {
        if (n == 1) return 1;
        else return n * factorial(n - 1);
    }

    static void fibonacci(int count) {

        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);
            fibonacci(count - 1);
        }

    }

    public static void main(String[] args) {

        System.out.println("************ RECURSION BASIC ************");
        hello();

        System.out.println("************ FACTORIAL ************");
        System.out.println(factorial(3));                       // 3 * 2 * 1 = 6

        System.out.println("************ FIBONACCI ************");
        System.out.print(n1 + " " + n2);
        fibonacci(15 - 2);
        System.out.println();

    }

}
