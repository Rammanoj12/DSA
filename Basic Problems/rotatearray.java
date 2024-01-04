import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class rotatearray {
    //
    public static void main(String[] args) {
             int[] arr = {1, 2, 3, 4, 5, 6, 7};
	          int d = 2;
              
                

    //     int[] arr = {1, 2, 3, 4, 5, 6, 7};
	//  int d = 2;
    //  int n = arr.length;
    //     d=d%n;
    //     int k=0;
    //     int []temp=new int[n];
    //     for(int i=d;i<n;i++)
    //     {
    //         temp[k++]=arr[i];
    //     }
    //     for(int i=0;i<d;i++)
    //     {
    //         temp[k++]=arr[i];
    //     }
    //     for(int i=0;i<n;i++)
    //     {
    //         arr[i]=temp[i];
    //     }

    //     for(int i =0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();

////////////////////////////////////////////////////////////////
    //       //QUEUE
    //  int[] inp = {1, 2, 3, 4, 5, 6, 7};
	// 	int d = 4;

	// 	Queue<Integer> q = new ArrayDeque<>();
	// 	for (int i : inp) {
	// 		q.add(i);
	// 	}

	// 	for (int i = 0; i < d; i++) {
	// 		int temp = q.remove();
	// 		q.add(temp);
	// 	}

	// 	System.out.println(q);

        //DEQUE--O(d*n)
//         Where d is the number of rotations and n is the size of the deque. 
// The auxiliary space is O(n), where n is the size of the deque
    //  int[] inp = {1, 2, 3, 4, 5, 6, 7};
	// 	int d = 2;

	// 	Deque<Integer> deq = new ArrayDeque<>();
	// 	for (int i : inp) {
	// 		deq.add(i);
	// 	}

	// 	for (int i = 0; i < d; i++) {
	// 		int temp = deq.remove();
	// 		deq.addLast(temp);
	// 	}

	// 	System.out.println(deq);
	}
}

// this code is contributed by devendrasalunke



    //     //O(n) --- naive approach
    //     int[] arr ={1,2,3,4,5};
    //     int rotate_arr = 3;
    //     int j=0;
    //     int[] new_arr = new int[arr.length];
    //    for(int i = rotate_arr;i<arr.length;i++){
    //         new_arr[j++] = arr[i];
    //     }
    //     for(int i=0;i<rotate_arr;i++){
    //         new_arr[j++] = arr[i];
    //     }

    //     for(int i =0;i<new_arr.length;i++){
    //         System.out.print(new_arr[i]);
    //     }
    //     System.out.println();
    

