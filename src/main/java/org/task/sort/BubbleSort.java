import java.util.*;

class BubbleSort {
    
    private static void bubbleSort(int[] a, int n){
        int i, j, temp;
        
        for(i=n-2; i>=0; i--){
            for(j=0; j<=i; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    
    private static void bubbleSortImprove(int[] a, int n){
        int i, j, temp, swaps;
        
        for(i=n-2; i>=0; i--){
            swaps = 0;
            for(j=0; j<=i; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swaps++;
                }
            }
            
            if(swaps == 0) break;
        }
    }
    
    private static void printArray(int[] a){
        for(int e : a)
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
        bubbleSortImprove(a, n);
        printArray(a);
    }
}
