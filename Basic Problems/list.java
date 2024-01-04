import java.util.ArrayList;
import java.util.HashSet;

public class list {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(3);
        ArrayList<Integer> list = new ArrayList<>(set);
        list.add(1);
        list.add(2);
        System.out.println(list);
        
    }
    
}
