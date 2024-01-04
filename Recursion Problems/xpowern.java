//stack Height = n

// public class xpowern {
//     static int power(int x,int n){
//         if(n == 0){
//             return 1;
//         }
//         if(x == 0){
//             return 0;
//         }
//         int power_num = power(x, n-1);
//         int result  = x * power_num;
//         return result;
//     }
//     public static void main(String[] args) {
//         int x =2;
//         int n =4;
//         System.out.println(power(x,n));
//     }
// }
////////////////////////////////////////////////

////////////////////////////////////////////////

//stack Height = logn

public class xpowern{
     static int power(int x,int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int power_num = power(x, n-1);
        int result  = x * power_num;
        return result;
    }

   static int solve(int x,int n){
    if(n %2 ==0){
        return power(x, n/2) * power(x, n/2);
    }else{
        return power(x, n/2) * power(x, n/2) * x;
    }
   }
    public static void main(String[] args) {
        int x =2;
        int  n =4;
        System.out.println(solve(x, n));
    }
}