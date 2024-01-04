
// John is at a toy store help him pick maximum number of toys. He can only select in a continuous manner and he can select only two types of toys.


// Example:
// Input:
// 1
// abaccab
////////////////////////////////////////////////////

//Fruit in baskets
// You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

// You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

// You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
// Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
// Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
// Given the integer array fruits, return the maximum number of fruits you can pick.

 

// Example 1:

// Input: fruits = [1,2,1]
// Output: 3
// Explanation: We can pick from all 3 trees.
import java.util.HashMap;
//Using input array or string
public class picktoys {
    // static void solve(String s,int k){
  static void solve(int[] arr,int k){
    //  HashMap<Character,Integer> map = new HashMap<>();
    HashMap<Integer,Integer> map = new HashMap<>();
        int i =0,j=0;
        int count = map.size();
        int max= Integer.MIN_VALUE;
        // int size = s.length();
        int size = arr.length;
        while(j<size){
            // char ch = s.charAt(j);
            int ch1 = arr[j];
            map.put(ch1,map.getOrDefault(ch1,0)+1);
            if(map.get(ch1) ==1){
                count ++;
            }

          if(count <=k){
                max= Math.max(max,j-i+1);
                j++;
            }else if(count > k){
                while(count>k){
                    // char ch1 = s.charAt(i);
                    int ch2 = arr[i];
                    map.put(ch2,map.get(ch2)-1);
                    if(map.get(ch2) == 0){
                        map.remove(ch2);
                        count --;
                    }
                    i++;
                }
                j++;
            }
        }
        if(max == Integer.MIN_VALUE){
            System.out.println(-1);
        }else{
           System.out.println(max);
        }
    }
    public static void main(String[] args) {
        //String s ="abaccab";
        int[] arr = {1,2,3,2,2};
        int k =2;
        //solve(s,k);
        solve(arr,k);
    }
}
