// Given an array arr[] of N non-negative integers representing the height of blocks. 
// If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
// Input:
// N = 6
// arr[] = {3,0,0,2,0,4}
// Output:
// 10
//using precalculation--O(N)
public class rainwatertrapping {
    static void solve(int[] arr,int n){
        int[] maxL = new int[n];
        int[] maxR = new int[n];
        int[] width = new int[n];
        maxL[0] = arr[0];
        maxR[n-1]= arr[n-1];
        for(int i = 1;i<n;i++){
            maxL[i] = Math.max(arr[i],maxL[i-1]);
           
        }

        
         for(int i = n-2;i>=0;i--){
            maxR[i] = Math.max(arr[i],maxR[i+1]);
           
        }
       int sum =0;
        for(int i =0;i<n;i++){
            width[i] = Math.min(maxL[i],maxR[i]) -arr[i];
            sum +=width[i];
        }
    

System.out.println(sum);
        

    }
    public static void main(String[] args) {
        int[] arr ={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;
        solve(arr,n);
    
    }
}

//Using stack --O(N)
// import java.util.Stack;

// public class rainwatertrapping {
//     static int trap(int[] height) {
//         int n = height.length;
//         if (n <= 2) return 0;

//         Stack<Integer> stack = new Stack<>();
//         int trappedWater = 0;

//         for (int i = 0; i < n; i++) {
//             while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
//                 int top = stack.pop();

//                 if (stack.isEmpty()) {
//                     break;
//                 }

//                 int distance = i - stack.peek() - 1;
//                 int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
//                 trappedWater += distance * boundedHeight;
//             }

//             stack.push(i);
//         }

//         return trappedWater;
//     }

//     public static void main(String[] args) {
//         int[] height = {3,0,2,0,4};
//         System.out.println(trap(height)); // Output: 6
//     }
// }
