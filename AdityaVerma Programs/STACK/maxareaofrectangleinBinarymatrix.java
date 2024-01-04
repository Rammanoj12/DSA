// Given a binary matrix M of size n X m. Find the maximum area of a rectangle formed only of 1s in the given matrix.

// Example 1:

// Input:
// n = 4, m = 4
// M[][] = {{0 1 1 0},
//          {1 1 1 1},
//          {1 1 1 1},
//          {1 1 0 0}}
// Output: 8
// Explanation: For the above test case the
// matrix will look like
// 0 1 1 0
//Time - O(N*M) --SPACE--O(N)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
class pair{
    int first;
    int second;
    pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}


public class maxareaofrectangleinBinarymatrix {
     static int[] nsr(int[] arr,int n){
    Stack<pair> s = new Stack<>();
    int[] rs = new int[n];
    int pseudo_index = n;
    for(int i = n-1;i>=0;i--){
       if(s.isEmpty() || s.size() ==0){
        rs[i] = pseudo_index;
       }
       else if(s.size()!=0 && s.peek().first<arr[i]){
        rs[i] = s.peek().second;
       }
       else if(s.size()!=0 && s.peek().first>=arr[i]){
        while(s.size()!=0 && s.peek().first>=arr[i]){
            s.pop();
        }
        if(s.size()==0){
            rs[i]=pseudo_index;
        }else{
            rs[i] = s.peek().second;
        }
       }
       s.push(new pair(arr[i], i));
    }
    //reverse rs
    Collections.reverse(Arrays.asList(rs));
     return rs;
  }

  static int[] nsl(int[] arr,int n){
     Stack<pair> s = new Stack<>();
    int[] ls = new int[n];
    int pseudo_index = -1;
    for(int i = 0;i<n;i++){
       if(s.isEmpty() || s.size() ==0){
        ls[i] = pseudo_index;
       }
       else if(s.size()!=0 && s.peek().first<arr[i]){
        ls[i] = s.peek().second;
       }
       else if(s.size()!=0 && s.peek().first>=arr[i]){
        while(s.size()!=0 && s.peek().first>=arr[i]){
            s.pop();
        }
        if(s.size()==0){
            ls[i]=pseudo_index;
        }else{
            ls[i] = s.peek().second;
        }
       }
       s.push(new pair(arr[i], i));
    }
    return ls;
    
  }


    static int mah(int[] arr, int n){
        int[] width = new int[n];
        int[] area = new int[n];
        int max= Integer.MIN_VALUE;
        int[] right = nsr(arr,n);
        int[] left = nsl(arr,n);
        for(int i =0;i<n;i++){
            width[i] = right[i] -left[i] -1;
        }

        for(int i =0;i<n;i++){
            area[i] = arr[i] * width[i];
            if(area[i]>max){
                max = area[i];
            }
        }
        return max;
         
         
           
    }

    static void solve(int[][] arr,int n){
        int[] v= new int[n];
        int max= mah(v,n);
        for(int i=0;i<n;i++){
         v[i] = arr[0][i];
        }
        for(int i =1;i<n;i++){
            for(int j =0;j<n;j++){
                if(arr[i][j]==0){
                  v[j] =0;
                }else{
                    v[j] = v[j] +arr[i][j];
                }
                
            }
            max= Math.max(max,mah(v,n));
        }


        System.out.println(max);
    }
    public static void main(String[] args) {
        int[][] arr ={{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
      int n = arr.length;
        solve(arr,n);
    }
}

////GFG All test cases pass
// class pair{
//     int first;
//     int second;
//     pair(int first,int second){
//         this.first = first;
//         this.second = second;
//     }
// }
// /*Complete the function given below*/
// class Solution {
//      static int[] nsr(int[] arr,int n){
//     Stack<pair> s = new Stack<>();
//     int[] rs = new int[n];
//     int pseudo_index = n;
//     for(int i = n-1;i>=0;i--){
//        if(s.isEmpty() || s.size() ==0){
//         rs[i] = pseudo_index;
//        }
//        else if(s.size()!=0 && s.peek().first<arr[i]){
//         rs[i] = s.peek().second;
//        }
//        else if(s.size()!=0 && s.peek().first>=arr[i]){
//         while(s.size()!=0 && s.peek().first>=arr[i]){
//             s.pop();
//         }
//         if(s.size()==0){
//             rs[i]=pseudo_index;
//         }else{
//             rs[i] = s.peek().second;
//         }
//        }
//        s.push(new pair(arr[i], i));
//     }
//     //reverse rs
//     Collections.reverse(Arrays.asList(rs));
//      return rs;
//   }

//   static int[] nsl(int[] arr,int n){
//      Stack<pair> s = new Stack<>();
//     int[] ls = new int[n];
//     int pseudo_index = -1;
//     for(int i = 0;i<n;i++){
//        if(s.isEmpty() || s.size() ==0){
//         ls[i] = pseudo_index;
//        }
//        else if(s.size()!=0 && s.peek().first<arr[i]){
//         ls[i] = s.peek().second;
//        }
//        else if(s.size()!=0 && s.peek().first>=arr[i]){
//         while(s.size()!=0 && s.peek().first>=arr[i]){
//             s.pop();
//         }
//         if(s.size()==0){
//             ls[i]=pseudo_index;
//         }else{
//             ls[i] = s.peek().second;
//         }
//        }
//        s.push(new pair(arr[i], i));
//     }
//     return ls;
    
//   }


//     static int mah(int[] arr){
//         int n = arr.length;
//         int[] width = new int[n];
//         int[] area = new int[n];
//         int max= Integer.MIN_VALUE;
//         int[] right = nsr(arr,n);
//         int[] left = nsl(arr,n);
//         for(int i =0;i<n;i++){
//             width[i] = right[i] -left[i] -1;
//         }

//         for(int i =0;i<n;i++){
//             area[i] = arr[i] * width[i];
//             if(area[i]>max){
//                 max = area[i];
//             }
//         }
//         return max;
         
         
           
//     }

//     public int maxArea(int arr[][], int n, int m) {
//          int[] v= new int[m];
       
//         for(int j=0;j<m;j++){
//          v[j] = arr[0][j];
//         }
//          int max= mah(v);
//         for(int i =1;i<n;i++){
//             for(int j =0;j<m;j++){
//                 if(arr[i][j]==0){
//                   v[j] =0;
//                 }else{
//                     v[j] = v[j] +arr[i][j];
//                 }
                
//             }
//             max= Math.max(max,mah(v));
//         }


//         return max;
//     }
// }