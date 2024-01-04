public class Prime {
    public static void main(String[] args) {
          int num = 100;
          int count;  
          for (int i = 1; i <= num; i++) {  
             count = 0;   
             for (int j = 2; j <= i / 2; j++) {    
                if (i % j == 0) {    
                     count++;     
                     break;    }  

                    }   if (count == 0) {   
                         System.out.println("The prime numbers are:"+" "+i);
                        }
                        // if (count != 0) {   
                        //  System.out.print("NOT PRIME NUMBERS:"+" "+i);
                        // }
                    }
                    }
                }
            

