// Given are N ropes of different lengths, the task is to connect these ropes into one rope with minimum cost, 
//such that the cost to connect two ropes is equal to the sum of their lengths.

// Examples:

// Input: arr[] = {4,3,2,6} , N = 4
// Output: 29



//One way
// public class connectRopesToMinimisetheCost {
//     static void solve(int[] arr,int n){
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         int ans =0 ;
//         for(int key:arr){
//             pq.add(key);
//         }
//             while(pq.size()!=1){
//                 int x1 = pq.poll();
//                 int x2 = pq.poll();
//                 int temp = x1+x2;
//                 ans+=temp;
//                 pq.add(temp);
   
//             }
            
        
//         System.out.println(ans);
//     }
//     public static void main(String[] args) {
//         int[] arr ={1,2,3,4,5};
//         int n = arr.length;
//         solve(arr,n);
//     }
// }
