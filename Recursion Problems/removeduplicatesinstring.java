public class removeduplicatesinstring {
    static boolean[] arr = new boolean[26];
    static void solve(String s,int index, String newString){
        if(index == s.length()){
            System.out.println(newString);
            return;
        }
        char curr = s.charAt(index);
        if(arr[curr-'a']==true){
            solve(s, index+1, newString);
        }else{
            newString+=curr;
            arr[curr-'a'] =true;
            solve(s, index+1, newString);
        }
    }
    public static void main(String[] args) {
        String s = "abbccda";
        int index =0;
        String newString ="";
        solve(s,index,newString);
    }
}
