public class print1ton {
    static void solve(int n,int i){
       if(n == i){
        System.out.println(i);
        return;
       }
       System.out.println(i);
       solve(n, i+1);
  

    }
    public static void main(String[] args) {
        int n =10;
        int i =1;
         solve(n,i);
        
    }
}
