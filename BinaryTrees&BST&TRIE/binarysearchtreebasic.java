class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=right=null;
    }
}
public class binarysearchtreebasic{
    static Node buildTree(Node root,int data){
       
        if(root == null){
            
            return new Node(data);
        }
        //If it is greater build left
        if(root.data>data){
           root.left= buildTree(root.left,data);
        }
        //If it is lesser build right
        if(root.data<data){
           root.right= buildTree(root.right,data);
        }
        return root;
    }

    static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int[] nodes ={5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<nodes.length;i++){
            root = buildTree(root, nodes[i]);
        }
           inorder(root);
       System.out.println();
    }
}
