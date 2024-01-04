// Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array.
// Find these two numbers.

// Example 1:

// Input:
// N = 2
// Arr[] = {2, 2}
// Output: 2 1
// Explanation: Repeating number is 2 and 
// smallest positive missing number is 1.
public class findmissingandrepeating {
    static int[] findTwoElement(int arr[], int n) {
        
        int ans[] = new int[n + 2];
        int miss = 0 , repeat = 0;
        
        for(int i = 0 ; i<n ; i++){
           ans[arr[i]]++;
        }
        for(int i = 1 ; i <=n ; i++){
            if(ans[i] == 2){
                repeat = i;
            }
            else if(ans[i] == 0){
                miss = i;
            }
        }
     
       return new int[]{repeat,miss};
    } 
    public static void main(String[] args) {
        int[] arr={2,3};
        int n = arr.length;
        int[] new_arr =findTwoElement(arr,n);
        System.out.println(new_arr[0]+" "+new_arr[1]);
    }
}
