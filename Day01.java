Problem:Reverse bits(Gfg)
problem link:https://www.geeksforgeeks.org/problems/reverse-bits3556/1?page=1&category=Mathematical&difficulty=Easy&sortBy=submissions
class Solution {
    static Long reversedBits(Long x) {
           double i=31,a,ans=0;
        while(x>0){
            a=x%2;
            ans=ans+Math.pow(2,i)*a;
            i--;
            x=x/2;
        }        
        return (long)ans;
    }
};
