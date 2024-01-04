public class moveallxtoend {
    static String newString ="";
    static int count =0;
    static void solve(String s,int index){
        if(index == s.length()){
          for(int i =0;i<count;i++){
            newString+='x';
          }
          System.out.println(newString);
          return;
        }
        
        char curr = s.charAt(index);
        if(curr =='x'){
            count++;
             solve(s, index+1);
        }else{
            newString+=curr;
             solve(s, index+1);
        }
        
    }
    public static void main(String[] args) {
        String s = "axbcxdd";
        int index =0 ;
        solve(s,index);
    }
}
