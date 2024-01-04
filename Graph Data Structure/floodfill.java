//BFS Approach

// import java.util.LinkedList;
// import java.util.Queue;
// class point{
//     int first;
//     int second;
//     public point(int first,int second){
//         this.first = first;
//         this.second = second;
//     }
// }
// public class floodfill {
//     static boolean isValid(int[][] arr,int m,int n,int x,int y,int old_color,int new_color){
//         if(x<0 || y<0 || x >= m || y >= n || arr[x][y]  == new_color || arr[x][y] == 0){
//             return false;
//         }
//         return true;
//     }

//     static void flood_fill(int[][] arr,int m,int n,int x,int y,int old_color,int new_color){
//         Queue<point> q = new LinkedList<>();
//         q.add(new point(x, y));
//         arr[x][y] = new_color;
//         while(!q.isEmpty()){
//             point curr = q.peek();
//            q.remove();
//            int posx = curr.first;
//            int posy = curr.second;
//         //(x+1),y

//         if(isValid(arr, m, n, posx+1, posy, old_color, new_color)){
//             arr[posx+1][posy] = new_color;
//             q.add(new point(posx+1, posy));
//         }

//         //(x-1),y

//         if(isValid(arr, m, n, posx-1, posy, old_color, new_color)){
//             arr[posx-1][posy] = new_color;
//             q.add(new point(posx-1, posy));
//         }

//         //x,(y+1)

//         if(isValid(arr, m, n, posx, posy+1, old_color, new_color)){
//             arr[posx][posy+1] = new_color;
//             q.add(new point(posx, posy+1));
//         }

//         //x,(y-1)

//         if(isValid(arr, m, n, posx, posy-1, old_color, new_color)){
//             arr[posx][posy-1] = new_color;
//             q.add(new point(posx, posy-1));
//         }

//         }
//     }
//     public static void main(String[] args) {
//         int[][] arr ={{1,1,1},{1,1,0},{1,0,1}};
//         int m = arr.length;
//         int n = arr.length;
//         int x =1;
//         int y =1;
//         int old_color = arr[x][y];
//         int new_color = 2;
//         flood_fill(arr, m, n, x, y, old_color, new_color);
//        for(int i =0;i<m;i++){
//         for(int j =0;j<n;j++){
//             System.out.print(arr[i][j]+" ");
//         }
//         System.out.println();
//        }

//     }
// }
////////////////////////////////////////////////////////////////////

//DFS Approach
public class floodfill{
    static void flood_fill(int[][] arr,int m,int n,int x,int y,int old_color,int new_color){
        if(x<0 || y<0 || x>=m || y>=n || arr[x][y]!= old_color || arr[x][y]== new_color){
            return;
        }
       
        arr[x][y] = new_color;
        flood_fill(arr, m, n, x+1, y, old_color, new_color);
        flood_fill(arr, m, n, x-1, y, old_color, new_color);
        flood_fill(arr, m, n, x, y+1, old_color, new_color);
        flood_fill(arr, m, n, x, y-1, old_color, new_color);
    }
    public static void main(String[] args) {
        int[][] arr ={{1,1,1},{1,1,0},{1,0,1}};
        int m = arr.length;
        int n = arr.length;
        int x =1;
        int y =1;
        int old_color = arr[x][y];
        int new_color = 2;
        flood_fill(arr, m, n, x, y, old_color, new_color);
       for(int i =0;i<m;i++){
        for(int j =0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
    }
}



////////////////////////////////////////////////////////////////////
//GFG Question -BFS
// An image is represented by a 2-D array of integers, each integer representing the pixel value of the image.

// Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

// To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

// Example 1:

// Input: image = {{1,1,1},{1,1,0},{1,0,1}},
// sr = 1, sc = 1, newColor = 2.
// Output: {{2,2,2},{2,2,0},{2,0,1}}
// Explanation: From the center of the image 
// (with position (sr, sc) = (1, 1)), all 
// pixels connected by a path of the same color
// as the starting pixel are colored with the new 
// color.Note the bottom corner is not colored 2, 
// because it is not 4-directionally connected to 
// the starting pixel.

// class point{
//     int first;
//     int second;
//     public point(int first,int second){
//         this.first = first;
//         this.second = second;
//     }
// }
// class Solution
// {
//     static class Pair{
//         int r,c;
//         Pair(int r,int c)
//         {
//             this.r=r;
//             this.c=c;
//         }
//     }
    
//     public static void bfs(int image[][],int in,int n,int sr,int sc,boolean b[][])
//     {
//         Queue<Pair> q=new LinkedList();
//         q.add(new Pair(sr,sc));
        
//         while(!q.isEmpty())
//         {
            
//             int row=q.peek().r;
//             int col=q.peek().c;
//             image[row][col]=n;
//              b[row][col]=true;
//             q.poll();
//             if(row>0 && image[row-1][col]==in && !b[row-1][col])
//             {
//             q.add(new Pair(row-1,col));
//             b[row-1][col]=true;
//             }
//             if(row<image.length-1 && image[row+1][col]==in && !b[row+1][col])
//             {
//             q.add(new Pair(row+1,col));
//             b[row+1][col]=true;
//             }
//             if(col>0 && image[row][col-1]==in && !b[row][col-1])
//             {
//             q.add(new Pair(row,col-1));
//             b[row][col-1]=true;
//             }
//             if(col<image[0].length-1 && image[row][col+1]==in && !b[row][col+1])
//             {
//             q.add(new Pair(row,col+1));
//             b[row][col+1]=true;
//             }
//         }
//     }
    
    
//     public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
//     {
//         // Code here
//         int in=image[sr][sc];
        
//         boolean b[][]=new boolean[image.length][image[0].length];
//         bfs(image,in,newColor,sr,sc,b);
//         return image;
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
//GFG -DFS--o(N) or O(row * col)
// class Solution{
//     public void Floodfill(int[][] image, int sr, int sc, int newcolor,boolean vis[][],int orgcolor){
//         if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgcolor || image[sr][sc] == newcolor){
//             return;
//         }
//         image[sr][sc] = newcolor;
//         Floodfill(image,sr-1,sc,newcolor,vis,orgcolor);
//         Floodfill(image,sr,sc-1,newcolor,vis,orgcolor);
//         Floodfill(image,sr,sc+1,newcolor,vis,orgcolor);
//         Floodfill(image,sr+1,sc,newcolor,vis,orgcolor);
//     }
//     public int[][] floodFill(int[][] image, int sr, int sc, int newcolor){
//         boolean vis[][] = new boolean[image.length][image[0].length];
//         Floodfill(image,sr,sc,newcolor,vis,image[sr][sc]);
//         return image;
//     }
// }
