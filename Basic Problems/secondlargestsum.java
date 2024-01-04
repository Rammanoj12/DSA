public class secondlargestsum {
    public static int secondlargest(int[] arr){

    int n =arr.length;
    int max = Integer.MIN_VALUE;
    int min=Integer.MIN_VALUE;
    for(int i = 0;i<n;i++){
        if(arr[i]>max){
            max= arr[i];
        }
        
    }
    
    for(int i = 0;i<n;i++){
        if(arr[i]!=max && arr[i]>min){
            min  = arr[i];
        }
        }
        if(min == Integer.MIN_VALUE){
            return -1;
        }
    
    
  return min;
    }
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5,10};
        int result = secondlargest(num);
        System.out.println(result);
    }
}
