public class fibonaacitillnthterm {
    static void solve(int n1,int n2,int n){
        
        if(n==0){
            return ;
        }
        
        int c = n1+n2;
        
        System.out.print(c+" ");
       solve(n2,c,n-1);
        
    }
    public static void main(String[] args) {
        int n1 = 0;
        int n2 =1;
        int n =5;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        solve(n1,n2,n-2);
    }
}
