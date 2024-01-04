public class allpatterns {
    public static void main(String[] args) {
        
    }
}















//////////////////////////////////////////////////////////////
//PASCAL's Triangle
//      1 
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1
//     static int factorial(int n){
//         int fact =1;
//         for(int i =n;i>1;i--){
//             fact = fact*i;
//         }
//         return fact;
//     }
//     static int pascal(int n,int r){
//        int result = factorial(n)/(factorial(r)*factorial(n-r));
//        return result;
//     }
//     public static void main(String[] args) { 
//         int n =5;
//         for(int i =1;i<=n;i++){
//             for(int j =1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print(pascal(i-1,k-1)+" ");
//             }
//             System.out.println();
//         }
//     }
////////////////////////////////////////////////////////////////   







//////////////////////////////////////////////////////////
    //      1 
    //     0 1
    //    1 0 1
    //   0 1 0 1
    //  1 0 1 0 1
    //      int n=5,sum;
    //      for(int i =1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
            
    //         for(int k=1;k<=i;k++){
    //            sum = i+k;
    //             if(sum%2==1){
    //                 System.out.print(0+" ");
    //             }else{
    //                 System.out.print(1+" ");
    //             }
    //         }
    //         System.out.println();
    //      }
/////////////////////////////////////////////////////////



///////////////////////////////////////////////////////
    //      A 
    //     A B
    //    A B C
    //   A B C D
    //  A B C D E
    //        int n =5;
    //        int A =65;
    //        for(int i =0;i<n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int k=0;k<=i;k++){
    //             System.out.print((char)(A+k)+" ");
                
    //         }
    //         System.out.println();
    //        }
///////////////////////////////////////////////////////////







//////////////////////////////////////////////////////////
    //      A 
    //     B C
    //    D E F
    //   G H I J
    //  K L M N O
    //     int n =5;
    //     int A = 65;
    //     // int sum =0;
    //     for(int i =1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int k =1;k<=i;k++){
    //             System.out.print((char)(A)+" ");
    //             A++;
    //         }
    //         System.out.println();
    //     }
/////////////////////////////////////////////////////////////////




/////////////////////////////////////////////////////////////
    //      A 
    //     A A
    //    A A A
    //   A A A A
    //  A A A A A
    //     int n =5;
    //     int A = 65;
    //     for(int i =1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int k =1;k<=i;k++){
    //             System.out.print((char)(A)+" ");
                
    //         }
    //         System.out.println();
    //     }

///////////////////////////////////////////////////////// 
   
   
   
//////////////////////////////////////////////////////
//numbers-
    //      1 
    //     2 3 
    //    4 5 6
    //   7 8 9 10 
    //  11 12 13 14 15
    //     int n = 5;
    //     int sum =0;
    //     for(int i =1;i<=n;i++){
    //         for(int j =1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int k = 1;k<=i;k++){
    //             System.out.print(1+sum+" ");
    //             sum++;
    //         }
    //         System.out.println();
    //     }
 /////////////////////////////////////////////// 




/////////////////////////////////////////
//numbers
    //     1 
    //    2 2
    //   3 3 3
    //  4 4 4 4
    // 5 5 5 5 5 
    //    int n =5;
    //    for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int k= 1;k<=i;k++){
    //         System.out.print(i+" ");
    //     }
    //     System.out.println();
    //    }
//////////////////////////////////////////////////////


//////////////////////////////////////////////////////
//numbers 
// //      1 
// //     1 2
// //    1 2 3 
// //   1 2 3 4
// //  1 2 3 4 5
//        int n =5;
//        for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int k= 1;k<=i;k++){
//             System.out.print(k+" ");
//         }
//         System.out.println();
//        }
///////////////////////////////////////////////



////////////////////////////////////////////////////
 // //Square pattern with hollow square
        //  * * * * 
        //  *     *
        //  *     *
        //  * * * *
        // int n =4;
        // // for(int i=1;i<=n;i++){
        // //     for(int j=1;j<=n;j++){
        // //         System.out.print("* ");
        // //     }
        // //     System.out.println();
        // // }
        // for(int i =1;i<=n;i++){
        //     for(int j =1;j<=n;j++){
        //         if(i==1||j==1||i==n||j==n)
        //         {
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
////////////////////////////////////////////////////



/////////////////////////////////////////////////////
 //Diamond Hallow Triangle
//    * 
//   * *
//  *   *
// *     *
//  *   *
//   * *
//    *
    //    //First half
    //    int n =4;
    //    for(int i =1;i<=n;i++){
    //     for(int j = 1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int k =1;k<=i;k++){
    //         if(k==1||k==i){
    //             System.out.print("* ");
    //         }else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    //    }
    //    //Second half
    //     for(int i =n-1;i>=0;i--){
    //     for(int j = 1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int k =1;k<=i;k++){
    //         if(k==1||k==i||i==n){
    //             System.out.print("* ");
    //         }else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    //    }
///////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////
 // //Diamond(Two halves Traingle)
//      * 
//     * *
//    * * *
//   * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      * 
        // //First half
        // int n =4;
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k =0;k<=i;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // //Second half
        // for(int i=n-1;i>=0;i--){
        //     for(int j=0;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k =0;k<=i;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
////////////////////////////////////////////////////////////