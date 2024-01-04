public class subsequencesofstring {
    static void solve(String s,int index,String newString){
        if(index == s.length()){
            System.out.println(newString);
            return;
        }
        char curr = s.charAt(index);
        //Include
        solve(s, index+1, newString+curr);
        //Dont Include
        solve(s, index+1, newString);
    }
    public static void main(String[] args) {
        String s ="abc";
        int index=0;
        String newString ="";
        solve(s,index,newString);
    }
}
