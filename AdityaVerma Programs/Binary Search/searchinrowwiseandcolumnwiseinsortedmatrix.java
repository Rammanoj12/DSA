// Given an n x n matrix and an integer x, find the position of x in the matrix if it is present. Otherwise, print “Element not found”. Every row and column of the matrix is sorted in increasing order. The designed algorithm should have linear time complexity

// Examples: 

// Input: mat[4][4] = { {10, 20, 30, 40},  x = 29
//                                {15, 25, 35, 45},
//                                {27, 29, 37, 48},
//                              {32, 33, 39, 50}}
 
// Output: Found at (2, 1)
// Explanation: Element at (2,1) is 29

// Input : mat[4][4] = { {10, 20, 30, 40},   x = 100
//                                 {15, 25, 35, 45},
//                                {27, 29, 37, 48},
//                               {32, 33, 39, 50}};
     
// Output: Element not found
// Explanation: Element 100 does not exist in the matrix
//Return position
import java.util.ArrayList;

public class searchinrowwiseandcolumnwiseinsortedmatrix {
    static ArrayList<Integer> solve(int[][] arr,int k){
        int i =0;
        int j = arr.length-1;
        ArrayList<Integer> list = new ArrayList<>();

        while(i>=0 && i<=arr.length && j>=0 && j<=arr.length){
            if(arr[i][j]==k){
                list.add(i);
                list.add(j);
                return list;
            }else if(arr[i][j]<k){
                i++;
            }else if(arr[i][j]>k){
                j--;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] arr ={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int k = 20;
        ArrayList<Integer> result = solve(arr, k);
        System.out.println(result);
    }
}

///////////////////////////////////
////////////////////////////////////
//Return boolean value

// Given a matrix of size n x m, where every row and column is sorted in increasing order, and a number x. Find whether element x is present in the matrix or not.

// Example 1:

// Input:
// n = 3, m = 3, x = 62
// matrix[][] = {{ 3, 30, 38},
//               {36, 43, 60},
//               {40, 51, 69}}
// Output: 0
// Explanation:
// 62 is not present in the matrix, 
// so output is 0.
// class Solution 
// { 
//     static boolean solve(int[][] arr,int k){
//         int i =0;
//         int j = arr.length-1;
//         ArrayList<Integer> list = new ArrayList<>();

//         while(i>=0 && i<arr.length && j>=0 && j<arr.length){
//             if(arr[i][j]==k){
                
//                 return true;
//             }else if(arr[i][j]<k){
//                 i++;
//             }else if(arr[i][j]>k){
//                 j--;
//             }
//         }
//         return false;
//     }
//     //Function to search a given number in row-column sorted matrix.
// 	static boolean search(int matrix[][], int n, int m, int x) 
// 	{  
// 	    if(solve(matrix,x)){
// 	        return true;
// 	    }
// 	    return false;
// 	} 
// } 