public class keypadcombination {
    static String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    static void solve(String str,int index,String newString){
        if(index ==str.length()){
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(index);
        String mapping = keypad[curr-'0'];
        for(int i =0;i<mapping.length();i++){
       solve(str,index+1,newString+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str ="24";
        int index =0;
        String newString ="";
        solve(str,index,newString);
    }
}
