import java.util.*;
import java.lang.*;
import java.io.*;

class SelectionSort {

    private static void selectionSort(int[] a, int n){
        int i, j, temp, minIndex;

        for(i=0; i<n-1; i++){
            minIndex = i;

            for (j=i+1; j<n; j++) 
                if(a[j] < a[minIndex]) minIndex = j;

            if(minIndex != i){
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }

    private static void printArray(int[] a){
        for (int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] a = {7, 5, 2, 9, 4, 1};
        selectionSort(a,a.length);
        printArray(a);
    }
}
