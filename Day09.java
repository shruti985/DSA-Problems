//Problem 1:Two Sum
//https://leetcode.com/problems/two-sum/
import java.util.*;
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int[]ans=new int[2];
        while(i<nums.length){
            if(map.containsKey(target-nums[i])){
                 ans[0]=map.get(target-nums[i]);
                 ans[1]=i;
                 return ans;
            }
            else{
                map.put(nums[i],i);
            }
            i++;
        }
        return ans;
    }
}
//TC:O(n)
//SC:O(n)


//Problem 2:max score from subarray minimums
//https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0
class Solution2 {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        // Your code goes here
        int i=0;
         int j=i+1;
         int sum=0;
         int max=-1;
         while(j<arr.length){
             sum=arr[i++]+arr[j++];
             max=Math.max(sum,max);
         }
         return max;
    }
}
// SC:O(1);
// TC:O(N);


//Problem 3:Sort colors
//https://leetcode.com/problems/sort-colors/description/
class Solution3 {
    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        for(int i=0;i<zero;i++){
            nums[k]=0;
            k++;
        }
        for(int i=0;i<one;i++){
            nums[k]=1;
            k++;
        }
        for(int i=0;i<two;i++){
            nums[k]=2;
            k++;
        }

    }
}
// TC:O(n)
// SC:O(1)
