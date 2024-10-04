import java.util.*;

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
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int x=0; x<n; x++){
            String input = String.format("Enter the element %d: ", x+1);
            System.out.print(input);
            a[x] = sc.nextInt();
        }
        selectionSort(a, n);
        printArray(a);
    }
}
