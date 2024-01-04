//Maximum path sum from any node
// Given a binary tree, the task is to find the maximum path sum. The path may start and end at any node in the tree.

// Example 1:

// Input:
//      10
//     /  \
//    2   -25
//   / \  /  \
//  20 1  3  4
// Output: 32
// Explanation: Path in the given tree goes
// like 10 , 2 , 20 which gives the max
// sum as 32.

import java.util.*;
class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left=right=null;
        }
    }
public class maximumpathsumfromanynodetoany {
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
   static   int res = Integer.MIN_VALUE;
    //Function to return maximum path sum from any node in a tree.
   static int findMaxSum(Node node){
        solve(node);
        return res;    
    }
    
    public static int solve(Node node){
        if(node==null){
            return 0;
        }
        
        int leftMax = Math.max(0, solve(node.left));
        int rightMax = Math.max(0, solve(node.right));
        
        res = Math.max(res, leftMax+rightMax+node.data);
        
        return Math.max(leftMax, rightMax)+node.data;
    }
    public static void main(String[] args) {
        int[] nodes ={10,20,2,-1,-1,1,-1,-1,-25,3,-1,-1,4,-1,-1};
        Node root = buildTree(nodes);
        System.out.println(findMaxSum(root));
    }
}
