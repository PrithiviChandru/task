package src.main.java.org.task.cloudtech;

public class Fibonacci {

    public static void fibonacci(int n) {
        int n1 = 0, n2 = 1;
        int counter = 0;
        while (counter < n) {
            System.out.println(n1);
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            counter++;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }

}
