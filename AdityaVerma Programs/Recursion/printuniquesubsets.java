import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.*;
//Time - O(2^N) space  - O(2^N *N)--The space complexity is also high due to the usage of LinkedHashSet to store unique subsets. 
//                                     In the worst case, you could have 2^n subsets, each with an average size of n/2. Therefore, 
//                                     the space complexity is also O(2^n * n).
public class printuniquesubsets {
     public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n){

      // Arrays.sort(arr);
       LinkedHashSet<ArrayList<Integer>> res = new LinkedHashSet<>();
       //HashMap<Integer,ArrayList<Integer>>  res = new HashMap<>();
        //HashSet <ArrayList <Integer>> res = new HashSet<>();

        ArrayList<Integer> set = new ArrayList<>();

      res.add(set);

        store(res,set,arr,0);

        return new ArrayList<>(res);

    }

    static void store(LinkedHashSet<ArrayList <Integer>> res,  ArrayList<Integer> set,int arr[], int index){

        if(index == arr.length) {
            return ;
        }
        

           set.add(arr[index]);

           res.add(new ArrayList<>(set));

           store(res,set,arr,index+1);

           set.remove(set.size()-1);

           store(res,set,arr,index+1);

    }
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int n = arr.length;
         ArrayList <ArrayList <Integer>> result = AllSubsets(arr,n);
         System.out.println(result);
    }
}
