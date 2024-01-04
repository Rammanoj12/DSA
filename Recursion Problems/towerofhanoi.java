public class towerofhanoi {
    static void solve(int n,String src,String helper,String destination){
        if(n == 1){
            System.out.println("Transfer disk "+n+" "+"from "+src +"to "+destination);
            return;
        }
        solve(n-1, src, destination, helper);
        System.out.println("Transfer disk "+n+" "+"from "+src +"to "+destination);
        solve(n-1, helper, src, destination);
        
    }
    public static void main(String[] args) {
        String src ="S";
        String helper = "H";
        String destination = "D";
        int n =4;
        solve(n,src,helper,destination);
    }
}
