// Given an integer N representing the number of pairs of parentheses, the task is to generate all combinations of well-formed(balanced) parentheses.


// Example 1:

// Input:
// N = 3
// Output:
// ((()))
// (()())
// (())()
// ()(())
// ()()()
//Time -0(4^N/SQUARE.ROOT OF N) AND SAME FOR SPACE

/// general recursive returning string value;
// public class generatebalancedparenthesis{
//     static void solve(int n,int open,int close,String op){
//         if(open == 0 && close ==0){
//             System.out.print(op+" ");
//         }

//         String op1 =op;
//         String op2 =op;
//         if(open!=0){
//             op1 = op1+"(";
//             solve(n, open-1, close, op1);
//         }

//         if(close>open){
//             op2 = op2+")";
//             solve(n, open, close-1, op2);
//         }
//     } 
//     public static void main(String[] args) {
//         int n =2;
//         int open =n;
//         int close =n;
//         String op ="";
//         solve(n,open,close,op);
//     }
// }

//returning ArrayList
// class Solution {
//     static  ArrayList<String> solve(int n,int open,int close,String op,ArrayList<String> list){
//         if(open == 0 && close ==0){
//              list.add(op);
            
//         }
//         String op1 =op;
//         String op2 =op;
//         if(open!=0){
//             op1+="(";
//             solve(n,open-1,close,op1,list);
//         }
        
//         if(close>open){
//              op2+=")";
//             solve(n,open,close-1,op2,list);
//         }
        
//         return list;
//     }
    
//     public List<String> AllParenthesis(int n) 
//     {
      
//       int open =n;
//        int close =n;
//        String op ="";
//       ArrayList<String> list = new ArrayList<String>();
//        list =  solve(n,open,close,op,list);
//        return list;
//     }
    
// }