 // Given the dimension of a sequence of matrices in an array arr[], where the dimension of the ith matrix is (arr[i-1] * arr[i]), 
//the task is to find the most efficient way to multiply these matrices together such that the total number of element multiplications is minimum.

// Examples:

// Input: arr[] = {40, 20, 30, 10, 30}
// Output: 26000
// Explanation:There are 4 matrices of dimensions 40×20, 20×30, 30×10, 10×30.
// Let the input 4 matrices be A, B, C and D.
// The minimum number of  multiplications are obtained by 
// putting parenthesis in following way (A(BC))D.
// The minimum is 20*30*10 + 40*20*10 + 40*10*30

//Memoization
public class MCM{
    static int mcm(int[] arr,int n,int i, int j,int[][] dp){
        if(i>=j-1){
          return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int min = Integer.MAX_VALUE;
        for(int k =i+1;k<j;k++){
            int cost = arr[i] *arr[k]*arr[j];
            // int tempAns = mcm(arr, n, i, k, dp) + mcm(arr, n, k, j, dp)+cost;
            //optimization of this unnecessary recursion
            int left=0,right=0;
            if(dp[i][k]!=-1){
                left = dp[i][k];
            }else{
                left = mcm(arr, n, i, k, dp);
                dp[i][k] =left;
            }

             if(dp[k][j]!=-1){
                right = dp[k][j];
            }else{
                right = mcm(arr, n, k, j, dp);
                dp[k][j] =right;
            }
             

            int tempAns = left + right+cost;
            if(tempAns<min){
               min = tempAns;
            }
        }
        return dp[i][j]=min;
    }
    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10, 30 };
        int n = arr.length;
        int i=0;
        int j =n-1;
       
        int[][] dp = new int[n+1][n+1];
        for(int a =0;a<=n;a++){
           for(int b= 0;b<=n;b++){
            dp[a][b]=-1;
           }
        }

        int result = mcm(arr,n,i,j,dp);
        System.out.println(result);
    }
}





















//Recursion
public class MCM {
   
   static int mcm(int[] arr,int n,int i,int j){
        if(i>=j-1){
                return 0;
            }
        int min= Integer.MAX_VALUE;
        for(int k = i+1;k<j;k++){
            int cost = arr[i] * arr[k] * arr[j];
            int tempAns = mcm(arr, n,i, k) + mcm(arr,n, k, j) + cost;
            if(tempAns<min){
                min = tempAns;
            }
        }
        return min;
   }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3 };
        int n = arr.length;
         int i=0;
        int j =n-1;
        int result = mcm(arr,n,i,j);
        System.out.println(result);
    }
}
