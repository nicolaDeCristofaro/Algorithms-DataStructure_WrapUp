

/*Implement strStr().

Return the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack.

Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. 
This is consistent to C's strstr() and Java's indexOf().
*/

public class StrStr {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0; //needle empty string

        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0) && haystack.charAt(i + needle.length() - 1) == needle.charAt(needle.length() - 1)) { //extra validation
                
                for(int j = 0; j < needle.length() && haystack.charAt(i +j) == needle.charAt(j); j++) {
                    
                    if(j == needle.length() -1) return i;

                }
            }
        }

        return -1; //needle not present in haystack
    }

}
