public class primeNumbers {
    public static void main(String[] args) {
    
              int[] num = {255,266,351,144,351};
    
              int count;  
    
              for (int i = 0; i <= num.length-1; i++) {  
    
                 count = 0;  
    
                 for (int j = 2; j <= num[i] / 2; j++) {    
    
                    if (num[i] % j == 0) {    
    
                         count++;    
    
                         break;    }  
    
    
    
    
                        }   
                        if (count == 0) {  
    
                             System.out.println("The prime numbers are:"+" "+num[i]);
    
                            }
    
                            if (count != 0) {  
    
                             System.out.println("NOT PRIME NUMBERS:"+" "+num[i]);
    
                            }
    
                        }
    
                        }
    
                    }

