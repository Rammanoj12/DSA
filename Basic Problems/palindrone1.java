public class palindrone {
    static int sum=0;
    static int  isPalindrone(int n){
        while(n>0){
        int mod= n%10;
        int divide = (sum*10)+mod;
        int result = n/10;
        return result;
        }
        
    }
    public static void main(String[] args) {
        int n = 123;
        if(isPalindrone(n)){
            System.out.println("The number is palindrone");
        }else{
            System.out.println("The number is not palindrone")
        }
    }
    
}
