// Given an array A[] of size N and a positive integer K, find the first negative integer for each and every window(contiguous subarray) of size K.

 

// Example 1:

// Input : 
// N = 5
// A[] = {-8, 2, 3, -6, 10}
// K = 2
// Output : 
// -8 0 -6 -6
// Explanation :
// First negative integer for each window of size k
// {-8, 2} = -8
// {2, 3} = 0 (does not contain a negative integer)
// {3, -6} = -6
// {-6, 10} = -6

import java.util.ArrayList;
//using arraylist
public class firstneagtiveintegerineverywindowofsizek {
    static void solve(int[] arr,int k){
        ArrayList<Integer> list = new ArrayList<>();
       
         int i =0,j=0;
         while(j<arr.length){
            if(arr[j]<0){
                list.add(arr[j]);
            }
                if(j-i+1 == k){
                    if(list.size() == 0){
                        System.out.print(0+" ");
                    }else{
                        System.out.print(list.get(0)+" ");
                        if(arr[i] == list.get(0)){
                            list.remove(0);
                        }
                    }
                    i++;
                    j++;
                }else if(j-i+1<k){
                    j++;
                }
            
         }

  
         
    }
    public static void main(String[] args) {
        int[] arr ={-8, 2, 3, -6, 10};
        int k =2;
        solve(arr,k);
    }
}
///////Uisng queue and long datatype array
// class Compute {
    
//   public long[] printFirstNegativeInteger(long A[], int N, int K)
//     {
//         long[] result = new long[N + 1 - K];
//         Arrays.fill(result, 0L);
        
//         Queue<Integer> negatives = new LinkedList<>();
//         for (int i = 0; i < N; i++) {
//             long curr = A[i];
            
//             if (curr < 0) negatives.offer(i);
            
//             // expanding the window until we reach the k size
//             if (i + 1 < K) continue;
            
            
//             // We need to remove all the indices 
//             // that are not in the current window range
//             while (!negatives.isEmpty() && negatives.peek() < i - K + 1) negatives.poll();
            
//             // negatives not empty means we still have a negative element that 
//             // is in the current window so we need to get the first one
//             if (!negatives.isEmpty()) result[i + 1 - K] = A[negatives.peek()];
//         }
        
//         return result;
//     }
  
         
    
// }
