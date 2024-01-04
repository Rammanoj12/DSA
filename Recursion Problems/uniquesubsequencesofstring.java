import java.util.HashSet;

public class uniquesubsequencesofstring {
    static HashSet<String> set = new HashSet<>();
    static void solve(String s,int index,String newString){
        
        if(index == s.length()){
            if(set.contains(newString)){
                
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char curr = s.charAt(index);
        //Include
        solve(s, index+1, newString+curr);
        //Not Include
        solve(s, index+1, newString);
        

    }
    public static void main(String[] args) {
        String s ="ab";
        int index =0;
        String newString ="";
        solve(s,index,newString);
    }
}
