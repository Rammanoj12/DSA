import java.util.HashMap;
import java.util.Map;

public class DuplicateArrayUsingHashMap {
  
    static Map<Integer, Integer> duplicate(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            map.put(current, map.getOrDefault(current, 0) + 1);
        }
        
        return map;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 3, 6,2};
        Map<Integer, Integer> result = duplicate(arr);
        
        for (int key : result.keySet()) {
            System.out.println("Element: " + key + " Count: " + result.get(key));
        }
    }
}
