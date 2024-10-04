import java.util.*;

class LinearSearch {
    
    private static int linearSearch(int[] a, int n, int searchValue){
        for(int i=0; i<n; i++) 
            if(a[i] == searchValue) 
                return i;
        return -1;
    }
    
    private static int linearSearchImprove(int[] a, int n, int searchValue){
        a[n] = searchValue;
        
        int i = 0;
        while(a[i] != searchValue) 
          i++;
        
        if(i<n) 
          return i;
        else 
          return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int n = sc.nextInt();
        int[] a = new int[n+1];
        
        for(int i=0; i<n; i++){
            String input = String.format("Enter the element %d: ",i+1);
            System.out.print(input);
            a[i] = sc.nextInt();
        }
        
        System.out.print("Enter the search value: ");
        int searchValue = sc.nextInt();
        
        int out = linearSearchImprove(a, n, searchValue);
        if(out==-1) 
          System.out.println(searchValue +" not present");
        else 
          System.out.println(searchValue +" present at index " + out);
    }
}
