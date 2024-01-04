public class LinkedlistConcept {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
           this.data = data;
           this.next = null;
        }
    }
//add first

public static void addFirst(int data){
    Node newNode = new Node(data);
     if(head == null){
       head = newNode;
       return;
     }
     newNode.next = head;
     head = newNode;
  
}

//printList

public static void printList(){
    if(head==null){
        System.out.println("List is empty");
    }
   Node currNode = head;
    while(currNode!=null){
        System.out.print(currNode.data+"-->");
        currNode = currNode.next;
    }
    System.out.println("NULL");
}

//addLast

public static void addLast(int data){
    Node newNode = new Node(data);

    Node currNode = head;

    while(currNode.next!=null){
        currNode =currNode.next;
    }
    currNode.next = newNode;
    if(head==null){
        head = newNode;
        return;
    }
}
//Deletefirst

public static void deleteFirst(){
    if(head ==null){
        System.out.println("Empty");
        return;
    }
    head = head.next;

}

//DeletLast

public static void deletelast(){
     if(head ==null){
        System.out.println("Empty");
        return;
    }
     if(head.next==null){
        head=null;
        return;
    }

    Node secondLastNode = head;
    Node lastNode = head.next;
    while(lastNode.next!=null){
          lastNode = lastNode.next;
          secondLastNode = secondLastNode.next;
    }
    secondLastNode.next = null;

}
// //Recurisve way
// public Node recursiveList(Node head){
//     if(head == null){
//         return head;
//     }
//     if(head.next==null){
//         return head;
//     }
//     Node newNode =recursiveList(head.next);
//     head.next.next = head;
//     head.next = null;
//     return newNode;
// }
//////////////////////////////////////////////////////
//Rearrange alternative nodes
// public static void rearrange(Node odd)
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
//           System.out.println(curr+" ");
//        }
///////////////////////////////////////////////


////Removeduplicates
public static  Node removeDuplicates(Node head)
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
    //Gives output value 
    //1-->2-->3-->4-->5-->2-->NULL
    //2-->output
    // System.out.println(currNode.data);
    return head;
}
//////////////////////////////////////////////
/////////////////////////////////////////////
////////////////////////////////////////////////////
    // public static Node pairwiseSwap(Node head)
    // {
    //     if(head ==null || head.next == null){
    //         return head;
    //     }
        
    //    Node prevNode = head;
    //    Node  currNode= head;
    //    head = currNode.next;
       
    //   while(currNode!=null && currNode.next!=null){
    //      // Node newNode = new Node(head.data);
         
    //      prevNode.next = currNode.next;
    //      Node temp = currNode.next.next;
    //      currNode.next.next = currNode;
    //      currNode.next = temp;
    //      prevNode = currNode;
    //      currNode = temp;
    //   }
    //   return head;
    // }
    
///////////////////////////////////////////////////////////
///DetectLoop
public static boolean detectLoop(Node head){
    Node first = head;
    Node second = head;
    
    while(first!=null && second!=null && first.next!=null){
      second = second.next;
      first= first.next.next;
      
      if(first==second){
          return true;
      }
    }
    return false;
}
     

    public static void main(String[] args) {
        LinkedlistConcept obj = new LinkedlistConcept();
      addFirst(1);
      addLast(2);
      addLast(3);
      addLast(4);
      addLast(5);
      addLast(2);
      printList();
    //   //head= pairwiseSwap(head);
    //   printList();
    //   boolean answer = detectLoop(head);
    //   System.out.println(answer);
      head = removeDuplicates(head);
      //System.out.println(head.data);
      printList();
      //rearrange(head);
     
      
    }
}
