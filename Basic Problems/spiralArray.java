//COMPLETE SPIRAL ARRAY
//OUTPUT - 1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13 
// public class spiralArray{
//     static void spiralBinding(int[][] arr,int l){
//         int row_start = 0;
//         int row_end = l-1;
//         int column_start = 0;
//         int column_end =  l-1;
//         while(row_start<=row_end && column_start<=column_end){
//             //for first col
//             for(int col =column_start;col<=column_end;col++){                                          
//                 System.out.print(arr[row_start][col]+" ");
//             }
//            row_start++;
          

//             for(int row =row_start;row<=row_end;row++){
//                 System.out.print(arr[row][column_end]+" ");
//             }
//            column_end--;
           

//             for(int col=column_end;col>=column_start;col--){
//                 System.out.print(arr[row_end][col]+" ");
//             }
            
//            row_end--;
//             for(int row = row_end;row>=row_start;row--){
//                 System.out.print(arr[row][column_start]+" ");
//             }
            
//             column_start++;
//         }
//         System.out.println();


//     }
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//         int l = arr.length;
//        spiralBinding(arr,l);

//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////

// You are given a matrix of dimensions n x m. The task is to perform boundary traversal on the matrix in a clockwise manner.

// Example 1:

// Input:
// n = 4, m = 4
// matrix[][] = {{1, 2, 3, 4},
//          {5, 6, 7, 8},
//          {9, 10, 11, 12},
//          {13, 14, 15,16}}
// Output: 1 2 3 4 8 12 16 15 14 13 9 5
// Explanation:
// The matrix is:
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// The boundary traversal is:
// 1 2 3 4 8 12 16 15 14 13 9 5


// class Solution
// {
//     //Function to return list of integers that form the boundary 
//     //traversal of the matrix in a clockwise manner.
//     static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
//     {
        
//         ArrayList<Integer> list = new ArrayList<>();
//         if(m==1){
//             for(int i =0 ;i<n;i++){
//                 list.add(matrix[i][0]);
//             }
//             return list;
//         }
        
//          if(n==1){
//             for(int i =0 ;i<m;i++){
//                 list.add(matrix[0][i]);
//             }
//             return list;
//         }
        
//         int row_start = 0;
//         int row_end = n-1;
//         int column_start = 0;
//         int column_end =  m-1;
        
//             //for first col
//             for(int col =column_start;col<=column_end;col++){                                          
//                list.add(matrix[row_start][col]);
//             }
//            row_start++;
           

//             for(int row =row_start;row<=row_end;row++){
//                 list.add(matrix[row][column_end]);
//             }
//            column_end--;
            

//             for(int col=column_end;col>=column_start;col--){
//                list.add(matrix[row_end][col]);
//             }
          
//            row_end--;
//             for(int row = row_end;row>=row_start;row--){
//                list.add(matrix[row][column_start]);
//             }
           
//             column_start++;
        
//         return list;
       


//     }
   
// }