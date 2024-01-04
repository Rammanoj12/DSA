public class kadaneAlgorithm {
    public static void main(String[] args) {
        
         int[] arr ={1,2,3,-1,4,-2,6,-1,-1,10,9,9,8};
         int n= arr.length;
            long max_start = Integer.MIN_VALUE;
            long max_end = 0;
            for(int i=0;i<n;i++){
                max_end+=arr[i];
                if(max_start<max_end){
                    max_start = max_end;
                }
                if(max_end<0){
                    max_end = 0;
                }
            }
           System.out.println(max_start);
        
    }
}
