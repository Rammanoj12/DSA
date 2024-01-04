// Given a positive integer N, the task is to find all the N bit binary numbers having more than or equal 1’s than 0’s for any prefix of the number.

// Example 1:

// Input:  N = 2
// Output: 11 10
// Explanation: 11 and 10 have more than 
// or equal 1's than 0's

import java.util.ArrayList;

public class printNbitBinaryNumbers {
    static  void helper(int n,int one,int zero,String op,ArrayList<String> list){
        if(n==0){
          list.add(op);
          return;
        }
       
          if(one>zero){
             String op1=op;
            String op2 =op;
            op1+='1';
            op2+='0';
            helper(n-1, one+1, zero, op1,list);
            helper(n-1, one, zero+1, op2,list);
        }else{
            op+='1';
            helper(n-1, one+1, zero, op,list);
        }
        
    }
    static ArrayList<String> solve(int n ) {
        
        ArrayList<String> list = new ArrayList<>();
        int one =0;
        int zero = 0;
        String op ="";
        helper(n,one,zero,op,list);
        return list;
    }
    public static void main(String[] args) {
        int n =2;
       ArrayList<String> result= solve(n);
        System.out.print(result);
        
        
    }
}
