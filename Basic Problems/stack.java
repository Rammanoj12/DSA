
public class stack {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    static class Stack{
        public static Node head = null;
        //Pushing the data in Linkedlist
        public static void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
               
            }
            newNode.next=head;
            head= newNode;
            
        }
        public static boolean isEmpty(){
            return head ==null;
        }

        //Pop the data from top node
        public static int pop(){
            if(head==null){
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;

        }
        //Just seeing the data
        public static int peek(){
            if(head==null){
                return -1;
            }
            Node top = head;
            return top.data;

      

    }
}
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
            
        }
        
        
    }
    

}



// class MyStack 
// {
    
//     StackNode top;
    
//     void push(int a) 
//     {
        
//         StackNode ele = new StackNode(a);
//         if(top == null){
//             top = ele;
//         }else{
//             ele.next = top;
//             top = ele;
            
//         }
  
//     }
    
//     int pop() 
//     {
     
//      if(top == null)
//      return -1;
     
//      int val = top.data;
//      top = top.next;
//      return val;
      
//     }
// }

