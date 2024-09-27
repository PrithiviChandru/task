package src.main.java.org.task.cloudtech;

import java.util.Arrays;

public class Find2ndLargest {

    public static int secondLargest(int[] a) {
        int i, j, temp, swaps;
        int n = a.length;

        // Bubble Sort
        for (i = n - 2; i >= 0; i--) {
            swaps = 0;
            for (j = 0; j <= i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) break;
        }
//        Arrays.sort(a);

        for (int k = n - 2; k >= 0; k--) {
            if (a[k] != a[n - 1]) {
                return a[k];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 3, 1, 6, 88, 65, 88, 88};
//        int[] a = {2, 2, 2, 2, 2};
//        int[] a = {3};

        int s = secondLargest(a);
        if (s >= 0) System.out.println("Second Largest " + s);
        else System.out.println("There is no Second Largest");
    }

}
