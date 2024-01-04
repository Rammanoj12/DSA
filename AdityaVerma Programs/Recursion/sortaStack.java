// Given a stack, the task is to sort it such that the top of the stack has the greatest element.

// Example 1:

// Input:
// Stack: 3 2 1
// Output: 3 2 1
// Example 2:

// Input:
// Stack: 11 2 32 3 41
// Output: 41 32 11 3 2

import java.util.Stack;

public class sortaStack {
    static Stack<Integer> insert(Stack<Integer> s,int top){
        if(s.size() == 0 || s.peek()<=top){
            s.push(top);
            return s;
        }

        int val = s.peek();
        s.pop();
        s = insert(s,top);
        s.push(val);
        return s;
    }
    static Stack<Integer> sort(Stack<Integer> s){
        if(s.size() ==1){
            return s;
        }
        int top = s.peek();
        s.pop();
        s= sort(s);
        s= insert(s,top);
        return s;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
         s.push(1);
         s.push(2);
         s.push(3);
         Stack<Integer> ss = sort(s);
         while(!ss.isEmpty()){
            System.out.println(ss.peek());
            ss.pop();
         }
    }
    
}
