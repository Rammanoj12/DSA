import java.util.ArrayList;
import java.util.HashSet;

public class duplicatearrayusingHashset {
      ArrayList<Integer> duplicate(int[] arr){
        HashSet <Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            set.add(arr[i]);
        }
        ArrayList<Integer> list =  new ArrayList<>(set);
        return list;

      }
    public static void main(String[] args) {
        duplicatearrayusingHashset obj = new duplicatearrayusingHashset();
       int[] arr ={2,3,4,5,3,6,6};
       ArrayList <Integer> res = obj.duplicate(arr);
       for(int i =0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
       }
       System.out.println();
    }
}


////////////////////////////////////////////////////////

// output will give only duplicate values and if not -1
// ArrayList <Integer> list = new ArrayList<>();
//       HashSet <Integer> set = new HashSet<>();
//       HashSet <Integer> duplicate =  new HashSet<>();
          
//           for(int i =0;i<n;i++){
//               if(!set.contains(arr[i])){
//                   set.add(arr[i]);
//               }else if(!duplicate.contains(arr[i])){
//                   duplicate.add(arr[i]);
//                   list.add(arr[i]);
                  
//               }
//           }
          
          
//           if(list.size() ==0){
//               list.add(-1);
//               return list;
//           }
          
//       Collections.sort(list);
//       return list;
//         }