// Given a string str and a pattern pat. You need to check whether the pattern is present or not in the given string. 

// Example 1:-

// Input:

// 2
// abcdefh
// bcd
// axzy
// xy

// Output:
// Present
// Not present

public class patternmatching {
    public static boolean searchPattern(String str, String pat) {
        if(str.length() == 0 || pat.length() == 0){
            return false;
        }
        int reverse = pat.length()-1;
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i) == pat.charAt(reverse)){
                reverse--;
                if(reverse < 0){
                    return true;
                }
                
            }else{
              reverse = pat.length()-1;
                }
            
        }
        return false;
    }
    public static void main(String[] args) {
        String str= "abcdefh";
        String pat= "bcd";
        boolean result = searchPattern(str,pat);
        System.out.println(result);
    }
}
