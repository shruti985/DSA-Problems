//Problem:Search in rotated sorted array
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
class Solution {
    public int search(int[] nums, int target) {
        return BinarySearch(nums,target,0,nums.length-1);
    }

    public int BinarySearch(int[] arr,int target,int left,int right) {   
         if (left > right)
      return -1;
    int mid = left + ((right - left) / 2);
    if (arr[mid] == target)
      return mid;
    if (arr[mid] >= arr[left]) {
      if (arr[left] <= target && target <= arr[mid])
        return BinarySearch(arr, target, left, mid - 1);
      else
        return BinarySearch(arr, target, mid + 1, right);

    } else {
      if (arr[mid] <= target && target <= arr[right])
        return BinarySearch(arr, target, mid + 1, right);
      else
        return BinarySearch(arr, target, left, mid - 1);
    }
    }
}
// TC:O(logn)
//SC:O(1)
