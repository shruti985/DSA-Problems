//Problem:https://leetcode.com/problems/rearrange-array-elements-by-sign/
//Approach: Created an array ans of the same size as nums and initialized two variables, pos = 0 and neg = 1. Traversed nums, placed positive numbers at pos and negative numbers at neg, incrementing them by 2 each time to maintain their alternating order.

class Solution1 {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int pos=0,neg=1,i=0;
        while(i<nums.length){
            if(nums[i]>0 && pos<nums.length){
                ans[pos]=nums[i];
                pos=pos+2;
            }
            else if(nums[i]<0 && neg<nums.length){
                ans[neg]=nums[i];
                neg=neg+2;
            }
            i++;
        }
        return ans;
    }
}
// TC:O(N)
// SC:O(N)



//Problem:Best Time to buy and sell stock
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1570306944/
//Approach:Traversed through the array prices and at each iteration checked if we have the lesser buying price otherwise calculated the profit and
//updated maxpro if current profit was greater than maximum profit.
class Solution2 {
    public int maxProfit(int[] prices) {
        int price = prices[0];
        int maxpro = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<price) {
                price = prices[i];
            } else {
                int currentpro = prices[i] - price;
                maxpro = Math.max(currentpro, maxpro);
            }
        }

        return maxpro;
    }
}
//TC:O(N)
//SC:O(1)




//Problem:https://leetcode.com/problems/next-permutation/submissions/1570210316/
//NEXT PERMUTATION
class Solution3 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }  
}
//TC:O(N)
//SC:O(1)