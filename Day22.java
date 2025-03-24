//Problem:minimum add to make parentheses valid
//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
class Solution {
    public int minAddToMakeValid(String s) {
        int open=0, close=0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++; 
            } else {
                if (open > 0) {
                    open--; 
                } else {
                    close++; 
                }
            }
        }        
        return open + close; 
    }
}
//TC:O(N)
//SC:O(1)

//Problem:Sum of beauty of all substrings
//https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/
class Solution {
    public int beautySum(String s) {
        int i,ans=0;
        for(i=0;i<s.length();i++){
             int[] freq=new int[26];           
             for(int j=i;j<s.length();j++){
                int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
            freq[s.charAt(j)-'a']++;
            for(int k:freq){
               if(k>0){
            max=Math.max(max,k);
            min=Math.min(min,k);
               }
            }
              ans=ans+(max-min);
        }
        }
        return ans;
    }
}
//TC:O(n^2)
//SC:O(1)
