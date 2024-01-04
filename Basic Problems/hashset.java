import java.util.Iterator;
import java.util.HashSet;
public class hashset {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,5};
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            set.add(arr[i]);

        }
        System.out.println(set);
       Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
    
}
