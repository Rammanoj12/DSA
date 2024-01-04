//Printing MCM
// Given an array p[] which represents the chain of matrices such that the ith matrix Ai is of dimension p[i-1] x p[i]. We need to write a function MatrixChainOrder() that should return the minimum number of multiplications needed to multiply the chain. 

// Input:  p[] = {40, 20, 30, 10, 30}  
// Output: Optimal parenthesization is  ((A(BC))D)
//         Optimal cost of parenthesization is 26000

public class printMCM {
    static int name = 0;

    static void printParenthesis(int i, int j, int n, int[][] brackets, char[] matrixNames) {
        if (i == j) {
            System.out.print(matrixNames[i]);
        } else {
            System.out.print("(");
            printParenthesis(i, brackets[i][j]-1, n, brackets, matrixNames);
            System.out.print("*");
            printParenthesis(brackets[i][j] + 1, j, n, brackets, matrixNames);
            System.out.print(")");
        }
    }

    static int printmcm(int[] arr, int n, int i, int j, int[][] dp, int[][] brackets) {
        if (i >= j - 1) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int min = Integer.MAX_VALUE;

        for (int k = i + 1; k < j; k++) {
            int cost = arr[i] * arr[k] * arr[j];
            int tempAns = printmcm(arr, n, i, k, dp, brackets) + printmcm(arr, n, k, j, dp, brackets) + cost;
            if (tempAns < min) {
                min = tempAns;
                brackets[i][j] = k;
            }
        }

        return dp[i][j] = min;
    }

    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10, 30};
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        int[][] dp = new int[n][n];
        int[][] brackets = new int[n][n];
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                dp[a][b] = -1;
                brackets[a][b] = -1;
            }
        }

        char[] matrixNames = new char[n];
        for (int a = 0; a <n; a++) {
            matrixNames[a] = (char) ('A' + a);
        }

        int result = printmcm(arr, n, i, j, dp, brackets);
        System.out.println("Minimum Cost to Multiply Matrices: " + result);
        System.out.print("Optimal Parenthesization is: ");
        printParenthesis(i, j, n, brackets, matrixNames);
    }
}
