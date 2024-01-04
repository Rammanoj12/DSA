import java.util.Scanner;
public class Operator {
    public void countArray(int[]n){
        // int odd=0;
        // int even=0;
            int sum_odd=0;
             int sum_even=0;

            // int count=0;
        int length = n.length;
        for(int j=0;j<length;j++){
            if(n[j]%2==1){
                sum_odd=sum_odd+n[j];
              
            }else if(n[j]%2==0){
                sum_even=sum_even+n[j];

            }else{
                System.out.println("EMPTY ARRAY");
            }

              
            
        }
        
        System.out.println("The odd numbers are"+" "+sum_odd);
         System.out.println("The even numbers are"+" "+sum_even);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int size = sc.nextInt();
        int[] n = new int[size];
        

        for(int i=0;i<size;i++){
            n[i]=sc.nextInt();
        }
        Operator obj = new Operator();
        obj.countArray(n);

 }
    
}
