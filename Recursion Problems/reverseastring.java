public class reverseastring {
    static void solve(String s,int index){
        if(index == 0){
            System.out.print(s.charAt(index)+" ");
            return;
        }
        System.out.print(s.charAt(index)+" ");
        solve(s, index-1);
    }
    public static void main(String[] args) {
        String s ="abcd";
        int index = s.length()-1;
        solve(s,index);
    }
}
