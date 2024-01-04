import java.util.Scanner;

public class Prime_Numbers {
	
	public void checkPrime(int n) {
		int c=0;int idx=0;
		for(int j=2;j<=n;j++) {
            
			if(isPrime(j)) {
				c++;
				idx=j;
				System.out.println(idx);
				
			}
		}
	}
	
	private boolean  isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i =2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
		int n = sc.nextInt();
		Prime_Numbers obj = new Prime_Numbers();
		obj.checkPrime(n);
		
		
	
		}
	}
	