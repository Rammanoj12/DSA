import java.util.Stack;

public class parenthesis {
    public static  boolean isvalid(String x){
    Stack<Character> s = new Stack<Character>();
        
        for(char i : x.toCharArray()){
            if(i == '('){
                s.push(')');
            }else if(i == '{'){
                s.push('}');
            }else if(i == '['){
                s.push(']');
                //first it checks the stack is empty, if it is empty it returns false
                //but if it not empty it pops and checks with the string.
                
                //else if( s.pop()!=i || s.isEmpty())----> If we are checking with matching string at first then 
                //in this case, it will return false for any closing bracket that doesn't 
                //immediately match the last opened bracket, even if there are valid opening and closing brackets later in the string. 
            }else if(s.isEmpty() || s.pop()!=i ){
                return false;
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        String x ="{}";
        if(isvalid(x)){
            System.out.println("Balanced");
        }else{
            System.out.println("Unbalanced");
        }
     
}
}