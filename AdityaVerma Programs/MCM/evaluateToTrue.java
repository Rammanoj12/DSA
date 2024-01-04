

import java.util.HashMap;

public class evaluateToTrue {
    static int solve(String s,int i,int j,int isTrue,HashMap<String,Integer> map){
        String key = s + "|" + isTrue;
        if(map.containsKey(key)){
            return map.get(key);
        }

        

        int ans =0;
        //    if(i>j){
        //     return 0;
        //    }
        //    if(i==j){
        //     if(isTrue ==1){
        //         if(s.charAt(i)=='T'){
        //             return 1;
        //         }else{
        //             return 0;
        //         }
        //     }
        //    }

        // if(i ==j){
        //     if(isTrue ==1){
        //         return s.charAt(i)=='T'?1:0;
        //     }else{
        //         return s.charAt(i)=='F'?1:0;
        //     }
        // }
        // if(dp[i][j][isTrue]!=-1){
        //     return dp[i][j][isTrue];
        // }
        
      for(int k =i+1;k<j;k=k+2){
        int lt = solve(s, i, k-1,1,map);
        int lf = solve(s, i, k-1, 0,map);
        int rt = solve(s, k+1, j, 1,map);
        int rf = solve(s, k+1, j, 0,map);

        if(s.charAt(k)=='&'){
            if(isTrue ==1){
             ans = ans+lt *rt;
            }else{
            ans = ans+lt * rf+lf*rt+lf*rf;

            }
        }else if(s.charAt(k)=='|'){
            if(isTrue ==1){
           ans = ans+lt *rt+lf*rf+lf*rt;
            }else{
            ans = ans+lf*rf;
        }
        }else if(s.charAt(k)=='^'){
            if(isTrue ==1){
             ans = ans+lf*rt+lt * rf;
            }else{
            ans = ans+lf*rf+lt *rt;
           
        }
        }
        
      }
     
      map.put(key,ans);

    

//dp[i][j][isTrue]=ans;
return ans;
    }
    public static void main(String[] args) {
         String s ="T|T&F";
            int i=0;
           //int j =s.length()-1;
           int isTrue =1;
        //    int result = solve(s, i, j,isTrue);
        //  System.out.println(result);

        // String symbols ="TTFT";
        // String operators ="&|^";
        // StringBuilder sb = new StringBuilder();
        // int E =0;
        // for(int a=0;a<sb.length();a++){
        //     sb.append(symbols.charAt(a));
        //     a++;
        //     if(E<operators.length()){
        //         sb.append(operators.charAt(E));
        //          E++;
        //     }
        // }
        
        // String newString= sb.toString();
        // int n = newString.length();
        //   int j =n-1;
        // int result = solve(newString, i, j,isTrue);
        //  System.out.println(result);

    //    //Using Hashmap
     int N = s.length();
        int j =N-1;
        HashMap<String,Integer> map = new HashMap<>();
        // map.put("T",1);
        // map.put("F",0);
        int result = solve(s, i, j,1,map);
        System.out.println(result);
    //     //Using dp array
        // int N = s.length();
        // int j =N-1;
        // int[][][] dp = new int[N+1][N+1][2];
        // for(int a =0;a<=N;a++){
        //     for(int b =0;b<=N;b++){
        //         for(int c= 0;c<2;c++){
        //               dp[a][b][c]=-1;
        //         }
                
        //     }
        // }
        // int result = solve(s, i, j,1,dp);
        // System.out.println(result);
        
    }
    
}
