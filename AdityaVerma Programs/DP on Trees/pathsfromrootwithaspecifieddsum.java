//Paths from root with a specified sum
// Given a Binary tree and a sum S, print all the paths, starting from root, that sums upto the given sum. Path maynot end on a leaf node.

// Example 1:

// Input : 
// sum = 8,
// Root of tree
//          1
//        /   \
//      20      3
//            /    \
//          4       15   
//         /  \     /  \
//        6    7   8    9      

// Output :
// 1 3 4
// Explanation : 
// Sum of path 1, 3, 4 = 8.

// Input : 
// sum = 38,
// Root of tree
//           10
//        /     \
//      28       13
//            /     \
//          14       15
//         /   \     /  \
//        21   22   23   24
// Output :
// 10 28
// 10 13 15  
// Explanation :
// Sum of path 10, 28 = 38 , and, 
// Sum of path 10, 13, 15 = 38

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
public class pathsfromrootwithaspecifieddsum {
    static int index = -1;
    static Node buildTree(int[] nodes){
            index++;
            if(index < nodes.length && nodes[index] != -1){
               
            
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
           return newNode;
            }
             return null;
        }


       public static void solve(Node root,int s,int sum,ArrayList<Integer>al,ArrayList<ArrayList<Integer>>ans)
    {
        if(root==null)
        {
            return;
        }
        s+=root.data;
        al.add(root.data);
        if(sum==s)
        {
            ans.add(new ArrayList<>(al));
        }
        solve(root.left,s,sum,al,ans);
        solve(root.right,s,sum,al,ans);
        al.remove(al.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        //code here
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        solve(root,0,sum,new ArrayList<>(),ans);
        return ans;
    }
    public static void main(String[] args) {
        //int[] nodes ={1,20,-1,-1,3,4,6,-1,-1,7,-1,-1,15,8,-1,-1,9,-1,-1};
        int[] nodes ={10,28,-1,-1,13,14,21,-1,-1,22,-1,-1,15,23,-1,-1,24,-1,-1};
        Node root = buildTree(nodes);
        ArrayList<ArrayList<Integer>> result = printPaths(root, 38);
        for(int i=0;i<result.size();i++){
            for(int j =0;j<result.get(i).size();j++){
                 System.out.print(result.get(i).get(j)+" ");
            }
           System.out.println(); 
        }
        
    }
}
