class PalindroneOwn{
    static String isPalindrome(String str,int first,int last){
        if(first>=last){
            return "palindrome";
        }
        if(str.charAt(first)!=str.charAt(last)){
               
                return "Not a palindrome";
            }
        
        
        return isPalindrome(str, first+1, last-1);
    }
    public static void main(String[] args) {
      String str = "1151211";
      int first=0;
      int last = str.length()-1;
      String result=isPalindrome(str,first,last);
      System.out.println(result);
        
    }
}
