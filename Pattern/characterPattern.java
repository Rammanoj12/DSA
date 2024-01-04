import java.util.Scanner;
public class characterPattern {
    static int mob(int q){

    int result=1;

    for(int i=q;i>1;i--)

    {

      result=result*i;

    }

    return result;

  }

  static int fact(int q,int r){

    int result = mob(q)/(mob(r)*mob(q-r));

    return result;
  }
  static void pattern(int n){

    // // i=5,4,3,2,1
    // for(int i=n;i>=1;i--){ 
    //     for(int j=1;j<=i-1;j++) {
    //         System.out.print(" ");s
    //     }
    //     for(int k=1;k<=(n-i)+1;k++){
    //       System.out.print(characterPattern.fact(n-i,k-1)+" ");

    //     }
    //     System.out.println();
    // }

    // //i=4,3,2,1,0

    // for(int i=n-1;i>=0;i--){ 
    //     for(int j=1;j<=i;j++) {
    //         System.out.print(" ");
    //     }
    //     for(int k=1;k<=(n-i);k++){
    //       System.out.print(characterPattern.fact((n-i)-1,k-1)+" ");

    //     }
    //     System.out.println();
    // }
    
    //i=5,6,7,8,9
    for(int i=n;i<=n+9;i++){
      for(int j=1;j<=i;j++){
          System.out.print(" ");
      }
      for(int k=1;k<=i-9;k++){
        System.out.print(characterPattern.fact(i-n,k-1)+" ");
      }
    System.out.println();

    }
    
  }

   


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        characterPattern.pattern(n);
       
        

  
  }

   
}


            


