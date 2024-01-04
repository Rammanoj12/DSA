//Use only loop method do not use recursive index

import java.util.*;
public class permutationsofstring {
   static void solve(String s,String newString){
    ArrayList<String> list = new ArrayList<>();
    if(s.length()==0){
        list.add(newString);
        System.out.print(list);
    }
    for(int i =0;i<s.length();i++){
        char curr = s.charAt(i);
       String permutation = s.substring(0, i)+s.substring(i+1);
        solve(permutation, newString+curr);
    }
   }
    public static void main(String[] args) {
        String s ="abc";
        String newString ="";
        solve(s,newString);
    }
}
