// Geek and Bridges
// EasyAccuracy: 60.76%Submissions: 788+Points: 2
// 90% Refund available on all premium courses 
// Discover How  

// banner
// Geek wants to build bridges between two banks of a river to help migrants to reach their homes. But, he can build a bridge only between two similar posts. Bridges can't overlap. The task is to find the maximum number of bridges geek can build. 

// Note: Each of the posts is represented by either '*' or '@' or '#'.

// Example: Let str1 = "*@#*", str2 = "*#". Then output will be 2.
// * @ # *
// |     / 
// *  #

// Input:
// 1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// 2. The first line of each test case contains two space-separated strings representing the posts in each bank

// Output: For each test case, print the maximum number of bridges geek can build.

// Constraints:
// 1. 1 <= T <= 100
// 2. 1 <= N, M <= 100

// Example:
// Input:
// 2
// *@#* *#
// *** ##

// Output:
// 2
// 0


//Naive approach--O(S1.length()) or O(N)
// public class geekandbridges {
//     static void check(String s1,String s2){
//         int count =0;
//         int low =0;
//         int high = s1.length();
//         while(low<high){
//             if(s1.charAt(low)== s2.charAt(low)){
//                 count++;
//             }
//             low++;
//             high--;
//         }
//         System.out.println(count);
//     }
//     public static void main(String[] args) {
//         String s1 ="*@#* *#";
//         String s2 ="*** ##";
//         check(s1,s2);

//     }
// }
//////////////////////////////////////////////////////////
//Tabulation Method -- O(N * M)
// Geek wants to build bridges between two banks of a river to help migrants to reach their homes. 
//But, he can build a bridge only between two similar posts. Bridges can't overlap. The task is to find the maximum number of bridges geek can build. 

// Note: Each of the posts is represented by either '*' or '@' or '#'.

// Example: Let str1 = "*@#*", str2 = "*#". Then output will be 2.
// * @ # *
// |     / 
// *  #

// Input:
// 1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// 2. The first line of each test case contains two space-separated strings representing the posts in each bank

// Output: For each test case, print the maximum number of bridges geek can build.

// Constraints:
// 1. 1 <= T <= 100
// 2. 1 <= N, M <= 100

// Example:
// Input:
// 2
// *@#* *#
// *** ##

// Output:
// 2
// 0
public class geekandbridges {
    static int check(String s1,String s2){
        int m = s1.length();
	    int n = s2.length();
	    
	    int[][] dp = new int[m+1][n+1];
	    
	    for(int i=1;i<=m;i++){
	        for(int j=1;j<=n;j++){
	            if(s1.charAt(i-1) == s2.charAt(j-1)){
	                dp[i][j] = 1+dp[i-1][j-1];
	            }else{
	                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
	            }
	        }
	    }
	    return dp[m][n];
    }
    public static void main(String[] args) {
        //String s ="*@#* *#";//op- 2
        String s ="*** ##"; //op-0
        String[] arr = s.split(" ");
       System.out.println(check(arr[0],arr[1]));

    }
}