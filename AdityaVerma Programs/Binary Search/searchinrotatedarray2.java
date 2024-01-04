public class searchinrotatedarray2 {
    static int solve(int[] arr,int k){
        int low =0;
        int high =arr.length-1;
        int result = -1;
        while(low<=high){
            int mid = low +high-low/2;
            if(arr[mid] == k){
                result = mid;
              
                high = mid-1;
               
               
            }else if(k<arr[mid]){
               high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
       int k =0;
        int first = solve(arr,k);
        System.out.println(first);
    }
}
//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
//GFG All Test cases pass

// class Solution {
//     public static boolean Search(int N, int[] nums, int target) {
//   int low =0;
//         int high =nums.length-1;
        
//         while(low<=high){
//             int mid = low +high-low/2;
//             if(nums[mid] == target){
                
//                return true;
               
               
//             } 
//             if(nums[low]<nums[mid]){
//                 if(target>=nums[low]&&target<nums[mid]){
//                     high=mid-1;
//                 }
//                 else{
//                     low=mid+1;
//                 }
//             }
//             else{
//                 if(target>nums[mid]&&target<=nums[high]){
//                     low=mid+1;
//                 }
//                 else{
//                     high=mid-1;
//                 }
//             }
//         }
//         return false;
//     }
// }