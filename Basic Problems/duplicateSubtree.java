///Return 1 or 0 , if duplicate root found
//This problem has string data so prefer using hashmap and count the frequency

public class duplicateSubtree {
    HashMap<String,Integer> map = new HashMap<>();
  int dupSub(Node root) {
      findDup(root);
      for(String answer: map.keySet()){
          if(map.get(answer)>1){
              return 1;
          }
          
      }
    return 0;
  }
  
  
    String findDup(Node root){
      
       Node currNode = root;
       if(currNode == null){
           return "";
       }
       
        
       String newString = "";
       String l = findDup(currNode.left);
       String r = findDup(currNode.right);
       newString = l + currNode.data + r;
       if(currNode.left != null || currNode.right != null){
           map.put(newString,map.getOrDefault(newString,0)+1);
       }
       
       return newString;
       
        }
  public static void main(String[] args) {
    
  }
  
}
