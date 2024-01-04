
//FLOOD FILL ALGORITHM
// public class numberofEnclaves {
//     public static void main(String[] args) {
//         // Your code here
//         int n=grid.length;
//         int m=grid[0].length;
        
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 if(grid[i][j]==1 && ( i==0 || j==0 || i==n-1 || j==m-1))
//                 {
//                     helper(i,j,grid,n,m);
//                 }
//             }
//         }
//         int ans=0;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 if(grid[i][j]==1)ans++;
//             }
//         }
//         return ans;
        
        
//     }
//     public void helper(int i,int j,int[][] grid,int n,int m)
//     {
//         if(i>=n ||j>=m)return;
//         if(i<0 ||j<0)return;
//         if(grid[i][j]==0)return;
//         grid[i][j]=0;
//         helper(i,j+1,grid,n,m);
//         helper(i,j-1,grid,n,m);
//         helper(i+1,j,grid,n,m);
//         helper(i-1,j,grid,n,m);
        
//     }
// }
///////////////////////////////////////////////////////////////////////////////
 
 
/////////////////////////////////////////////////////////////////////////////
// // NAIVE APPROACH

// class Solution {

//     static int row [] = {-1,0,1,0};
//     static int col[] = {0,1,0,-1};
//     int numberOfEnclaves(int[][] grid) {

//         // Your code here
//         int n = grid.length, m = grid[0].length, count = 0;

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if((i==0 || j==0 || i==n-1 || j==m-1) && grid[i][j]==1){
//                     makeZero(i,j,n,m,grid);
//                 }
//             }
//         }

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(grid[i][j]==1) count++;
//             }
//         }

//         return count;
//     }

//     static void makeZero(int i, int j, int n, int m, int[][] grid){
//         grid[i][j]=0;

//         for(int k=0; k<4; k++){
//             int r = i+row[k];
//             int c = j+col[k];

//             if(r>=0 && c>=0 && r<n && c<m && grid[r][c]==1){
//                 makeZero(r,c,n,m,grid);
//             }
//         }

//     }
// }
/////////////////////////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////////////////////////
//////BFS - 2D ARRAY
//  static class pair{
//             int first;
//             int second;
            
//             public pair(int first,int second){
//                 this.first = first;
//                 this.second = second;
//             }
//         }

//     int numberOfEnclaves(int[][] grid) {
          
          
//           Queue<pair> q = new LinkedList<pair>();
//           int grid_row = grid.length;
//           //Will take as first row length
//           int grid_col = grid[0].length;
           /// 2-D ARRAY
//           int[][] vis = new int[grid_row][grid_col];
          
          
          
//           //Checking if one exits in any row and column , it exits we are making at particular index 1 
//           // vis array also will be chnaged to 1.
//           for(int i=0;i<grid_row;i++){
//               for(int j=0;j<grid_col;j++){
//                   if(i==0||j==0||i==grid_row-1||j==grid_col-1){
//                       if(grid[i][j]==1){
//                           q.add(new pair(i,j));
//                           vis[i][j]=1;
//                       }
//                   }
//               }
//           }
          
          
          
//           // (-1,0)(1,0) (0,1) (0,-1)
//              int[] drow ={-1,0,1,0};
//              int[] dcol ={0,1,0,-1};
           
           
//            while(!q.isEmpty()){
//                //peek the element
//                pair cell = q.peek();
               
//                int x = cell.first;
//                int y = cell.second;
//                //remove the element
//                q.remove();
               
               
//                for(int i =0;i<4;i++){
//                    int adjx = x + drow[i];
//                    int adjy = y + dcol[i];
                   
                   
//                    if(adjx<grid_row && adjy<grid_col && adjx>=0&&adjy>=0 && vis[adjx][adjy] == 0 && grid[adjx][adjy] == 1){
//                          q.add(new pair(adjx,adjy));
                         
//                          vis[adjx][adjy]=1;
                         
//                    }
//                }
               
//            }
           
           
//            int count = 0 ;
           
//            for(int i = 0; i< grid_row; i++){
//                for(int j =0; j<grid_col;j++){
//                    if(grid[i][j]==1 && vis[i][j]==0){
//                        count++;
//                    }
//                }
//            }
//            return count;
           
           
        
        
//     }