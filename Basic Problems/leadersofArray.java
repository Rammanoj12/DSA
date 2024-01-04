import java.util.Collections;
import java.util.ArrayList;
// Returning to main method gives--- output-- 4, 0
// public class leadersofArray {
//     static ArrayList<Integer> leaders(int arr[], ArrayList<Integer> list){
//        int l = arr.length;
        
//         //Checking if length is 0, then return list
//         if(l ==0){
//             return list;
//         }
//         //Adding the last element in list
//         int max = arr[l-1];
//         list.add(max);//output --2
        
//         //Iteratimg from second last to first element
//         for(int i = l-2;i>=0;i--){
//             if(arr[i]>=max){
//                 max= arr[i];
//                 list.add(max);
//             }
//         }
//         Collections.reverse(list);
//         return list;
//     }


//     public static void main(String[] args) {
//         int[] arr ={1,2,3,4,0};
//         ArrayList <Integer> list = new ArrayList<>();
//         list = leaders(arr,list);
//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+" ");
//         }
//         System.out.println();

//     }
    
// }

///////////////////////////////////////////////////////////////

// Printing in method gives--- output-- [4, 0]
// public class leadersofArray{
//     static void leaders(int[] arr){
//         int l = arr.length;
//         ArrayList <Integer> list = new ArrayList<>();
//         int max =0;
//         for(int i=l-1;i>=0;i--){
//             if(arr[i]>=max){
//                 max= arr[i];
//                 list.add(max);
//             }
//         }
//         Collections.reverse(list);
//         System.out.println(list);
//     }
//     public static void main(String[] args) {
//         int arr[] ={1,2,3,4,0};
//         leaders(arr);
//     }
// }
