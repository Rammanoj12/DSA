//X close numbers and op is 6 7 8
import java.util.Collections;
import java.util.PriorityQueue;
class Pair implements Comparable<Pair> {
	int key;
	int data;

	Pair(int key, int data) {
		this.key = key;
		this.data = data;
	}

	@Override
	public int compareTo(Pair o) {
		return this.key - o.key;
	}

}
public class kthclosestNumber2 {
    static void kClose(int arr[], int k, int x) {
		PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : arr) {
			maxHeap.add(new Pair(Math.abs(i - x), i));
			if (maxHeap.size() > k) {
				maxHeap.poll();
			}
		}
		while (maxHeap.size() > 0) {
			System.out.print(maxHeap.poll().data + " ");
		}
	}
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10 };
		kClose(arr, 3, 7);
    }
}




