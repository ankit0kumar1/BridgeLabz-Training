/*28.
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
*/

import java.util.*;
class FirstOccurance {
    public int strStr(String haystack, String needle) {
        int length = needle.length();
        int start =0; int end = start+length;
        for(int i =0; i<haystack.length()-length; i++){
            if(start ==haystack.length()-length-1){
                if(haystack.substring(start).equals(needle)){
                    break;
                }else{
                    return -1;
                }

            }else{
                if(haystack.substring(start,end).equals(needle)){
                    break;
                }else{
                    return -1;
                }
            }

        }return start;
    }
}