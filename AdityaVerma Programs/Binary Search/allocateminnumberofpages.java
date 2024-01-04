// You have N books, each with A[i] number of pages. M students need to be allocated contiguous books, with each student getting at least one book.
// Out of all the permutations, the goal is to find the permutation where the student with the most books allocated to him gets the minimum number of pages, out of all possible permutations.

// Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).

 

// Example 1:

// Input:
// N = 4
// A[] = {12,34,67,90}
// M = 2
// Output:113
// Explanation:Allocation can be done in 
// following ways:
// {12} and {34, 67, 90} Maximum Pages = 191
// {12, 34} and {67, 90} Maximum Pages = 157
// {12, 34, 67} and {90} Maximum Pages =113.
// Therefore, the minimum of these cases is 113,
// which is selected as the output.
public class allocateminnumberofpages {
    static int max(int[] A){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        return max;
    }

    static int sum(int[] A){
        int sum=0;
        for(int i =0;i<A.length;i++){
            sum+=A[i];
        }
        return sum;
    }
    static int solve(int[] A,int k){
        if(A.length<k){
            return -1;
        }
        int low = max(A);
        int high = sum(A);
        int result = -1;
        int n = A.length;
       
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isvalid(A,n,k,mid)){
                result = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return result;
    }

    static boolean isvalid(int[] A,int n ,int k,int max){
        int sum = 0;
        int students = 1;
        for(int i =0;i<n;i++){

            sum+=A[i];
            if(sum>max){
                students++;
                sum=A[i];
            }
           if(students>k){
            return false;
        }
        }
        
       
        return true;
    }
    public static void main(String[] args) {
        int A[] = {12,34,67,90};
        int k =2;
        System.out.println(solve(A,k));
    }
}
