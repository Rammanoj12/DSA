// Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle in a fixed direction.
// After each operation, the count will start from k+1th person. The task is to choose the safe place in the circle so that when you perform these operations starting from 1st place in the circle, you are the last one remaining and survive.

// Example 1:

// Input:
// n = 3 k = 2
// Output: 3
// Explanation: There are 3 persons so 
// skipping 1 person i.e 1st person 2nd 
// person will be killed. Thus the safe 
// position is 3.

import java.util.ArrayList;

public class josephus {
    static void solve(ArrayList<Integer> list,int k,int index,int ans){
     if(list.size()==1){
       ans = list.get(0);
       System.out.println(ans);
        return;
     }
     index = (index+k-1) % list.size();
     list.remove(index);
     solve(list, k, index, ans);
     
    }
    public static void main(String[] args) {
        int n =3;
        int k =2;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1;i<=n;i++){
            list.add(i);
        }
       
        int ans =-1;
        int index =0;
        solve(list,k,index,ans);
    }
}
