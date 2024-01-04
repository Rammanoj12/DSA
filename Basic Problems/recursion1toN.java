public class recursion1toN {
    static void solve(int idx,int N){
        if(idx==N){
            System.out.println(idx);
            return;
        }
        System.out.println(idx);
        solve(idx+1,N);
    }
    public static void main(String[] args) {
        int idx =1;
        int N =10;
        solve(idx,N);
    }
}
