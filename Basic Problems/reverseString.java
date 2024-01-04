public class reverseString {
    static String reverseString(String str){
        String[] arr =  str.split("\\.");
        int L= arr.length;
        
        for(int i =0;i<=(L/2)-1;i++){
            String newString= arr[i];
            
            arr[i] = arr[L-1-i];
            arr[L-1-i]=newString;
        }
        String result = String.join("-->",arr);
        
       return result;

    }
    
public static void main(String[] args) {
    String str = "I.LOVE.YOU.PRIYA.AMMU";
    String newString=reverseString(str);
    System.out.println(newString);
    
    
}


}

