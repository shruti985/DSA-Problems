//LeetCode POTD:https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/
//04/03/2025
class Solution {
    public boolean checkPowersOfThree(int n) {
        int num=n,i=-1,sum=0;
        while(num>0){
            num=num/3;
            i++;           
        } 
        while(i>=0){
            if(sum+(int)Math.pow(3,i)<=n){
                sum=sum+(int)Math.pow(3,i);
                i--;
            }
            else{
                i--;
            }
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}
// SC:O(1)
// TC:O(logn)
