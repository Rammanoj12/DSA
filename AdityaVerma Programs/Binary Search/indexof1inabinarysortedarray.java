// Given a sorted array consisting 0s and 1s. The task is to find the index of first 1 in the given array.

// Example 1:

// Input : 
// arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
// Output : 
// 6
// Explanation:
// The index of first 1 in the array is 6.
public class indexof1inabinarysortedarray {
    
    public  static  int FirstOccurence(int[] arr  , int low , int high ,  int target ){
        
        int res = -1;
        
        while(low<=high){
            int mid = low  + (high - low) / 2;
            if(arr[mid] == target){
                res = mid;
                high = mid - 1;
            }
            if(target > arr[mid]){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        
        return res;
        
    }
    
    public static int infiniteOne(int arr[] ){
        int low = 0 ; int high = 1;
        int target =1 ;
        while(target > arr[high]){
            low = high;
            high = high *2;
            
        }
        int get = FirstOccurence(arr , low , high , 1);
        return get;
    }
    public static void main(String[] args) {
        int[] arr ={0,0,0,0,0,1,1,1,1};
        int res = infiniteOne(arr);
        System.out.println("Position"+" "+res);
    }
}
