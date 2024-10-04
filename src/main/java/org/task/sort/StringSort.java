public class StringSort{
    
    private static void sortString(String[] sArr, int n){
        int i, j, swaps;
        String temp;
        
        for(i=n-2; i>=0; i--){
            swaps = 0;
            for(j=0; j<=i; j++){
                if(sArr[j].compareTo(sArr[j+1]) > 0){
                    temp = sArr[j];
                    sArr[j] = sArr[j+1];
                    sArr[j+1] = temp;
                    swaps++;
                }
            }
            
            if(swaps == 0) break;
        }
    }
    
    private static void printArray(String[] s){
        for(String e : s)
            System.out.println(e);
    }
    
    public static void main(String[] args){
        System.out.println("apple".compareTo("banana"));
        System.out.println("banana".compareTo("apple"));
        System.out.println("banana".compareTo("banana"));
        System.out.println("**************************");
 
        String[] fruits = {"apple", "orange", "banana", "grape"};
        sortString(fruits, fruits.length);
        printArray(fruits);
    }
    
}
