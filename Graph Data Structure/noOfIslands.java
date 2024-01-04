// Given a grid of size n*m (n is the number of rows and m is the number of columns in the grid) consisting of '0's (Water) and '1's(Land). Find the number of islands.

// Note: An island is either surrounded by water or boundary of grid and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.

// Example 1:

// Input:
// grid = {{0,1},{1,0},{1,1},{1,0}}
// Output:
// 1
// Explanation:
// The grid is-
// 0 1
// 1 0
// 1 1
// 1 0
// All lands are connected.
public class noOfIslands {
       public static int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == '1'){
                    count_N_of_island(i,j,r,c,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public static void count_N_of_island(int i,int j,int r,int c,char grid[][]){
        if(i>=r || i<0 || j>=c || j<0 || grid[i][j] == '2' || grid[i][j] == '0'){
            return;
        }
        
        
        grid[i][j] = '2';
        
        //left
        count_N_of_island(i,j-1,r,c,grid);
        
        //up
        count_N_of_island(i-1,j,r,c,grid);
        
        //right
        count_N_of_island(i,j+1,r,c,grid);
        
        //down
        count_N_of_island(i+1,j,r,c,grid);
        
        //top-left
        count_N_of_island(i-1,j-1,r,c,grid);
        
        //top-right
        count_N_of_island(i-1,j+1,r,c,grid);
        
        //bottom-right
        count_N_of_island(i+1,j+1,r,c,grid);
        
        //bottom-left
        count_N_of_island(i+1,j-1,r,c,grid);
        
    }
    public static void main(String[] args) {
        char[][] grid = {{'0','1'},{'1','0'},{'1','1'},{'1','0'}};
        System.out.println(numIslands(grid));
    }
}
