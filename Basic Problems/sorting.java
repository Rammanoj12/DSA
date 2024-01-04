///////////////////////////////////////////////////////////////
// quicksort---Worst case - O(N^2)--Average --O(nlogn)
// public class sorting{
// static int partition(int[] arr,int low,int high){
//     int pivot =  arr[high];
//     int i =low-1;
//     for(int j=low;j<high;j++){
//         if(arr[j]<pivot){
//             i++;
//             //swap
//             int temp = arr[i];
//             arr[i] =arr[j];
//             arr[j] =temp;
            
//      }
//     } 
//  swap with pivot
//     i++;
//     int temp = arr[i];
//     arr[i] = arr[high];
//     arr[high] = temp;
//     return i;
    
// }

// static void quicksort(int[] arr,int low,int high){
//     if(low<high){
//         int pi = partition(arr,low,high);
//         quicksort(arr, low, pi-1);
//         quicksort(arr, pi+1, high);
//     }
// }
//     public static void main(String[] args) {
//          int[] arr = {2,3,5,4,1};
//         int n  = arr.length;
//         quicksort(arr,0,n-1);
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
///////////////////////////////////////////////////////////////////



////////////////////////////////////////////////////////////////////
// Mergedsorting-Worst case - O(N^2)--Average --O(nlogn)
// public class sorting{

//     static void mergesortconquer(int[] arr,int si,int mid,int ei){
//                 int[] mergedarray = new int[ei-si+1];
//                 int x =0;
//                 int idx1 = si,idx2=mid+1;
//                 while(idx1<=mid && idx2<=ei){
//                     if(arr[idx1]<arr[idx2]){
//                         mergedarray[x] = arr[idx1];
//                         x++;
//                         idx1++;
//                     }else{
//                         mergedarray[x] = arr[idx2];
//                         x++;
//                         idx2++;

//                     }
//                 }
//                 while(idx1<=mid){
//                     mergedarray[x] = arr[idx1];
//                     x++;
//                     idx1++;
//                 }

//                  while(idx2<=ei){
//                     mergedarray[x] = arr[idx2];
//                     x++;
//                     idx2++;
//                 }


//                 for(int i =0,j =si;i<mergedarray.length;i++,j++){
//                             arr[j] = mergedarray[i];
//                 }
                
//     }

// static void mergesortdivide(int[] arr,int si,int ei){
//         if(si>=ei){
//             return;
//         }
//         int mid = si+(ei-si)/2;
//         mergesortdivide(arr, si, mid);
//         mergesortdivide(arr, mid+1, ei);
//         mergesortconquer(arr,si,mid,ei);

//     }
//     public static void main(String[] args) {
//          int[] arr = {2,3,5,4,1};
//          int  l = arr.length;
//          mergesortdivide(arr,0,l-1);
          
//         for(int i=0;i<l;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
///////////////////////////////////////////////////


///////////////////////////////////////////////////
//insertion sort-Worst case - O(N^2)--Average --O(n)
// public class sorting{
//     static int[] insertionsort(int[] arr){
//         int l =  arr.length;
//         for(int i =1;i<=l-1;i++){
//         int j = i-1;
//         int current = arr[i];
//          while(j>=0 && current<arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;
//          }
//          arr[j+1] = current;
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int[] arr = {2,3,5,4,1};
//         int[] result = insertionsort(arr);
//         for(int i=0;i<result.length;i++){
//             System.out.print(result[i]+" ");
//         }
//     }
// }
////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////
// Selection sorting-Worst case - O(N^2)
// public class sorting{
//     static int[] selectionsort(int[] arr){
//         int l =arr.length;
//         for(int i=0;i<l-1;i++){
//             int small = i;
//             for(int j=i+1;j<l;j++){
//                 if(arr[small]>arr[j]){
//                     small = j;
//                 }
//                 //swap
//                 int temp = arr[small]; 
//                 arr[small] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         return arr;

//     }
//     public static void main(String[] args) {
//         int[] arr = {2,3,5,4,1};
//         int[] result = selectionsort(arr);
//         for(int i=0;i<result.length;i++){
//             System.out.print(result[i]+" ");
//         }
        
//     }
// }
////////////////////////////////////////////////////////

// /////////////////////////////////////////////////////
// BUBBLE SORT--O(N^2)--Worst case
// public class sorting {
//     static int[] bubblesort(int[] arr){
//         int l = arr.length;
//         for(int i =0;i<l-1;i++){
//             for(int j=0;j<l-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int[] arr = {2,3,5,4,1};
//         int[] result = bubblesort(arr);
//         for(int i=0;i<result.length;i++){
//             System.out.print(result[i]);
//         }

//     }
    
// }
//////////////////////////////////////////////////////