import java.util.HashMap;

public class characterOccurence {
    public static void characterCount(String s){

        //Creating a HashMap with Character and Integer datatypes
        HashMap <Character,Integer> map  = new HashMap<>();
        char[] charArray = s.toCharArray();
        
        //Converting all the elements in array to key variable 
         for(char key: charArray){
             //Checking if the key is present, if yes then add frequency
              if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
                //Add key and frequency
              }else{
                map.put(key,1);
              }
         
        }
          ///Converting to keyset and printing
           for(char keys : map.keySet()){
            System.out.println("Character"+"  "+keys+" ---> "+"Count"+" "+map.get(keys));
           }
            ///Print direct map    
         System.out.println(map);
            

        }
        
    
    public static void main(String[] args) {
        String s = "MANOJ";
        characterCount(s);
     }
}
