// Given an unsorted array Arr[] of N integers and an integer X, find floor and ceiling of X in Arr[0..N-1].

// Floor of X is the largest element which is smaller than or equal to X. Floor of X doesn’t exist if X is smaller than smallest element of Arr[].

// Ceil of X is the smallest element which is greater than or equal to X. Ceil of X doesn’t exist if X is greater than greatest element of Arr[].

// Example 1:

// Input:
// N = 8, X = 7
// Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
// Output: 6 8
// Explanation:
// Floor of 7 is 6 and ceil of 7 
// is 8.
   class Pair{
    int floor;
    int ceil;
    Pair(){
        this.floor=0;
        this.ceil =0;
    }
    Pair(int floor,int ceil){
        this.floor =floor;
        this.ceil = ceil;
    }
}
public class floorandceil {
 
   static  Pair getFloorAndCeil(int[] arr, int n, int x) 
    {
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
        for(int i : arr)
        {
            if(i<=x){
             floor=Math.max(floor,i);
            } 
            if(i>=x){
             ceil=Math.min(ceil,i);
            } 
        }
        if(floor==Integer.MIN_VALUE){
        return new Pair(-1,ceil);
        } 
        if(ceil==Integer.MAX_VALUE) {
            return new Pair(floor,-1);
        }
        return new Pair(floor,ceil);
    }
    public static void main(String[] args) {
       int  arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
       int x =7;
       int n = arr.length;
       Pair ans = getFloorAndCeil(arr,n,x);
       System.out.println(ans.floor+" "+ans.ceil);
    }
}
