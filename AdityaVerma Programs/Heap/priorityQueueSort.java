import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityQueueSort {
    public static void main(String[] args) {
        int[] arr ={1,3,5,2,6,15,-1};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
        }
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
