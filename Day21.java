// Problem:Substrings with K distinct
// https://bit.ly/3CfQfYi
class Solution {
    int countSubstr(String s, int k) {
               return count(s, k) - count(s, k - 1);
    }

    private int count(String s, int k) {
        int left = 0, right = 0, count = 0, distinctCount = 0;
        int[] freq = new int[256]; 

        while (right < s.length()) {
            if (freq[s.charAt(right)] == 0) {
                distinctCount++;
            }
            freq[s.charAt(right)]++;

            while (distinctCount > k) {
                freq[s.charAt(left)]--;
                if (freq[s.charAt(left)] == 0) {
                    distinctCount--; 
                }
                left++;
            }

            count += right - left + 1;
            right++;
        }
        return count;
    }
}
//TC:O(N)
//SC:O(1)

//Problem:Longest Palindromic Substring
//https://leetcode.com/problems/longest-palindromic-substring/description/
class Solution {
    public String longestPalindrome(String str) {
         if (str.length() <= 1)
      return str;

    String LPS = "";

    for (int i = 1; i < str.length(); i++) {  
      int low = i;
      int high = i;
      while(str.charAt(low) == str.charAt(high)) {  //odd len
        low--;
        high++;

        if (low == -1 || high == str.length())
          break;
      }

      String palindrome = str.substring(low+1, high);
      if (palindrome.length() > LPS.length()) {
        LPS = palindrome;
      }
      low = i-1;  //even len
      high = i;
      while(str.charAt(low) == str.charAt(high)) {
        low--;
        high++;

        if (low == -1 || high == str.length())
          break;
      }

      palindrome = str.substring(low+1, high);
      if (palindrome.length() > LPS.length()) {
        LPS = palindrome;
      }
    }

    return LPS;
    }
}
