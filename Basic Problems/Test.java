class Test{
  public static void main(String[] args) {
    int n=5;
    //int number =1;
    int  A=65;
    for(int i=0;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
        
      }
      for(int k=0;k<=i;k++){
        
        System.out.print((char)(A)+" ");
        A++;

        
        
      }
      System.out.println();
    }
  }
}