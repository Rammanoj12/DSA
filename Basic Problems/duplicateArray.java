import java.util.Arrays;;

public class duplicateArray {
    static void dupArray(int[] arr){
        int l= arr.length;
        Arrays.sort(arr);
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                    if(arr[i]==arr[j]){
                        
                        System.out.print(arr[i]+" ");
                        break;
                    }
            }        
        }


    }
    public static void main(String[] args) {
       int[] arr ={2,3,4,2,3,3};
       dupArray(arr); 
    }
    
}
