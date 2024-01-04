// Find position of an element in a sorted array of infinite numbers
// Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
// Source: Amazon Interview Experience. 
// Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of array. 
// If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.
// Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element, 
// ->if it is greater than high index element then copy high index in low index and double the high index. 
// ->if it is smaller, then apply binary search on high and low indices found.

public class positionofanelementininfinitesortedarray {
    public static int binarySearch(int a[], int start, int end, int ele) {
        int n = a.length;
        start = 0;
        end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ele == a[mid]) {
                return mid;
            } else if (ele > a[mid]) {
                start = mid + 1;
            } else if (ele < a[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int findPos(int a[], int key) {
        int start = 0;
        int end = 1;
        while (key > a[end]) {
            start = end;
            end *= 2;
        }
        return binarySearch(a, start, end, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int res = findPos(arr, 7);
        System.out.println("Position"+" "+res);
    }
}
