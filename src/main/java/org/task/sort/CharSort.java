
public class CharSort{
    
    private static String sortChars(String str){
        char[] cArr = str.toCharArray();
        int n = cArr.length;
        int i, j,swaps;
        char temp;
        
        for(i=n-2; i>=0; i--){
            swaps = 0;
            for(j=0; j<=i; j++){
                if(cArr[j] > cArr[j+1]){
                    temp = cArr[j];
                    cArr[j] = cArr[j+1];
                    cArr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
        
        return new String(cArr);
    }
    
    public static void main(String[] args){
        System.out.println('a'<'b');
        System.out.println('a'>'b');
        System.out.println('b'=='b');
        System.out.println("**************************");
        System.out.println(sortChars("sorting"));
    }
    
}
