import java.util.Scanner;
public class Fibonacci {
    public static void fibonacci(int num){
        int n1=0,n2=1;
        int n3;
        System.out.print(n1+" "+n2);
        for(int i=2;i<num;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

            Fibonacci.fibonacci(num);
    }
}
