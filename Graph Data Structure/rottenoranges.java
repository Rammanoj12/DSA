// Given a grid of dimension nxm where each cell in the grid can have values 0, 1 or 2 which has the following meaning:
// 0 : Empty cell
// 1 : Cells have fresh oranges
// 2 : Cells have rotten oranges

// We have to determine what is the earliest time after which all the oranges are rotten. A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right) in unit time. 
 

// Example 1:

// Input: grid = {{0,1,2},{0,1,2},{2,1,1}}
// Output: 1
// Explanation: The grid is-
// 0 1 2
// 0 1 2
// 2 1 1
// Oranges at positions (0,2), (1,2), (2,0)
// will rot oranges at (0,1), (1,1), (2,2) and 
// (2,1) in unit time.

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int first;
    int second;
    Node(int f,int s){
        this.first=f;
        this.second=s;
    }
}


public class rottenoranges {

    public static void orangesRotting(int[][] grid) {
    
        // Code here
        Queue<Node> q=new LinkedList<>();
        Queue<Node> pq=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Node(i,j));
                }
            }
        }
        int time=0;
        int dir[][]={{1,0},{-1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int flag=0;
            int size=q.size();
            while(size>0){
                int i=q.peek().first;
                int j=q.peek().second;
                System.out.println(q);
                q.remove();
                pq.add(new Node(i, j));
                for(int x=0;x<4;x++){
                    int newi=i+dir[x][0];
                    int newj=j+dir[x][1];
                    if(newi>=0 && newi<n && newj>=0 && newj<m){
                        if(grid[newi][newj]==1){
                            grid[newi][newj]=2;
                            flag++;
                            q.add(new Node(newi,newj));
                            
                        }
                    }
                }
                size--;
            }
            if(flag>0){
                time++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return;
                   // return -1;
                }
            }
        }
        while(!pq.isEmpty()){
            Node temp =pq.poll();
            System.out.println(temp.first+" "+temp.second);
        }
       System.out.println(time);
        //return time;
    }

    public static void main(String[] args) {
        // Example usage:
        int[][] grid = {
            {0, 1, 2},
            {0, 1, 2},
            {2, 1, 1},
            
        };

        orangesRotting(grid);
        
       
    }
}
