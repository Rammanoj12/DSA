// Given an array A[] of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first.
// If frequencies of two elements are same, then smaller number comes first.

// Input:
// The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

// Output:
// For each testcase, in a new line, print each sorted array in a seperate line. For each array its numbers should be seperated by space.

// Constraints:
// 1 ≤ T ≤ 70
// 1 ≤ N ≤ 130
// 1 ≤ Ai ≤ 60 

// Example:
// Input:
// 2
// 5
// 5 5 4 6 4
///Time --O(n * log(n)) Space - O(N)
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class frequencysort2 {
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
      HashMap<Integer,Integer> hm=new HashMap<>();
      ArrayList<Integer> ll=new ArrayList<>();
      
      for(int i:arr)
      {
          hm.put(i,hm.getOrDefault(i,0)+1);
      }
      PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
          if(hm.get(a)==hm.get(b))
          {
              return a-b;
          }
          else
          {
              return hm.get(b)-hm.get(a);
          }
      });
       for (int x: hm.keySet()) {
        
            pq.offer(x);
        }
      while(!pq.isEmpty())
      {
          int y=pq.poll();
          for(int m=0;m<hm.get(y);m++)
          {
              ll.add(y);
          }
      }
      return ll;
    }
    public static void main(String[] args) {
        int[] arr ={5,5,4,6,4};
        int n = arr.length;
        ArrayList<Integer> list = sortByFreq(arr, n);
        System.out.println(list);
    }
}
////////////////////////////////////////////////////////////

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class GFG {
// 	public static void main (String[] args) {
// 		Scanner sc= new Scanner(System.in);
// 		int T= sc.nextInt();
// 		while(T>0){
// 		    int n = sc.nextInt();
// 		    int[] arr = new int[n];
// 		    for(int j =0;j<n;j++){
// 		        arr[j] = sc.nextInt();
// 		    }
// 		    T--;
		
// 		HashMap<Integer,Integer> hm=new HashMap<>();
//       ArrayList<Integer> ll=new ArrayList<>();
      
//       for(int i:arr)
//       {
//           hm.put(i,hm.getOrDefault(i,0)+1);
//       }
//       PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
//           if(hm.get(a)==hm.get(b))
//           {
//               return a-b;
//           }
//           else
//           {
//               return hm.get(b)-hm.get(a);
//           }
//       });
//        for (int x: hm.keySet()) {
        
//             pq.offer(x);
//         }
//       while(!pq.isEmpty())
//       {
//           int y=pq.poll();
//           for(int m=0;m<hm.get(y);m++)
//           {
//              System.out.print(y+" ");
//           }
//       }
//       System.out.println();
      
// 	}
	
// }
// }