class newPrime{
    static boolean isPrime(int num,int i){
        if(num<=1){
            return false;
        }
        if(i*i>num){
            return true;
        }
        if(num%i==0){
            return false;
        }

        return isPrime(num, i+1);
    }




    static void printPrimes(int n,int current,int count){
        if(count==n){
            return ;
        }
        if(n==0){
            return; /// BASE CLASS
        }
        if(isPrime(current,2)){
            System.out.print(current+" ");
            count++;
        }
        printPrimes(n-1, current+1, count);
    }
    public static void main(String[] args) {
        int n=10,count =0;
        System.out.println("The Prime numbers are"+" "+n);
        printPrimes(n,2,count);
       
    }
}