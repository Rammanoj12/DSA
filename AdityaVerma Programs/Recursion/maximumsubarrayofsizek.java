// Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.

// NOTE*: A subarray is a contiguous part of any given array.

// Example 1:

// Input:
// N = 4, K = 2
// Arr = [100, 200, 300, 400]
// Output:
// 700
// Explanation:
// Arr3  + Arr4 =700,
// which is maximum.

public class maximumsubarrayofsizek {
    static void solve(int[] arr,int n , int k){
        int sum =0;
        //max subarray
        int max= Integer.MIN_VALUE;
        //min subarray
        //int max= Integer.MAX_VALUE;
        int i =0,j=0;
        while(j<n){
            sum+=arr[j];
            if(j-i+1 == k){
                //max subarray
               max = Math.max(max,sum);
               //min subarray
               max = Math.min(max,sum);
                sum-=arr[i];
                
                i++;
                j++;
            }else if(j-i+1<k){
                j++;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr ={2,5,1,8,2,9};
        int n = arr.length;
        int k =3;
        solve(arr,n,k);
    }
    
}
