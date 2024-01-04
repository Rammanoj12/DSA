// Given a list of points on the 2-D plane and an integer K. The task is to find K closest points to the origin and print them.
// Note: The distance between two points on a plane is the Euclidean distance.

// Examples: 

// Input : point = [[3, 3], [5, -1], [-2, 4]], K = 2
// Output : [[3, 3], [-2, 4]]
// Square of Distance of origin from this point is 
// (3, 3) = 18
// (5, -1) = 26
// (-2, 4) = 20
// So the closest two points are [3, 3], [-2, 4].
import java.util.Comparator;
import java.util.PriorityQueue;

public class kthclosestpathToOrigin {
    // static double compare(int[] a, int[] b) {
    //     double distance1 = (a[0] * a[0]) + (a[1] * a[1]);
    //     double distance2 = (b[0] * b[0]) + (b[1] * b[1]);
    //     return distance1 < distance2 ? 1 : -1;
    // }

    static void solve(int[][] arr, int k) {
        // PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Double.compare(compare(a, b), 0.0));
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0] *a[0] + a[1] *a[1]));

        for (int[] key : arr) {
            pq.add(key);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        for (int j = 0; j < result.length; j++) {
            System.out.print("(" + result[j][0] + ", " + result[j][1] + ") ");
        }
    }
 
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int k = 2;
        solve(arr, k);
    }
}
