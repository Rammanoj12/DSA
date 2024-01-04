// Given a bitonic sequence of n distinct elements, and an integer x, the task is to write a program to find given element x in the bitonic sequence in O(log n) time. 

// A Bitonic Sequence is a sequence of numbers that is first strictly increasing then after a point decreasing.

// Examples: 

// Input :  arr[] = {-3, 9, 18, 20, 17, 5, 1}, key = 20
// Output : Found at index 3
public class searchelementinbitonicarray {
    public static int findPeak(int arr[]) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
                    return mid;
                if (arr[mid] < arr[mid + 1])
                    lo = mid + 1;
                if (arr[mid] < arr[mid - 1])
                    hi = mid - 1;
            }
            if (mid == 0) {
                if (arr[mid] > arr[mid + 1])
                    return mid;
                else
                    return mid + 1;
            }
            if (mid == arr.length - 1) {
                if (arr[mid] > arr[mid - 1])
                    return mid;
                else
                    return mid - 1;
            }
        }
        return -1;
    }

    public static int ascendingbs(int arr[], int lo, int hi, int target) {
        while (lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                lo = mid + 1;
            if (arr[mid] > target)
                hi = mid - 1;
        }
        return -1;
    }

    public static int descendingbs(int arr[], int lo, int hi, int target) {
        while (lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                hi = mid - 1;
            if (arr[mid] > target)
                lo = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 8, 12, 4, 2 };
        int target = 2;
        int peak = findPeak(arr);
        int index1 = ascendingbs(arr, 0, peak - 1, target);
        int index2 = descendingbs(arr, peak, arr.length - 1, target);
        int k = Math.max(index1, index2);
        System.out.println(k);
    }
}
