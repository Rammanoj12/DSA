// The following is a description of the instance of this famous puzzle involving N = 2 eggs and a building with K = 36 floors.
// Suppose that we wish to know which stories in a 36-story building are safe to drop eggs from, and which will cause the eggs to break on landing. We make a few assumptions:

// An egg that survives a fall can be used again. 
// A broken egg must be discarded. 
// The effect of a fall is the same for all eggs. 
// If an egg breaks when dropped, then it would break if dropped from a higher floor. 
// If an egg survives a fall then it would survive a shorter fall. 
// It is not ruled out that the first-floor windows break eggs, nor is it ruled out that the 36th-floor does not cause an egg to break.

// K ==> Number of floors 
// N ==> Number of Eggs 

// eggDrop(N, K) ==> Minimum number of trials needed to find the critical 
// floor in worst case.
// eggDrop(N, K) = 1 + min{max(eggDrop(N – 1, x – 1), eggDrop(N, K – x)), where x is in {1, 2, …, K}}

//Memoization(Using 2D ARRAY)
public class eggdropping{
    public static int solve(int N,int K,int[][] dp){
        int min = Integer.MAX_VALUE;
         if(N==1){
            return K;
        }
        if(K ==0 || K==1){
            return K;
        }
       
        if(dp[N][K]!=-1){
            return dp[N][K];
        }

        for(int i=1;i<=K;i++){
            int low= 0;int high = 0;
            if (dp[N-1][i-1]!=-1) {
             low = dp[N-1][i-1];
        }else{
            low = solve(N-1, i-1, dp);
            dp[N-1][i-1] = low;
        }
           if(dp[N][K-i]!=-1){
            high = dp[N][K-i];
           }else{
            high =  solve(N, K-i, dp);
            dp[N][K-i] = high;
           }
          int temp = 1 + Math.max(low, high);
          if(temp<min){
            min=temp;
          }
        }
        return dp[N][K]=min;
    }
    public static void main(String[] args) {
        int K =3;//No of floors
        int N= 4;// No of eggs
        int[][] dp = new int[N+1][K+1];
        for(int i =0;i<=N;i++){
            for(int j =0;j<=K;j++){
                dp[i][j] =-1;
            }
        }
        int result = solve(N,K,dp);
        System.out.println(result);
        
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// //Recursion
// public class eggdropping {
//     public static int solve(int K,int N){
//         if(K == 0 || K== 1){
//             return K;
//         }
//         if(N ==1 ){
//             return K;
//         }
//         int min = Integer.MAX_VALUE;
//         for(int i= 1;i<=K;i++){
//             int temp =  1+(solve(K-1, N-1))+(solve(K-i, N));
//             if(temp<min){
//                 min = temp;
//             }
//         }
//         return min;
//     }
//     public static void main(String[] args) {
//         int K =3;//No of floors
//         int N= 1;// No of eggs
//         int result = solve(K,N);
//         System.out.println(result);

//     }
// }
