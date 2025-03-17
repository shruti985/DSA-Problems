//Problem:https://www.geeksforgeeks.org/problems/square-root/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=square-root
class Solution {
    int floorSqrt(int n) {
         if (n == 0 || n == 1)
    return n;

    int s=1,e=n,sqrt=1;
    while (s <= e) {
        int mid = (s+ e) / 2;

        if (mid * mid == n)
            return mid;

        if (mid * mid < n) {
            s = mid + 1;
            sqrt = mid;
        }
        else
            e = mid - 1;
    }
    return sqrt;
    }
}
//TC:O(LOGN)
// SC:O(1)


//Problem:https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
         int start = 1;
        int end = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>end){
                end = nums[i];
            }
        }
        int res = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(isDivisionPossible(nums, mid, threshold)){
                res = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return res;
    }
    boolean isDivisionPossible(int nums[], int divisor, int threshold){
        int sumOfDivision = 0;

        for(int i=0; i<nums.length;i++){
            sumOfDivision += nums[i] / divisor;
            if(nums[i]%divisor!=0){
                sumOfDivision+=1;
            }
            if(sumOfDivision > threshold){
                return false;
            }
        }
        return true;
    }
}
//TC:O(N)
//SC:O(1)
