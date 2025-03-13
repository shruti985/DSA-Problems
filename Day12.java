//Problem 1:Binary Search
//https://leetcode.com/problems/binary-search/description/
class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]>target)
            end=mid-1;
            else
            start=mid+1;
        }
        return -1;
    }
}
//TC:O(logn)
//SC:O(1)

//Problem 2:https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = Left(nums, target);
        int right = Right(nums, target);
        return new int[] { left, right };
    }

    public int Left(int[] nums, int target) {
        int index = -1, low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                high = mid - 1;
            } else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return index;
    }

    public int Right(int[] nums, int target) {
        int index = -1, low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                low = mid + 1;
            } else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return index;
    }
}
//TC:O(logn)
//SC:O(1)


//Problem:https://leetcode.com/problems/search-insert-position/description/
class Solution {
    public int searchInsert(int[] nums, int target) {
                int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]>target)
            end=mid-1;
            else
            start=mid+1;
        }
        return start;
    }
}
//TC:O(logn)
//SC:O(1)
