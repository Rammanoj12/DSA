import java.util.Scanner;

public class Palindrone {
        public static boolean isPalindrone(String string){
                string = string.replaceAll("\\s+", "").toLowerCase();/// "\\s+": The \\s represents any whitespace character (e.g., space, tab, newline), 
                // + indicates one or more occurrences of the preceding pattern.
                int left = 0;
                int right = string.length()-1;

                while(left<right){
                    if(string.charAt(left)!=string.charAt(right)){
                      
                            return false;
                    }
                    
                    left++;
                    right--;
                    
                }
                
                return true;

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the word");
            String string = sc.nextLine();
            if(isPalindrone(string)){
                System.out.println("The given word is Palindrone");
            }else{
                System.out.println("The given word is not palindrone");
            }
                

        }
    }

