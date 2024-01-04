// You are given N elements and your task is to Implement a Stack in which you can get a minimum element in O(1) time.

// Example 1:

// Input:
// push(2)
// push(3)
// pop()
// getMin()
// push(1)
// getMin()
// Output: 2 1
// Explanation: In the first test case for
// query 
// push(2)  Insert 2 into the stack.
//          The stack will be {2}
// push(3)  Insert 3 into the stack.
//          The stack will be {2 3}
// pop()    Remove top element from stack 
//          Poped element will be 3 the
//          stack will be {2}
// getMin() Return the minimum element
//          min element will be 2 
// push(1)  Insert 1 into the stack.
//          The stack will be {2 1}
// getMin() Return the minimum element
//min element will be 1


import java.util.Stack;

//GFG Code
// class GfG
// {
//     int minEle;
//     Stack<Integer> s;
    
//     // Constructor    
//     GfG()
// 	{
//         s = new Stack<>();
        
// 	}
	
//     /*returns min element from stack*/
//     int getMin()
//     {
// 	   if(s.size() == 0){
// 	       return -1;
// 	   }else{
// 	        return minEle;
// 	   }
//     }
    
//     /*returns poped element from stack*/
//     int pop()
//     {
// 	 if(s.size() == 0){
// 	     return -1;
// 	 }
// 	     int top =s.pop();
// 	     if(top<minEle){
// 	         int popelement = minEle;
// 	         minEle = 2 * minEle -top;
// 	         return popelement;
// 	     }
	 
// 	 return top;
//     }

//     /*push element x into the stack*/
//     void push(int x)
//     {
// 	   if(s.size() == 0){
// 	       s.push(x);
// 	       minEle = x;
// 	   }else if(x>=minEle){
// 	           s.push(x);
// 	       }else if(x<= minEle){
// 	           s.push(2*x-minEle);
// 	           minEle = x;
// 	       }
// 	       }
// 	   }	
    	


////////////////////////////////////////////////////////////////////////
//Self code
class MinStack {
    private Stack<Integer> mainStack;
    static int min_element;

    public MinStack() {
        mainStack = new Stack<>();
       
    }

    public void push(int x) {
       if(mainStack.size()==0){
        mainStack.push(x);
        min_element =x;
       }else{
        if(x>=min_element){
            mainStack.push(x);
        }else if(x<min_element){
            mainStack.push(2*x-min_element);
            min_element =x;
        }
       }
    }

    public void pop() {
        if(mainStack.size()==0){
            System.out.println("-1");
        }else{
            if(mainStack.peek()>=min_element){
                mainStack.pop();
            }
            else if(mainStack.peek()<min_element){
                min_element =  2 *min_element -mainStack.peek();
                mainStack.pop();
            }
        }
    }

    public int top() {
      if(mainStack.size()==0){
        System.out.println("-1");
      }else{
        if(mainStack.peek()>=min_element){
            return mainStack.pop();
        }elseif(mainStack.pop()<min_element){
            return min_element;
        }
      }
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }
}

public class implementminimumstackwith1space {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(5);
        System.out.println("Minimum: " + minStack.getMin()); // Output: 3

        minStack.push(2);
        System.out.println("Minimum: " + minStack.getMin()); // Output: 2

      
        minStack.push(2);
       
       
        System.out.println("Top: " + minStack.top()); // Output: 5
        System.out.println("Minimum: " + minStack.getMin()); // Output: 3
       
                

    }
}
