// Given a 2D board of letters and a word. Check if the word exists in the board. The word can be constructed from letters of adjacent cells 
// only. ie - horizontal or vertical neighbors. The same letter cell can not be used more than once.

// Example 1:

// Input: board = {{a,g,b,c},{q,e,e,l},{g,b,k,s}},
// word = "geeks"
// Output: 1
// Explanation: The board is-
// a g b c
// q e e l
// g b k s
// The letters which are used to make the
// "geeks" are colored.
// Example 2:

// Input: board = {{a,b,c,e},{s,f,c,s},{a,d,e,e}},
// word = "sabfs"
// Output: 0
// Explanation: The board is-
// a b c e
// s f c s
// a d e e
// Same letter can not be used twice hence ans is 0
//DFS -- O(N*M*L) Space - O(L) L= String length;
public class wordSearch {
    public static boolean isWordExist(char[][] board, String word)
    {
        char a[]=word.toCharArray();
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==a[0]){
                    boolean[][] vis=new boolean[n][m];
                    dfs(board,n,m,i,j,a,0,vis);
                    k=0;
                }
            }
        }
        boolean f=ans;
        ans=false;
        return f;
    }
    static boolean ans=false;
    static int k=0;
    public static void dfs(char[][] b,int n,int m,int i,int j,char[] a,int q,boolean[][] vis){
        if(i<0||j<0||i>=n||j>=m||vis[i][j]||k>a.length||ans||a[k]!=b[i][j]){
            return;
        }
        vis[i][j]=true;
        if(k==a.length-1&&b[i][j]==a[k]){
            ans=true;
            return;
        }
       
        if(b[i][j]==a[k]){
        k+=1;
            dfs(b,n,m,i+1,j,a,k,vis);
            dfs(b,n,m,i,j+1,a,k,vis);
            dfs(b,n,m,i-1,j,a,k,vis);
            dfs(b,n,m,i,j-1,a,k,vis);
        }
        
    }
 public static void main(String[] args) {
    char[][] board = {{'a','g','b','c'},{'q','e','e','l'},{'g','b','k','s'}};
    String word ="geeks";
    boolean result = isWordExist(board, word);
    System.out.println(result);
 }   
}
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
//General Approach
// public boolean isWordExist(char[][] board, String word)
//     {
//         // Code here
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board[0].length; j++){
//                 if(board[i][j] == word.charAt(0)){
//                     if(search(i, j, board, word, 0)){
//                         return true;
//                     }
//                 }
//             }
//         }
//         return false;
//     }


//     static boolean search(int r, int c, char[][] board, String word, int k){
//         if(k == word.length()-1){
//             return true;
//         }
//         char nextChar = word.charAt(k+1);
//         char temp = board[r][c];
//         board[r][c] = '!';
//         //left
//         if(c>0 && board[r][c-1]==nextChar){
//             if(search(r, c-1, board, word, k+1)) return true;
//         }
//         //right
//         if(c<board[0].length-1 && board[r][c+1]==nextChar){
//             if(search(r, c+1, board, word, k+1)) return true;
//         }
//         //up
//         if(r>0 && board[r-1][c]==nextChar){
//             if(search(r-1, c, board, word, k+1)) return true;
//         }
//         //down
//         if(r<board.length-1 && board[r+1][c]==nextChar){
//             if(search(r+1, c, board, word, k+1)) return true;
//         }
//         board[r][c] = temp;

//         return false;
//     }