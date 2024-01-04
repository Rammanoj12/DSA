//////////////////////////////////////////////////////////////////////////////////
//General   O/1 Knapsack problem with three methods

// public class knapsackProblems {
//      static int max(int a,int b){
//         if(a>b){
//             return a;
//         }else{
//             return b;          
//         }
//      }

//      //Recursive Approach--Time --O(2*N)//Two recursion stack calls; Space --O(n)//Due to recursion
//     //    public static  int  knapsack(int[] wt,int[] val,int W,int n ){
//     //        if(n ==0 ||W ==0){
//     //         return 0;
//     //        }
//     //        if(wt[n-1]>W){
//     //         return knapsack(wt, val, W, n-1);
//     //        }else{
//     //         return max(knapsack(wt, val, W, n-1),knapsack(wt, val, W-wt[n-1], n-1)+val[n-1]);
//     //        }

//     //    }


//     //Memoization Approach--Time --O(n * W); Space --O(n * W)+O(n)//Due to recursion
// //    public static int knapsack(int[] wt,int[] val,int W,int n,int[][] dp){
// //         if(n==0||W==0){
// //             return 0;
// //         }
// //        if(dp[n][W]!=-1){
// //         return dp[n][W];
// //        }
     
// //        if(wt[n-1]>W){
// //          return dp[n][W]= knapsack(wt, val, W, n-1, dp);
// //        }else{
// //         return dp[n][W] = max(val[n-1]+knapsack(wt, val, W-wt[n-1], n-1, dp),knapsack(wt, val, W, n-1, dp));
// //        }


// //     }

// //Bottom-Up Approach(Tabulation)
// //  public static int knapsack(int[]wt,int[] val,int W,int n,int[][] dp){
// //            for(int i =0;i<=n;i++){
// //             for(int j=0;j<=W;j++){
// //                 if(i==0||j==0){
// //                      dp[i][j] =0;
// //                 } 

//or

            //       dp[0][0] =1;
	        // for(int j =1;j<=sum;j++){
	        //     dp[1][j] =0;
	        // }
	    
//                     for(int i =1;i<=n;i++){
// //             for(int j=1;j<=W;j++){
 // //                   if(wt[i-1]<=j){
// //                     dp[i][j] = max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
// //                 }else{
// //                     dp[i][j] = dp[i-1][j];
// //                 }
// //             }
// //            }
//              }
//         }

// //            return dp[n][W];
// //  }
//     public static void main(String[] args) {
//         int[] wt ={10,20,30};
//         int[] val ={60,100,120};
//         int W =50;
//         int n = wt.length;
//         //int[][] dp = new int[n+1][W+1];
//         // for(int i=0;i<n+1;i++){
//         //     for(int j=0;j<W+1;j++){
//         //       dp[i][j]=-1;
//         //     }
//         // }
//          //System.out.println(knapsack(wt,val,W,n,dp));
       
//          System.out.println(knapsack(wt,val,W,n));

//     }
// }

/////////////////////////////////////////////
///Single array 
//int[] dp = new dp[W+1];
//  for(int i =1;i<n+1;i++){
//     for(int w = W;w>=0;w--){
//         if(wt[i-1]<=w){
//            dp[w] = Math.max(dp[w],dp[w-wt[i-1]+val[i-1]]);
//         }
//     }
//  }
//  return dp[W];
// }
