import java.util.Scanner;
// class removeclassList {
//    static class Node{
//        int data;
//        Node next;

//        Node(int data){
//         this.data = data;
//         this.next = null;
//        }
//    }
// }
   /// Reverse linked list
//    public static Node reverseList(Node head){
//         if(head == null || head.next == null){
//             return head;
//         }
//          Node prevNode= head;
//          Node currNode = head.next;
//          while(currNode!=null){
//             Node nextNode = currNode.next;
//               currNode.next = prevNode;

//               prevNode =  currNode;
//               currNode = nextNode;

//          }

//          head.next = null;
//          head = prevNode;
//          return head;

//    }

//    static void printList(Node node){
//     while(node!=null){
//        System.out.print(node.data+"---->");
//        node = node.next;
//     }
//     System.out.println();
//    }

// //Reverse alternate nodes in Link List
//    public static void  rearrange(Node odd)
//     {
//        Node curr = odd;
//        Node tail = null;
       
//        while(curr!=null){
//            if(curr.next!=null){
//                Node nextNode = new Node(curr.next.data);
//                nextNode.next = tail;
               
//                tail = nextNode;
//                curr.next = curr.next.next;
//            }
           
//            if(curr.next ==null){
//                curr.next = tail;
//                break;
//            }  
//                 curr = curr.next;
//            }
          
//        }

//Rotate
// public Node rotate(Node head, int k) {
//     Node first = head;
//     Node tail = head;
    
    
//     while(tail.next!=null){
//         tail = tail.next;
//     }
    
//     while(k>0){
//         tail.next = first;
//         first = first.next;
//         tail = tail.next;
//         tail.next = null;
//         k--;
        
//     }
//     return first;
// }
 class Node{
       int data;
       Node next;

       Node(int data){
        this.data = data;
        this.next = null;
       }
    }
public class linkedlistProblems{
      
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
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
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

///////////////////////////////////////////////////
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the T number");
    //     int t = sc.nextInt();
    //     System.out.println("Enter the N number");
    //     while(t>0){
            
    //      int n = sc.nextInt();
    //     Node head = new Node(sc.nextInt());
    //     Node tail = head;
    //     for(int i = 0;i<n-1;i++){
    //         tail.next = new Node(sc.nextInt());
    //         tail = tail.next;
    //     }
    //     linkedlistProblems obj = new linkedlistProblems();
    //     head = obj.reverseList(head);
    //     printList(head);
      
    //     t--;
    // }
///////////////////////////////////////////////////////////////////////
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the T number for loop");
//         int t = sc.nextInt();
//            while(t>0){ 
//             int n = sc.nextInt();
//          int a = sc.nextInt();
//         Node head = new Node(a);
//         Node tail = head;
//         for(int i = 0;i<n-1;i++){
//              a = sc.nextInt();
//             tail.next = new Node(a);
//             tail = tail.next;
//         }
//         int k = sc.nextInt();
//         linkedlistProblems obj = new linkedlistProblems();
//         head = obj.rotate(head,k);
//         printList(head);
//         t--;
//}
////////////////////////////////////////////////////////// 
//////////////////////////////////////////////////////////

//Reverse alternate nodes in Link List
// Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the T number for loop");
//         int t = sc.nextInt();
//            while(t-->0){ 
//         int n = sc.nextInt();
//          int a = sc.nextInt();
//         Node head = new Node(a);
//         Node tail = head;
//         for(int i = 1;i<n;i++){
//              int b = sc.nextInt();
//             tail.next = new Node(b);
//             tail = tail.next;
//         }
        
//         linkedlistProblems obj = new linkedlistProblems();
//         obj.rearrange(head);
//         printList();
        
//     }
///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////
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
          

        rb.head = rb.removeDuplicates(head);
        rb.printList();
       
        
    }

    }
       }
    

