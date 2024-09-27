package src.main.java.org.task.cloudtech;

public class RotateArray {

    public static void rotate(int[] a, int n) {

        for (int i = 0; i < n; i++) {
            int first = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = first;
        }
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = 3;
        rotate(a, n);
    }

}
