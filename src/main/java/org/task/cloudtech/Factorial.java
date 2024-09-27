package src.main.java.org.task.cloudtech;

public class Factorial {

    public static int factorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static int factorialRec(int n) {
        if (n == 0) return 1;
        return n * factorialRec(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial by Loop " + factorial(5));
        System.out.println("Factorial by Recursion " + factorialRec(6));
    }

}
