// Given a string S consisting of the characters 0, 1 and 2. Your task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2. If no such substring exists, then return -1.

// Example 1:

// Input:
// S = 01212
// Output:
// 3
// Explanation:
// The substring 012 is the smallest substring
// that contains the characters 0, 1 and 2.
public class smallestwindowcontaining012 {
    public static int smallestSubstring(String str) {
        // Code here
        int i = 0;
        int j = 0;
        int[] count = new int[3];
        int result = Integer.MAX_VALUE;
        
        while (j < str.length()) {
            count[str.charAt(j) - '0']++;
            while (count[0] >= 1 && count[1] >= 1 && count[2] >= 1) {
                int len = j - i + 1;
                result = Math.min(result, len);
                count[str.charAt(i) - '0']--;
                i++;
            }
            j++;
        }
        return (result == Integer.MAX_VALUE) ? -1 : result;
    }
    public static void main(String[] args) {
       String S= "01212";
        //String S ="12121";
        System.out.println(smallestSubstring(S));
    }
}
