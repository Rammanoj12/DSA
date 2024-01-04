import java.lang.StringBuilder;

public class LL{
    Node head;
    private int size=0;
   
    public class Node{
        String data;
        Node next;
        

        Node(String data){
            this.data=data;
            this.next=null;
            size++;

        }
    }
    // to addfirst
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head = newNode;

    }



    //to addlast
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;


    }
    //to printlist
    public void printList(){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.println("Null");


    }
    //to deletefirst
    public  void deleteFirst() {
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head=head.next;
        
    }


    //to deletelast
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        
        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            secondLastNode = secondLastNode.next;
            lastNode=lastNode.next;
        }
        secondLastNode.next=null;

    }
    
    //to getlist
    public int  getList(){
        return size;
    }
    //TO REVERSE A LINKED LIST

    public void reverseList(){
        if(head==null|| head.next==null){
            return;
        }
        
        Node previousNode = head;
        Node currentNode = head.next;
        while(currentNode.next!=null){
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;
            //update
            
            previousNode = currentNode;
            currentNode = nextNode;
            
            
        }
        head.next = null;
        head=previousNode;
        
        
        



    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("RAMA");

        
        list.addFirst("SEETA");
        
        list.addFirst("ALETI");
        
        list.addLast("MANOJ");
        list.printList();

        list.reverseList();
        list.printList();
        
        

        


    }
}