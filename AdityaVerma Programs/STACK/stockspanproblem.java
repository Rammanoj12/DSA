// The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate the span of stocks price for all n days. 
// The span Si of the stocks price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the given day is less than or equal to its price on the current day.
// For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}.

// Example 1:

// Input: 
// N = 7, price[] = [100 80 60 70 60 75 85]
// Output:
// 1 1 1 2 1 4 6

import java.util.Stack;

//  class pair{
//     int first;
//     int second;
//     pair(int first,int second){
//         this.first = first;
//         this.second = second;
//     }
// }
// public class stockspanproblem{
//     static void solve(int[] arr, int n){
//       Stack<pair> s = new Stack<>();
//       int[]  v = new int[n];
//       int k = n-1;
//       for(int i =0;i<n;i++){
//         if(s.isEmpty() || s.size()==0){
//               v[i] = -1;
//         }
//         else if(s.size()!=0 && s.peek().first>arr[i]){
//             v[i] = s.peek().second;
//         }
//         else if(s.size()!=0 && s.peek().first<=arr[i]){
//             while (s.size()!=0 && s.peek().first<=arr[i]) {
//                 s.pop();
//                 if(s.size() == 0){
//                     v[i] =-1;
//                 }else{
//                     v[i] =s.peek().second;
//                 }
                
//             }
//         }
//         s.push(new pair(arr[i], i));
//       }

//       for(int i =0;i<n;i++){
//         v[i] = i - v[i];
//       }

//       //print v array
//     for(int i =0;i<n;i++){
//         System.out.print(v[i]+" ");
//       }

//     }
//     public static void main(String[] args) {
//         int[] arr ={100,80,60,70,60,75,85};
//         int n = arr.length;
//         solve(arr,n);
//     }
// }


// public static int[] calculateSpan(int arr[], int n)
//     {
//         Stack<Integer> st = new Stack<>();
//         int ans []= new int[n];
//         for(int i = 0; i < n; i++)
//         {
//             while(!st.isEmpty() && arr[i] >= arr[st.peek()])
//                 st.pop();
//             if(st.isEmpty())
//                 ans[i] = i+1;
//             else
//                 ans[i] = i - st.peek() ;
//             st.push(i);
//         }
//         return ans;
//     }