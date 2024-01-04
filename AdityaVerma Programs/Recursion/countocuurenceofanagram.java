// Given a word pat and a text txt. Return the count of the occurrences of anagrams of the word in the text.

// Example 1:

// Input:
// txt = forxxorfxdofr
// pat = for
// Output: 3
// Explanation: for, orf and ofr appears
// in the txt, hence answer is 3.

import java.util.HashMap;

public class countocuurenceofanagram {
    static void solve(String S1,String S2){
        HashMap<Character,Integer> map = new HashMap<>();
        
       
          for(char ch1 : S2.toCharArray()){
            if(map.containsKey(ch1)){
                map.put(ch1, map.getOrDefault(ch1, 0)+1);
            }else{
                map.put(ch1, 1);
            }
        }
        // for(int a =0;a<S2.length();a++){
        //    char ch1 = S2.charAt(a);
        //    if(map.containsKey(ch1)){
        //     map.put(ch1,map.get(ch1)+1);
        //    }else{
        //     map.put(ch1, 1);
        //    }
        // }
         int count = map.size();
         int ans =0;
        int i=0;
        int j=0;
        int k = S2.length();
        int size = S1.length();
        while(j<size){
            char ch2 = S1.charAt(j);
            if(map.containsKey(ch2)){
                map.put(ch2, map.get(ch2)-1);
                if(map.get(ch2) == 0 ){
                count--;
            }
            }
           if(j-i+1<k){
                j++;
                continue;
            }
             if(j-i+1 == k){
                if(count ==0){
                    ans++;
                }
                char ch3 = S1.charAt(i);
             
                 if(map.containsKey(ch3)){
                     map.put(ch3, map.get(ch3)+1);
              
                if(map.get(ch3) == 1){
                count++;
            }
             
            }
            i++;
           
            }
             
            j++;
        }

      System.out.println(ans);
    }
    public static void main(String[] args) {
         String txt ="aabaabaa";
         String ptr = "aaba";
         solve(txt,ptr);
    }
}

