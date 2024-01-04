// Given a string S, sort it in the following manner. 
//Sorted string must contain a vowel as first letter and a consonant as next letter 
//and so on OR a consonant as first letter and a vowel as next letter and so on, depending on the string. If there is no vowel left then print the remaining consonant in ascending order and vice versa. 

// Note: Order of vowel must be a->e->i->o->u and order of consonant must be b->c->d... and so on.


// Example 1:

// Input: abcdei 

// Output: abecid 

// Explanation: 'a' (Vowel) came first so the
// pattern of sorted string is vcvcvcvc...

import java.util.ArrayList;
import java.util.Collections;

public class sortstring {
    public static String SortedString(String str)
    {
        // Code here
        
        ArrayList<Character> vow = new ArrayList<>();
        ArrayList<Character> cons = new ArrayList<>();
    
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vow.add(ch);
            }
            else
            {
                cons.add(ch);
            }
        }
        
        Collections.sort(vow);
        Collections.sort(cons);
        
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        char ch = str.charAt(0);
        
        while(i < vow.size() && j < cons.size())
        {
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           {
                ans.append(vow.get(i++));
                ans.append(cons.get(j++));
           }
           else
           {
               ans.append(cons.get(j++));
               ans.append(vow.get(i++));
           }
        }
        
        while(i < vow.size())
        {
            ans.append(vow.get(i++));
        }
        
        while(j < cons.size())
        {
            ans.append(cons.get(j++));
        }
        
        return ans.toString();
    }
    public static void main(String[] args) {
        String str= "abcdei";
        String result =SortedString(str);
        System.out.println(result);
    }
}
