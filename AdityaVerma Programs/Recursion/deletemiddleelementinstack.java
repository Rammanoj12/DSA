// Given a stack, delete the middle element of the stack without using any additional data structure.
// Middle element:- floor((size_of_stack+1)/2) (1-based indexing) from bottom of the stack.

// Note: The output shown by the compiler is the stack from top to bottom.
 
// Example 1:

// Input: 
// Stack = {10, 20, 30, 40, 50}
// Output:
// ModifiedStack = {10, 20, 40, 50}
// Explanation:
// If you print the stack the bottom-most element will be 10 and the top-most element will be 50. Middle element will be element at index 3 from bottom, which is 30. 
// Deleting 30, stack will look like {10 20 40 50}.

import java.util.Stack;

public class deletemiddleelementinstack {
    static void deleteelement(Stack<Integer> s,int size){
        int mid = size/2 +1;
        if(s.size()==0 || s.isEmpty()){
            System.out.println(s);
        }
        Stack<Integer> new_Stack = solve(s,mid,size);
        //To print in original stack
        // while(!new_Stack.isEmpty()){
        //     System.out.print(new_Stack.peek()+" ");
        //     new_Stack.pop();
        // }
        //ouput
        // 11 6 9 5 5 5 9 9 8 6 12 

        System.out.print(new_Stack+" ");
        //output
        // [12, 6, 8, 9, 9, 5, 5, 5, 9, 6, 11] 

    }

    static Stack<Integer> solve (Stack<Integer> s,int  mid,int size){
        //int k =10;
        if(mid == size){
            s.pop();
            //insertion
            //s.push(k);

            return s;
        }

        int top = s.peek();
        s.pop();
        s = solve(s,mid,size-1);
        s.push(top);
        return s;
    }
    public static void main(String[] args) {
        int[] stack = {12, 6 ,8 ,9 ,9 ,5, 11 ,5, 5 ,9 ,6 ,11};
        Stack<Integer> s = new Stack<>();
        int size = stack.length;
        for(int i= 0;i<size;i++){
            s.push(stack[i]);
        }
        deleteelement(s,size);
    }
}
