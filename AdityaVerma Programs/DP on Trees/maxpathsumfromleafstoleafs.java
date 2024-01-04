//Maximum Path Sum between 2 Special Nodes
// Given a binary tree in which each node element contains a number. Find the maximum possible path sum from one special node to another special node.

// Note: Here special node is a node which is connected to exactly one different node.


// Example 1:

// Input:      
//            3                               
//          /    \                          
//        4       5                     
//       /  \      
//     -10   4                          
// Output: 16
// Explanation:
// Maximum Sum lies between special node 4 and 5.
// 4 + 4 + 3 + 5 = 16.
// Example 2:

// Input:    
//             -15                               
//          /      \                          
//         5         6                      
//       /  \       / \
//     -8    1     3   9
//    /  \              \
//   2   -3              0
//                      / \
//                     4  -1
//                        /
//                      10  
// Output:  27
// Explanation:
// The maximum possible sum from one special node 
// to another is (3 + 6 + 9 + 0 + -1 + 10 = 27)
class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left=right=null;
        }
    }
 
public class maxpathsumfromleafstoleafs {
          private int sum;
    
    public maxpathsumfromleafstoleafs() {
        this.sum = Integer.MIN_VALUE;
    }
   
    static int index = -1;
    static Node buildTree(int[] nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
   return newNode;

    }
   
    static int res = Integer.MIN_VALUE;
      
     int findMaxPathSum(Node root) {
     
        if (root == null) {
            return 0;
        }
        
        int lsum = findMaxPathSum(root.left);
        int rsum = findMaxPathSum(root.right);
        
        if (root.left == null && root.right == null) {
            return root.data;
        }
        
        if (root.left == null) {
            return root.data + rsum;
        }
        
        if (root.right == null) {
            return root.data + lsum;
        }
        
        this.sum = Math.max(this.sum, root.data + lsum + rsum);
        return Math.max(root.data + lsum, root.data + rsum);
    }
    
     int maxPathSum(Node root) {
        int ans = findMaxPathSum(root);
        
        if (root.left == null || root.right == null) {
            this.sum = Math.max(this.sum, ans);
        }
        
        return this.sum;
    }
    public static void main(String[] args) {
        //int[] nodes ={-15,5,-8,2,-1,-1,-3,-1,-1,1,-1,-1,6,3,-1,-1,9,-1,0,4,-1,-1,-1,10,-1};
       int[] nodes ={3,4,-10,-1,-1,4,-1,-1,5,-1,-1};
        Node root = buildTree(nodes);
        

        maxpathsumfromleafstoleafs obj = new maxpathsumfromleafstoleafs();
       System.out.println(obj.maxPathSum(root));
        
    }
}
