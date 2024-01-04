// Print all permutations of a string keeping the sequence but changing cases.

// Examples: 

// Input : ab
// Output : AB Ab ab aB

public class permutationswithcasechange {
    static void solve(String ip,String op){
        if(ip.length() ==0){
        System.out.println(op);
          
          return;
        }
        String op1 =(op+ip.charAt(0)).toLowerCase();
        String op2 =(op+ip.charAt(0)).toUpperCase();
       solve(ip.substring(1), op1);
        solve(ip.substring(1), op2);
        
}
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<>();
        String ip = "AB";
        String op ="";
        //This condition is only applicable to permutationswithspaces 
        // and this restricts the firt character and calls the function
        // op+=ip.charAt(0);
        // ip=ip.substring(1);
        solve(ip,op);
      
        
        
    }
}
