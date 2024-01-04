import java.util.Scanner;

class Node{
       int data;
       Node next;

       Node(int data){
        this.data = data;
        this.next = null;
       }
    }

public class duplicateLinkedlist {
    
    Node head;
    Node tail;
    public void addtoLast(Node node){
        if(head==null){
           head= node;
           tail =node;
        }else{
            tail.next = node;
            tail=node;
        }
    }
    void printList(){
        // if(head==null){
        //     System.out.println("The list is empty");
        //     return;
        // }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

Node removeDuplicates(Node head)
{
     if(head==null || head.next == null){
        return head;
    }
    
    Node currNode = head;
    
    while(currNode.next!=null){
        if(currNode.data==currNode.next.data){
            currNode.next = currNode.next.next;
        }else{
            currNode = currNode.next;
        }
            
}
    
    return head;
}
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the T number for loop");
        int t = sc.nextInt();
           while(t-->0){ 
        int n = sc.nextInt();
        linkedlistProblems rb = new linkedlistProblems();
         int a = sc.nextInt();
        Node head = new Node(a);
        rb.addtoLast(head);
        for(int i = 1;i<n;i++){
             int b = sc.nextInt();
             rb.addtoLast(new Node(b));
        }
          

        head = rb.removeDuplicates(head);
        rb.printList();
       
        
    }
}
}

