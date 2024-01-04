public class reverse {
    public static void main(String[] args) {
        int n =123;
        int sum =0;
        while(n>0){
            int reverse =  n %10;
            sum = sum *10+reverse;
            n = n /10;
        }
        System.out.println(sum);
    }
    
}
