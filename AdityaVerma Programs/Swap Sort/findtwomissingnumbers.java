// Given an array of n unique integers where each element in the array is in the range [1, n]. The array has all distinct elements and the size of the array is (n-2). Hence Two numbers from the range are missing from this array. Find the two missing numbers.

// Examples : 

// Input  : arr[] = {1, 3, 5, 6}
// Output : 2 4

// Input : arr[] = {1, 2, 4}
// Output : 3 5

// Input : arr[] = {1, 2}
// Output : 3 4

public class findtwomissingnumbers {
static void solve(int[] arr,int size){
          boolean[] isMark = new boolean[size+1];
        for(int i =0;i<size-2;i++){
            isMark[arr[i]] = true;
        }

        for(int i =1;i<=size;i++){
            if(isMark[i] == false){
                System.out.print(i+" ");
            }
            
        }
}
    public static void main(String[] args) {
        int[] arr ={1,3,5,6};
        int size = arr.length+2;
        solve(arr,size);
    }
}
