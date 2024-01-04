import java.util.Stack;


import java.util.Stack;

class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);

        // Update the minimum stack
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            // If the element being popped is the minimum, pop from the minStack as well
            if (mainStack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            mainStack.pop();
        }
    }

    public int top() {
        if (!mainStack.isEmpty()) {
            return mainStack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }
}

public class implementingminimunstackwithExtraSpace {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(5);
        System.out.println("Minimum: " + minStack.getMin()); // Output: 3

        minStack.push(2);
        System.out.println("Minimum: " + minStack.getMin()); // Output: 2

        minStack.pop();
        minStack.pop();
        minStack.push(-1);
       
       
        System.out.println("Top: " + minStack.top()); // Output: 5
        System.out.println("Minimum: " + minStack.getMin()); // Output: 3
       
                

    }
}
