import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


//BFS -- O(N*M)
// class pair{
//     int first;
//     int second;
//     public pair(int first,int second){
//         this.first = first;
//         this.second = second;
//     }
// }

// public class BFSandDFSon2Darray {
// static int ROW =4;
// static int COL =4;
// static int[] dRow = {-1,0,1,0};
// static int[] dCol ={0,1,0,-1};
//     static boolean isValid(boolean[][] vis,int row,int col){
//     //     if(row>=0 && col>=0 && row<ROW && col<COL && vis[row][col] == false){
//     //            return true;
//     //     }
//     //     return false;
//     // }

//         if(row<0 || col<0 || row>=ROW || col>=COL || vis[row][col] == true){
//                return false;
//         }
//         return true;
//     }
//     static void bfs(int[][] grid,boolean[][] vis,int row,int col){
//         Queue<pair> q = new LinkedList<>();
//         q.add(new pair(row, col));
//         vis[row][col] =true;
//         while(!q.isEmpty()){
//             pair curr = q.poll();
//             int x = curr.first;
//             int y = curr.second;
//             System.out.print(grid[x][y]+" ");
           

//             //Adding in the queue
//             for(int i =0;i<4;i++){
//                 int adjx = x+dRow[i];
//                 int adjy = y +dCol[i];
//                 if(isValid(vis, adjx, adjy)){
//                     q.add(new pair(adjx, adjy));
//                     vis[adjx][adjy] = true;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[][] grid ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         boolean[][] vis = new boolean[ROW][COL];
//              for(int i =0;i<ROW;i++){
//             for(int j =0;j<COL;j++){
//                 vis[i][j] = false;
//             }
//         }
//         bfs(grid,vis,0,0);
//     }
// }
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
/////////DFS

// class pair{
//     int first;
//     int second;
//     public pair(int first,int second){
//         this.first = first;
//         this.second = second;
//     }
// }

// public class BFSandDFSon2Darray {
// static int ROW =4;
// static int COL =4;
// static int[] dRow = {0,1,0,-1};
// static int[] dCol ={-1,0,1,0};
//     static boolean isValid(boolean[][] vis,int row,int col){
//     //     if(row>=0 && col>=0 && row<ROW && col<COL && vis[row][col] == false){
//     //            return true;
//     //     }
//     //     return false;
//     // }

//         if(row<0 || col<0 || row>=ROW || col>=COL || vis[row][col]){
//                return false;
//         }
//         return true;
//     }
//     static void dfs(int[][] grid,boolean[][] vis,int row,int col){
//        Stack<pair> s = new Stack<>();
//        s.push(new pair(row, col));
        
//         while(!s.isEmpty()){
//             pair curr = s.pop();
//             int x = curr.first;
//             int y = curr.second;
//             if(isValid(vis, x, y) == false){
//                 continue;
//             }
//                 vis[x][y] = true;
//             System.out.print(grid[x][y]+" ");
//               //Adding in the stack
//             for(int i =0;i<4;i++){
//                 int adjx = x+dRow[i];
//                 int adjy = y +dCol[i];
                
//                 s.push(new pair(adjx, adjy));
                
                    
//                 }
            
//         }
    
//     }    

// public static void main(String[] args) {
//     // int grid[][] = { { -1, 2, 3 }, 
//     // { 0, 9, 8 }, 
//     // { 1, 0, 1 } };
//        int[][] grid ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         boolean[][] vis = new boolean[ROW][COL];
//         for(int i =0;i<ROW;i++){
//             for(int j =0;j<COL;j++){
//                 vis[i][j] = false;
//             }
//         }
//         dfs(grid, vis, 0, 0);
//     }
// }
