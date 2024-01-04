
public class stringfetchinginteger {

	// Function to return the modified string
	static String extractInt(String str)
	{
        if (str.equals(""))
			return "-1";
		// Replacing every non-digit number
		// with a space(" ")
		str = str.replaceAll("[^0-9]", " "); // regular expression

		// Replace all the consecutive white
		// spaces with a single space
		str = str.replaceAll("\\s+", " ");

		

		return str;
	}

	// Driver code
	public static void main(String[] args)
	{
		String str = "122am";
		System.out.print(extractInt(str));
	}
}











// public class stringfetchinginteger {
    
//         public static void main(String[] args) {
//             String a = "123abc";
            
//             // Initialize a StringBuilder to store the digits
//             StringBuilder integerStr = new StringBuilder();
    
//             // Iterate through each character in the string
//             for (char c : a.toCharArray()) {
//                 // Check if the character is a digit
//                 if (Character.isDigit(c)) {
//                     integerStr.append(c); // Append the digit to the StringBuilder
//                 } else {
//                     // If a non-digit character is encountered, break the loop
//                     break;
//                 }
//             }
    
//             // Convert the StringBuilder to an integer
//             int result = Integer.parseInt(integerStr.toString());
    
//             System.out.println("Extracted integer: " + result);
//         }
//     }
    

