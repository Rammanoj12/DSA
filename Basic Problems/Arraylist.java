class Arraylist {
    static int[] sumIndex(int[] a){
     int L= a.length;
      int[] new_arr = new int[L];
      int start = 0;
      // int end =L-1;
      for(int i=0;i<=L-1;i++){
            if(a[i]>0){
               new_arr[start] = a[i];
               start++;
            }
            
      }
      for(int i=0;i<=L-1;i++){
            if(a[i]<0){
               new_arr[start] = a[i];
               start++;
            }
            
      }
      return new_arr;
     
   
}
    
    
    
    public static void main(String[] args) {
        int[] a={1,-2,-3,4,-5};
        int[] result =sumIndex(a);
       for(int i=0;i<result.length;i++){
         System.out.print(result[i]+" ");
      }
      
        
        
    }
}
    

