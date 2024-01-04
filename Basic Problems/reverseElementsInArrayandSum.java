import java.util.Scanner;
public class reverseElementsInArrayandSum {
    public static void main(String[] args) {
        int[] n = {112,156,852};
        int length = n.length;
        int start,digit;
        int sum=0;
        int[] new_arr = new int[length];
        System.out.println("The array is");
        for(start=0;start<=length-1;start++){
         for(;n[start]>0;n[start]=n[start]/10){
            digit = n[start]%10;
            sum =sum*10+digit;
            new_arr[start]=sum;
         }
        //  //With While Loop
        //  while(n[start]>0){
        //   digit = n[start]%10;
        //     sum =sum+digit;
        //     new_arr[start]=sum;
        //     n[start]=n[start]/10;
    
        //  }
        if(n[start]==0){
            sum= 0;
          }
        
          System.out.print(new_arr[start]+"  ");
        }
        
    
       
    }
}
