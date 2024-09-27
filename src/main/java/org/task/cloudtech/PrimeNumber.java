package src.main.java.org.task.cloudtech;

public class PrimeNumber {

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("********** Find Prime Number **********");
        int n = 5;
        if (isPrime(n)) System.out.println(n + " is a prime number");
        else System.out.println(n + " is not a Prime Number");

        System.out.println();
        System.out.println("********** Prime Number 1 to 100 **********");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) System.out.println(i + " is a prime number");
        }
    }

}
