public class minNumberOfjumps {

    static int jumps(int[] arr){
        int n = arr.length;
        int ans = 0;
        int end =-1;
        int max=0;
        for(int i =0;i<n;i++){
            if(i>end){
                ans++;
                end =max;
            }
            max = Math.max(max,arr[i]+i);
            if(max>=n-1){
                return ans;
            }
            if(max<=i){
                return -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 7};
        System.out.println(jumps(arr));
    }
}
