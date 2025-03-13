//Problem 1:Move zeroes
//https://leetcode.com/problems/move-zeroes/
//Approach:Traversed the nums array and stored the index of zero in k and whenever a non-zero no. was found swapped it with zero at index k and incremented k.
class Solution {
    public void moveZeroes(int[] nums) {
        int k=0,i=0,temp;
        while(i<nums.length){
            if(nums[i]!=0){
                temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                k++;
            }
            i++;
        }
    }
}
//TC:O(N)
//SC:O(1)

//Problem 2:Rotate-array
https://leetcode.com/problems/rotate-array/
class Solution {
    public void reverse(int[] nums,int l,int r){
       while(l<r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;r--;
       }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }   
}
//TC:O(N)
//SC:O(1)
